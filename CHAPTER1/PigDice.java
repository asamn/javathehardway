import java.util.Scanner;
import static java.lang.System.*;
public class PigDice
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        int roll, total = 0, turn = 1, opponentTotal = 0, turnTotal = 0, round = 1, aiDifficulty = 0, aiChance = 0, aiHoldMinRange = 0, aiHoldMaxRange = 0, aiHoldChance = 0;
        boolean aiRiskMode = true; //if ai is close to 100, it wont take any risks to be ahead
        String answer = "";


        out.println("Choose your difficulty\n\tEasy\n\tMedium\n\tHard");
        answer = input.next();
        while (aiDifficulty <= 0)
        {
            if (answer.equalsIgnoreCase("e") || answer.equalsIgnoreCase("easy"))
            {
                aiDifficulty = 1;
                aiHoldMinRange = 5;
                aiHoldMaxRange = 20;
                aiHoldChance = 10;
            }
            else if (answer.equalsIgnoreCase("m") || answer.equalsIgnoreCase("medium"))//hold ranges determines how careful ai is
            {
                aiDifficulty = 2;
                aiHoldMinRange = 16;
                aiHoldMaxRange = 20;
                aiHoldChance = 3; //1 in 2
            }
            else if (answer.equalsIgnoreCase("h") || answer.equalsIgnoreCase("hard"))
            {
                aiDifficulty = 3;
                aiHoldMinRange = 14;
                aiHoldMaxRange = 20;
                aiHoldChance = 2; //1 in 2 also includes risk sensing
            }
            else
            {
                out.println("INVALID RESPONSE");
                answer = input.next();
            }
        }


        while (total < 100 && opponentTotal < 100) //or means opponent could be 9999 but player could be 1 so it still runs
        {
            out.println("\n\nROUND " + round);
            out.println("Your Turn ");
            out.println("Your total: " + total);
            do
            {
                roll = 1 + (int)(6 * Math.random());
                if (roll == 1 )
                {
                    out.print("\tYou rolled a " + roll + ". ");
                    turnTotal = 0;
                    turn = 1;
                }

                else if (roll != 1 && turnTotal < 20)
                {
                    out.println("\tYou rolled " + roll);
                    turnTotal = turnTotal + roll;
                    out.println("\tYour turn's total: " + turnTotal);

                    out.print("Roll again? Y/N ");
                    answer = input.next();
                    if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n"))
                    {
                        turn = 1;
                    }
                    else
                    {
                        turn = 0;
                    }

                }

                if (turnTotal >= 20)
                {
                    out.print("Total equals or is greater than 20. ");
                    turn = 1;
                }
            }
            while (turn == 0);
            total = total + turnTotal;
            out.println("Turn end. ");
            turnTotal = 0;
            out.println("Your total: " + total + "\n");

            out.println("Opponent's Turn");
            out.println("Opponent's total: " + opponentTotal);
            do
            {
                roll = 1 + (int)(6 * Math.random()); //1-6
                if (roll == 1 )
                {
                    out.print("\tOpponent rolled " + roll + " ");
                    turnTotal = 0;
                    turn = 0; //players turn
                }

                else if (roll != 1 && turnTotal < 20)
                {
                    out.println("\tOpponent rolled " + roll);
                    turnTotal = turnTotal + roll;
                    out.println("\tOpponent's turn's total: " + turnTotal);
                }


                if (turnTotal > aiHoldMinRange && turnTotal < aiHoldMaxRange)//if total is a high number, ai wouldnt want to lose a high number by rolling a one
                {

                    aiChance = 1 + (int)(aiHoldChance * Math.random());
                    if (aiRiskMode = false)
                    {
                        aiChance = 1; //always hold if
                    }
                    if (aiChance == 1)
                    {
                        out.print("Your opponent decided to hold. ");
                        turn = 0;
                    }
                }

                if (turnTotal >= 20)// goes after finding total
                {
                    out.print("Total equals or is greater than 20. ");
                    turn = 0;

                }
                if (opponentTotal >= 80 && aiDifficulty == 3)//only for hard AI
                {
                    aiRiskMode = false;
                    aiHoldMinRange = 1;
                }

            }
            while (turn == 1);
            opponentTotal = opponentTotal + turnTotal;
            out.println("Turn end. ");
            turnTotal = 0;
            out.println("Opponent's total: " + opponentTotal + "\n");

            round++;
            out.println("Enter any key to continue. ");//prevents losing streak spam
            answer = input.next();
//goes back to top while totals are less than 100
        }

        out.println("\n\nGAME END");
        if (total > opponentTotal)
        {
            out.println("YOU WIN BY " + (total - opponentTotal) + " POINTS!");
        }
        else
        {
            out.println("YOU LOSE BY " + (opponentTotal - total) + " POINTS!");
        }


    }

}