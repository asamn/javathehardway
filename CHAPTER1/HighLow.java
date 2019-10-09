import java.util.Scanner;

public class HighLow
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int guess, number, difference = 0, differencePrevious = 0, attempts = 1;

        number = 1 + (int)(100 * Math.random());
        System.out.println("Guess a number between 1-100");
        guess = input.nextInt();

        while (guess != number) //if guess is not number
        {
            if (guess <= 0 || guess > 100)
            {
                System.out.println("Please enter 1-100");
                guess = input.nextInt();
            }
            else
            {
                difference = number - guess;
                if (difference < 0)//if you guess higher than target the difference will turn negative
                {
                    difference = difference * -1;
                }
                if (differencePrevious < 0)
                {
                    differencePrevious = differencePrevious * -1;
                }
                if (differencePrevious == 0) //for first guesses, does nothing if difference is same, 2 has same diffference as 18 if the target is 10
                {
                    //do nothing
                }

                else if (difference < differencePrevious)
                {
                    System.out.print("You're getting warmer... ");
                }
                else if (difference > differencePrevious)
                {
                    System.out.print("You're getting colder... ");
                }

                if (guess > number)
                {
                    System.out.println("You guessed too high!");
                }
                if (guess < number)
                {
                    System.out.println("You guessed too low!");
                }

                System.out.println("Try again");
                attempts++;
                differencePrevious = difference;
                guess = input.nextInt();

            }
        }
        System.out.print("\nCongrats! It took you " + attempts + " attempts!");
        if (attempts == 1)
        {
            System.out.print("\b\b!");//attempt!
        }
    }
}

//3 -> 5
//10-5 = 5 <-  lower difference
//10-3 = 7 <-  higher difference
//target 10
//if lower difference -> warmer else colder
