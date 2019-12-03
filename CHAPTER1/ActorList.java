import java.io.File;
import java.net.URL;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

class Actor
{
    String name;
    String role;
    String date;
}



public class ActorList
{
    public static void main(String[] args) throws Exception //throws used when finding/reading files
    {
        String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
        File actorFile = new File ("ActorList.txt");
        int actorCount = 0, fileActorCount = 0, totalActorCount = 0;

        Scanner readText = new Scanner ( (new URL(url) ).openStream() );
        Scanner readFileText = new Scanner (actorFile);


        while (readText.hasNext()) //while scanner has text to read;
        {
            Actor a = getActor(readText); //reads three lines and prints them at once
            actorCount++;
            out.println("Name: " + a.name + "\nRole: " + a.role + "\nBirthdate: " + a.date + "\n");
        }
        readText.close();
        while (readFileText.hasNext())
        {
            Actor a = getFileActor(readFileText);
            fileActorCount++;
           out.println("Name: " + a.name + "\nRole: " + a.role + "\nBirthdate: " + a.date + "\n");
        }
        readFileText.close();

        readText = new Scanner ( (new URL(url) ).openStream() );//reopens scanners to re-read
        readFileText = new Scanner (actorFile);
        totalActorCount = fileActorCount + actorCount;
        Actor[] actorArray = new Actor[totalActorCount];
        out.println("Now, their names in alphabetical order.");

        actorArray = createArray(readText, readFileText, totalActorCount, actorCount, actorArray);
        String[] orderedNames = new String[totalActorCount];

        orderedNames = createOrder(totalActorCount, actorArray, orderedNames);

        for (int i = 0; i < orderedNames.length;i++)
        {

            out.println(orderedNames[i]);
        }

    }

    public static Actor getActor(Scanner readText) //returns actor object
    {
        Actor a = new Actor();

        a.name = readText.nextLine();
        a.role = readText.nextLine();
        a.date = readText.nextLine();
        return a; //returns entire object

    }

    public static Actor getFileActor(Scanner readFileText) //returns actor object
    {
        Actor a = new Actor();

        a.name = readFileText.nextLine();
        a.role = readFileText.nextLine();
        a.date = readFileText.nextLine();
        return a; //returns entire object

    }

    public static Actor[] createArray(Scanner readText, Scanner readFileText, int totalActorCount, int actorCount, Actor[] actorArray)
    {

        for (int i = 0; i < totalActorCount; i++)
        {

           if (i >= actorCount) //reads off of file if read all of URL text
           {
              actorArray[i] = getFileActor(readFileText);
           }
           else
           {
               actorArray[i] = getActor(readText);
           }

           //out.println(actorArray[i].name);
        }
        return actorArray;

    }

    public static String[] createOrder(int totalActorCount, Actor[] actorArray, String[] orderedNames)
    {
        String largest;
        int n = actorArray.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)//scans all strings after i
            {
                if (actorArray[i].name.compareTo(actorArray[j].name)>0)//compare to next strings in array
                {
                    largest = actorArray[i].name;
                    actorArray[i].name = actorArray[j].name;//puts the firstest to the beginning of array
                    actorArray[j].name = largest; //sets the string that was replaced to be dealt with later
                }
            }
            /* alpha loop
            i[0] -- bbb
            i[1] -- ccc
            i[2] -- aaa
            i=0     j = 1   compare bbb(i=0) to ccc(j=1), bbb is not higher than ccc, so dont move anything, j++        compare bbb(i=0) to aaa(j=2), bbb is higher so aaa goes to i[0] and bbb goes to i=2
            i=1     j = 2 (i+1)   compare ccc(i=1) to bbb(i=2), ccc is higher so bbb and ccc switch place
    */
        }

        for (int i = 0; i < n; i++)
        {
            orderedNames[i] = actorArray[i].name;
        }

        return orderedNames;
    }
}