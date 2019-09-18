import java.util.Scanner;

public class forgetfulMachine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What's the capital of Detroit?");
        input.next();

        System.out.println("What's 6 times 9?"); /*the question blows up when i type pee pee */
        input.nextInt();

        System.out.println("Enter a number between 1.00 and 100.00."); /*the question blows up when i type danny diviteo */
        input.nextDouble();

        System.out.println("What color underwear am I wearing?");
        input.next();
    }
}