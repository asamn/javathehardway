import java.util.Scanner;

public class RandomNumbers
{
    public static void main(String[] args)
    {
        int rpsChoice, a, b, c, d;
        double rps, rng;
        String rockPaperScissor;
        Scanner input = new Scanner(System.in);


        System.out.println("1. Rock  2. Paper  3. Scissors?");
        rpsChoice = input.nextInt();

        if (rpsChoice <= 0 || rpsChoice >= 4)
        {
                System.out.println("You didn't choose something, I'll choose for you.");
                rpsChoice = 1 + (int)(3*Math.random());
        }

        switch(rpsChoice)
        {
            case 1:
                rockPaperScissor = "rock";
                break;
            case 2:
                rockPaperScissor = "paper";
                break;
            case 3:
                rockPaperScissor = "scissors";
                break;
            default:
                rockPaperScissor = "ROCKPAPERSCISSOR";
                break;

        }
        System.out.println("You chose " + rockPaperScissor + ".");

        rps = (Math.random()); //math random generates between 0 - 1

        if (rps < 0.3333333)
        {
            System.out.println("Your opponent chose rock... ");
            if (rpsChoice == 1) //rock
            {
                System.out.println("TIE! ");
            }
            else if (rpsChoice == 2) //paper
            {
                System.out.println("YOU WIN! ");
            }
            else if (rpsChoice == 3) //scissors
            {
                System.out.println("LOSER! ");
            }
            else
            {
                System.out.println("ERROR! ");
            }
        }

        else if (rps < 0.6666667)
        {
            System.out.println("Your opponent chose scissors... ");
            if (rpsChoice == 1) //rock
            {
                System.out.println("YOU WIN! ");
            }
            else if (rpsChoice == 2) //paper
            {
                System.out.println("LOSER! ");
            }
            else if (rpsChoice == 3) //scissors
            {
                System.out.println("TIE! ");
            }
            else
            {
                System.out.println("ERROR! ");
            }
        }

        else
        {
            System.out.println("Your opponent chose paper... ");
            if (rpsChoice == 1) //rock
            {
                System.out.println("LOSER! ");
            }
            else if (rpsChoice == 2) //paper
            {
                System.out.println("TIE! ");
            }
            else if (rpsChoice == 3) //scissors
            {
                System.out.println("YOU WIN! ");
            }
            else
            {
                System.out.println("ERROR! ");
            }
        }

        System.out.println("\n");

        a = (int)(9 * Math.random() ); //9*Math.random generates 0-8, + 1 changes it to 1-9, 0-8 is 9 possibilites, 1-9 is also 9 possibilites
        System.out.println("0-8: " + a);

        b = 1 + (int)(9 * Math.random() );
        System.out.println("0-8: " + a);



    }
}
