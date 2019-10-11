import java.util.Scanner;

public class CoinFlip
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String coin, choice, answer;
        int streaks = 0;
        boolean head, choseHead;

        do
        {
            head = Math.random() < 0.5;

            System.out.print("Heads or tails? ");
            choice = input.next();

            if (choice.equalsIgnoreCase("h") || choice.equalsIgnoreCase("heads") || choice.equalsIgnoreCase("head"))
            {
                choice = "HEADS";
            }
            else if (choice.equalsIgnoreCase("t") || choice.equalsIgnoreCase("tails") || choice.equalsIgnoreCase("tail"))
            {
                choice = "TAILS";
            }
            else
            {
                choice = "TAILS";
            }


            if (head) //if head = true
            {
                coin = "HEADS";
            }
            else
            {
                coin = "TAILS";
            }
            System.out.println("You got " + coin);

            if (coin.equals(choice))
            {
                streaks++;
            }
            else
            {
                streaks = 0;
            }
            System.out.println("Your streaks: " + streaks);
            System.out.print("Keep going? Y/N ");
            answer = input.next();

        }
        while (!answer.equalsIgnoreCase("n"));

        System.out.println("\nStreaks: " + streaks);
    }

}