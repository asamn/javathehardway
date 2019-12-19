import java.io.File;
import java.net.URL;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

/*SYMBOLS
-- set items
    x:y:z    x is item amount, y is the room it leads to, z is the room it can only be used in (-99 means any room)
%% mark rooms
@@ apply effects
UU uses items

*/

class Room
{
    int number, numExits;
    String name, description;
    String[] exits = new String[10]; //exits are words to type to do something
    int[] destinations = new int[10]; //destinations are what leads to room number/number
    String[] itemName = new String[10];
    int[] itemCount = new int[10];
    int[] itemGoesTo = new int[10];
    int totalItemTypes;

    boolean hasEffect;
    boolean effectRepeats;
    boolean effectUsed;
    String effectMessage;
    int effectDamage = 0;
    int effectGold = 0;

    boolean usesItem;
    String[] itemUsed = new String[10];
    int[] itemResult = new int[10];
    //go north:1    go north is tied to roomNumber 1, which leads to room 1

}

class Item
{
    int goesTo;
    String name;
    int count;
}

class NPC
{
    int HP = 100;
    int gold;
}

public class TextAdventureFinal
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(in);
        NPC player = new NPC();
        player.HP = 100;
        player.gold = 0;

        String fileName = "text-adventure-rooms.txt";
        File gameFile = new File(fileName);
        Scanner readFile = new Scanner(gameFile);

        int numRooms = readFile.nextInt();
        Room[] rooms = new Room[numRooms];
        int roomNum = 0;
        int previousRoom = 0;
        int lockedRooms = 0;

        Item[] inventory = new Item[64];
        int itemSlot = 0;//need to make same items stack

        for (int i = 0; i < inventory.length; i++)
        {
            inventory[i] = new Item();
            inventory[i].name = "NULL";
            inventory[i].count = 0;
            inventory[i].goesTo = 0;
        }

        while (readFile.hasNext())
        {
            Room r = createRoom(readFile);
            rooms[roomNum] = r;
            roomNum++;
        }

        String answer;
        int currentRoom = 0;

        while (currentRoom >= 0)
        {

            //out.println("PREVIOUS: " + previousRoom);
            Room current = rooms[currentRoom];

            out.println(current.name + " \n" + current.description);
            if (!current.itemName[0].equals("null"))
            {
                boolean hasItems = false;
                for (int i = 0; i < current.itemName.length; i++)
                {
                    if (current.itemCount[i] > 0)
                    {
                        hasItems = true;
                    }
                }
                if (hasItems)
                {
                    out.println("Here you see: ");
                    for (int i = 0; i < current.totalItemTypes; i++)
                    {
                        if (current.itemCount[i] > 0)
                        {
                            out.println("\t" + "x" + current.itemCount[i] + " " + current.itemName[i]);
                        }
                    }
                }
            }
            if (current.hasEffect && current.effectUsed == false)
            {
                if (current.effectRepeats == false)
                {
                    current.effectUsed = true;
                }
                if (!current.effectMessage.equals("NULL"))
                {
                    out.println(current.effectMessage);
                }
                int dmgGain = current.effectDamage;
                int goldGain = current.effectGold;
                if (dmgGain != 0)
                {
                    if (dmgGain < 0)
                    {
                        out.println("OOF! You lose " + dmgGain*-1 + " HP! ");
                    }
                    else if (dmgGain > 0)
                    {
                        out.println("You gain " + dmgGain + " HP!");
                    }
                    player.HP += dmgGain;
                    if (player.HP > 100)
                    {
                        player.HP = 100;
                    }
                }
                if (goldGain != 0)
                {
                    if (goldGain < 0)
                    {
                        out.println("You lost " + goldGain*-1 + " gold! ");
                    }
                    else if (goldGain > 0)
                    {
                        out.println("You gain " + goldGain + " gold! ");
                    }
                    player.gold += goldGain;
                    if (player.gold < 0)
                    {
                        player.gold = 0;
                    }
                }
            }
            if (player.HP <= 0)
            {
                out.println("You have died!") ;
                previousRoom = currentRoom;
                currentRoom = -1;
                break;
            }
            boolean found = false;
            boolean tookAction = false;
            do
            {
                if (current.exits[0].equals("AUTO")) //AUTO is always first
                {
                    tookAction = true;
                    found = true;
                    if (current.destinations[0] == 999)
                    {
                        currentRoom = previousRoom;
                    }
                    else
                    {
                        previousRoom = currentRoom;
                        currentRoom = current.destinations[0];
                    }
                    out.println("Press ENTER to continue ");
                    answer = input.nextLine();
                    break;
                }
                else
                {
                    out.print("> ");
                    answer = input.nextLine();
                }

                //if answer = use, split compare

                for (int i = 0; i < current.numExits; i++)
                {
                    if (current.exits[i].equalsIgnoreCase(answer))
                    {
                        tookAction = true;
                        found = true;
                        previousRoom = currentRoom;
                        currentRoom = current.destinations[i];
                    }

                }
                if (found == false)
                {
                    String[] splitAnswer = answer.split(" ");
                    String takenItem = "";
                    if (splitAnswer[0].equalsIgnoreCase("take") || splitAnswer[0].equalsIgnoreCase("grab"))
                    {
                        for (int i = 1; i < splitAnswer.length; i++)//separates take and item taken
                        {
                            takenItem = takenItem + splitAnswer[i];
                            if (i == splitAnswer.length-1)
                            {
                                //prevent extra space
                            }
                            else
                            {
                                takenItem = takenItem + " ";
                            }

                        }
                        //out.println(takenItem);
                        boolean tookItem = false;
                        for (int i = 0; i < current.totalItemTypes; i++)
                        {
                            //out.println("OBJECTIVE: "+ current.itemName[i]);
                            if (takenItem.equalsIgnoreCase(current.itemName[i]) && current.itemCount[i] > 0)
                            {
                                tookAction = true;
                                out.println("You take the " + current.itemName[i] + "\n");
                                current.itemCount[i]--;
                                tookItem = true;
                                boolean stackedItem = false;
                                for (int x = 0; x < inventory.length; x++)
                                {
                                    if (current.itemName[i] == inventory[x].name)
                                    {
                                        inventory[x].count++;
                                        stackedItem = true;
                                        break;
                                    }
                                }
                                if(!stackedItem)
                                {
                                    inventory[itemSlot] = new Item();
                                    inventory[itemSlot].name = current.itemName[i];
                                    inventory[itemSlot].count++;
                                    inventory[itemSlot].goesTo = current.itemGoesTo[i];
                                    itemSlot++;
                                    break;
                                }
                            }
                            else
                            {

                            }
                        }
                        if (!tookItem)
                        {
                            out.println("You can't take that! \n");
                        }
                    }
                    else if (answer.equalsIgnoreCase("inventory") || answer.equalsIgnoreCase("view inventory") || answer.equalsIgnoreCase("inv") || answer.equalsIgnoreCase("i"))
                    {
                        boolean foundItems = false;
                        out.println("--------------------------");
                        out.println("        INVENTORY          \n");
                        for (int i = 0; i < inventory.length; i++)
                        {
                            if (inventory[i].count > 0)
                            {
                                foundItems = true;
                                out.println("x" + inventory[i].count + " " + inventory[i].name + " ");
                            }

                        }
                        if (!foundItems)
                        {
                            out.println("You own nothing! \n");
                        }

                    }
                    else if (splitAnswer[0].equalsIgnoreCase("use"))
                    {
                        String usedItem = "";

                        for (int i = 1; i < splitAnswer.length; i++)
                        {
                            usedItem = usedItem + splitAnswer[i];
                            if (i == splitAnswer.length-1)
                            {
                                //prevent extra space
                            }
                            else
                            {
                                usedItem = usedItem + " ";
                            }
                        }
                        boolean useItem = false;



                        for (int i = 0; i < inventory.length; i++)
                        {
                            if (usedItem.equalsIgnoreCase(inventory[i].name) && inventory[i].count > 0)
                            {
                                useItem = true;
                                tookAction = true;
                                out.println("You use the " + inventory[i].name);
                                inventory[i].count--;
                                previousRoom = currentRoom;
                                if (current.usesItem)
                                {
                                    for (int x = 0; x < current.itemUsed.length;x++)
                                    {
                                        if (current.itemUsed[x].equalsIgnoreCase(usedItem))
                                        {
                                            currentRoom = current.itemResult[x];
                                            break;
                                        }
                                    }
                                }
                                else
                                {
                                    currentRoom = inventory[i].goesTo;
                                }
                                break;
                            }
                        }

                        if (!useItem)
                        {
                            out.println("You can't use that! ");
                        }

                    }
                    else if (answer.equalsIgnoreCase("stats") || answer.equalsIgnoreCase("stat") || answer.equalsIgnoreCase("view stats"))
                    {
                        out.println("-----");
                        out.println("STATS");
                        out.println("HP: " + player.HP);
                        out.println("GOLD: " + player.gold);

                    }
                    else
                    {
                        out.println("You can't do that");
                    }
                    //if answer = take, split by space compare strings
                    //if item goes to -1 it cant be used unless the z value goes to a specific room

                }
            }
            while (!tookAction);
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }


    public static Room createRoom(Scanner read)
    {
        /* SCANNING ORDER OF ROOM PROPERTIES TOP TO BOTTOM
        %%
        --
        @@
        UU
        %%
        */
        Room r = new Room();
        String line;
        boolean hasItems = false;
        boolean appliesEffect = false;
        boolean useItem = false;

        if (! read.hasNextInt()) //if no int found
        {
            return null;
        }
        else
        {
            r.number = read.nextInt();
            read.nextLine(); //goes to next line after room number

            r.name = read.nextLine();
            r.description = "";

            while (true) //ends in code itself
            {
                line = read.nextLine();
                if (line.equals("%%"))
                {
                    break; //percentages are what marks the end of the description
                }
                r.description = r.description + line + "\n";

            }

            int i = 0;
            while (true)
            {
                line = read.nextLine();
                if (line.equals("%%"))
                {
                    break;
                }
                if (line.equals("--"))
                {
                    hasItems = true;
                    break; //breaks from loop of setting exits
                }
                if (line.equals("@@"))
                {
                    appliesEffect = true;
                    break;
                }
                if (line.equals("UU"))
                {
                    useItem = true;
                    break;
                }

                String[] parts = line.split(":"); //splits string by :, puts results in go north:1 to go north 1, with parts[0] being the first half, parts[1] being the other half
                r.exits[i] = parts[0];
                r.destinations[i] = Integer.parseInt(parts[1]); //parse int because parts is a string

                i++;
            }

            int x = 0;
            if (hasItems)
            {
                x = 0;
                while (true)
                {
                    line = read.nextLine();

                    if (line.equals("%%"))
                    {
                        break;
                    }
                    if (line.equals("@@")) //rooms could have more than one properties; but they should be ordered in the text file
                    {
                        appliesEffect = true;
                        break;
                    }
                    if (line.equals("UU"))
                    {
                        useItem = true;
                        break;
                    }
                    String[] parts = line.split(":");
                    r.itemName[x] = parts[0];
                    r.itemCount[x] = Integer.parseInt(parts[1]);
                    r.itemGoesTo[x] = Integer.parseInt(parts[2]);
                    x++;
                    r.totalItemTypes = x;
                }
            }
            else
            {
                r.itemName[0] = "null";
            }

            if (appliesEffect)//amount, type, repeats 0 means no 1 means yes
            {
                while (true)
                {
                    line = read.nextLine();
                    String[] parts = line.split(":");
                    if (line.equals("%%"))
                    {
                        break;
                    }
                    if (line.equals("UU"))
                    {
                        useItem = true;
                        break;
                    }
                    r.hasEffect = true;
                    if (Integer.parseInt(parts[2]) == 1)
                    {
                        r.effectRepeats = true;
                    }
                    if (parts[1].equals("HP"))
                    {
                        r.effectDamage = Integer.parseInt(parts[0]);
                    }
                    if (parts[1].equals("GOLD"))
                    {
                        r.effectGold = Integer.parseInt(parts[0]);
                    }
                    r.effectMessage = parts[3];
                }
            }
            if (useItem)
            {
                int y = 0;
                while (true)
                {
                    line = read.nextLine();
                    String[] parts = line.split(":");
                    if (line.equals("%%"))
                    {
                        break;
                    }
                    r.usesItem = true;
                    r.itemUsed[y] = parts[0];
                    r.itemResult[y] = Integer.parseInt(parts[1]);
                    y++;
                }
            }

            r.numExits = i;
            return r;
        }

    }

}