import java.util.Scanner;

public class ComparingNumbers
{
    public static void main(String[] args)
    {
        double x,y;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        x = input.nextDouble();
        System.out.print("Enter another number: ");
        y = input.nextDouble();

        if (x < y)
        {
            System.out.println(x + " is less than " + y);
        }
        if (x <= y)
        {
            System.out.println(x + " is less than or equal to " + y);
        }
        if (x == y)
        {
            System.out.println(x + " is equal to " + y);
        }
        if (x > y)
        {
            System.out.println(x + " is larger than " + y);
        }
        if (x >= y)
        {
            System.out.println(x + " is larger than or equal to " + y);
        }
        if (x != y)
        {
            System.out.println(x + " is not " + y);
        }
        if (x + y == 69)
        {
            System.out.println(x + " plus " + y + " is sixty-nine ");
        }
        if (x - y == 69)
        {
            System.out.println(x + " minus " + y + " is sixty-nine ");
        }
    }

}