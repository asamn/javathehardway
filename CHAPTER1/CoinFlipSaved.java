import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CoinFlipSaved
{
    public static void main (String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        String coin, choice = "", highName = "", answer, fileName = "coinFlipScores.txt";
        int streaks = 0, highScore = 0;
        File score = new File(fileName);//score file


        boolean heads;

        if (score.exists() && score.length() > 0)
        {
            Scanner readFile = new Scanner(score);
            highName = readFile.nextLine();
            highScore = readFile.nextInt();
            System.out.println("HIGHSCORE");
            System.out.println(highName.toUpperCase() + " - " + highScore) + "\n";
        }

        else
        {
            System.out.println("File doesn't exist");
        }

        do
        {
            heads = Math.random() > 0.5;
            if (heads)
            {
               coin = "HEADS";
            }

            else
            {
                coin = "TAILS";
            }

            System.out.print("Heads or tails? ");
            do
            {
                answer = input.next();

                if (answer.equalsIgnoreCase("h") || answer.equalsIgnoreCase("heads"))
                {
                    choice = "HEADS";
                }
                else if (answer.equalsIgnoreCase("t") || answer.equalsIgnoreCase("tails"))
                {
                    choice = "TAILS";
                }
                else
                {
                    //System.out.println("ERROR");
                }
            }
            while (!choice.equals("HEADS") && !choice.equals("TAILS"));
            System.out.println("You picked " + choice + ". Flipped " + coin + "!");

            if (choice.equalsIgnoreCase(coin))
            {
                streaks++;
                System.out.println("Streaks: " + streaks);
                System.out.print("Flip again? ");
                do
                {
                    answer = input.next();
                }
                while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("no"));
            }
            else
            {
                streaks = 0;
                System.out.println("YOU LOSE");
                break;
            }
        }
        while(!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("no"));

        System.out.println("Streaks: " + streaks);

        if (streaks > highScore)
        {
            System.out.print("NEW HIGHSCORE! \nEnter your name: ");
            highName = input.next();
            highScore = streaks;
        }
        else if (streaks == highScore)
        {
            String tempName1, tempName2 = highName;
            System.out.println("You tied with \"" + highName + "!\"" );
            System.out.print("Enter your name: ");
            tempName1 = input.next();
            tempName2 = highName;
            highName = tempName1 + " contended with " + tempName2; //x contended with y, z contended with x contended with y if three equal scores
            System.out.println(highName);
        }
        else
        {
            System.out.println("You didn't beat the high score- loser!!!");
        }
        PrintWriter outFile = new PrintWriter(score); //print writes to score file, cant be placed on top of code
        outFile.println(highName);
        outFile.println(highScore);
        outFile.close();


    }
}