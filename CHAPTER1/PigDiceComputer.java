import java.util.Scanner;
import static java.lang.System.*;
public class PigDiceComputer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        int roll, total = 0, turn = 1;

        do
        {
            roll = 1 + (int)(6 * Math.random()); //1-6
            if (roll == 1 )
            {
                out.print("Opponent rolled " + roll);
                total = 0;
                turn = 0; //players turn
            }
            else if (roll != 1 && total < 20)
            {
                out.println("Opponent rolled " + roll);
                total = total + roll;
                out.println("\tOpponent's total: " + total);
            }
            if (total >= 20)// goes after finding total
            {
                out.print("Total equals or is greater than 20");
                turn = 0;
            }

        }
        while (turn == 1);
        out.println(". Turn end. ");
        out.println("Opponent's total: " + total);

    }

}