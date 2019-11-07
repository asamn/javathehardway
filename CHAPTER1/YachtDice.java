import java.util.Scanner;
import static java.lang.System.*;
public class YachtDice
{
    public static void main(String[] args)
    {
        int r1,r2,r3,r4,r5, rolls = 0, tries = 0, averageRolls = 0, totalRolls = 0;
        boolean allSame = false, stand = false;
        String answer;
        Scanner input = new Scanner(in);
        while (stand == false)
        {
            rolls = 0;
            allSame = false;
            do
            {
                rolls++;
                r1 = 1 + (int)(Math.random()*6);
                r2 = 1 + (int)(Math.random()*6);
                r3 = 1 + (int)(Math.random()*6);
                r4 = 1 + (int)(Math.random()*6);
                r5 = 1 + (int)(Math.random()*6);

                out.print("\n\nYou rolled: " + r1);
                out.print(" " + r2);
                out.print(" " + r3);
                out.print(" " + r4);
                out.println(" " + r5);

                showDice(r1); //parentheses set int roll     (r1) = (int roll)
                showDice(r2);
                showDice(r3);
                showDice(r4);
                showDice(r5);

                if (r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5)
                {
                    allSame = true;
                }
            }
            while (allSame == false);

            tries++;
            totalRolls = totalRolls + rolls;
            averageRolls = totalRolls / tries;

            System.out.println("The Yacht!!");
            System.out.println("Rolls: " + rolls);
            out.println("Tries: " + tries);
            out.println("Average Rolls: " + averageRolls);
            answer = input.next();
            if(answer.equalsIgnoreCase("s"))
            {
                stand = true;
            }
        }
    }

    public static void showDice(int roll) //roll set(r1) = (int roll)
    {
        out.println("+-----+");

        switch(roll)
        {
            case(1):
                out.println("|     |");
                out.println("|  O  |");
                out.println("|     |");
                break;


            case(2):
                out.println("|O    |");
                out.println("|     |");
                out.println("|    O|");
                break;

            case(3):
                out.println("|O    |");
                out.println("|  O  |");
                out.println("|    O|");
                break;

            case(4):
                out.println("|O   O|");
                out.println("|     |");
                out.println("|O   O|");
                break;

            case(5):
                out.println("|O   O|");
                out.println("|  O  |");
                out.println("|O   O|");
                break;

            case(6):
                out.println("|O   O|");
                out.println("|O   O|");
                out.println("|O   O|");
                break;

            default:
                out.println("+-----+");
                break;

        }
        out.println("+-----+");


    }
}