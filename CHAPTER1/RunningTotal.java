import java.util.Scanner;

public class RunningTotal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int current, total = 0;
        System.out.println("Enter some numbers to add up. It will stop adding at zero.");
        do
        {
            System.out.print("\nAdd: ");
            current = input.nextInt();
            total = total + current;
            System.out.println("Total so far: " + total);

        }
        while(current != 0);
        System.out.println("\nTotal: " + total);

    }

}