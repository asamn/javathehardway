import java.util.Scanner;

public class SafeSquareRoot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double number, root;
        String answer;

        System.out.println("Are you ready?!?");
        answer = input.next();
        while (!answer.equalsIgnoreCase("YES"))
        {
            System.out.println("Are you ready?!?");
            answer = input.next();
        }
        System.out.print("Enter a number to square root: ");
        number = input.nextDouble();

        while (number < 0)
        {
        System.out.print("You can't square root a negative, dummy thick. \nEnter a number to square root: ");
        number = input.nextDouble();
        }
        root = Math.sqrt(number);

        System.out.println("The square root of " + number + " is " + root);
    }
}