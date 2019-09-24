import java.util.Scanner;

public class booleanExpressions
{
    public static void main(String[] args)
    {
        double x,y;
        boolean a,b,c,d,e,f,equalsSixtyNine;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        x = input.nextDouble();
        System.out.print("Enter another number: ");
        y = input.nextDouble();

        System.out.println();

        a = (x < y); //less
        b = (x <= y); //less or equal
        c = (x == y); //equal
        d = (x != y); //not
        e = (x > y); //great
        f = (x >= y); //great or equal
        equalsSixtyNine = (x + y == 69); //==

        System.out.println(x + " is less than " + y + ": " + a);
        System.out.println(x + " is less than or equal to " + y + ": " + b);
        System.out.println(x + " is equal to " + y + ": " + c);
        System.out.println(x + " is not " + y + ": " + d);
        System.out.println(x + " is larger than " + y + ": " + e);
        System.out.println(x + " is larger than or equal to " + y + ": " + f);
        System.out.println(x + " plus " + y + " is 69: " + equalsSixtyNine);

        System.out.println();

        System.out.println( !(x < y) + " " + (x >= y) ); //! = not
        System.out.println( !(x <= y) + " " + (x > y) );
        System.out.println( !(x <= y) + " " + (x >= y) );
        System.out.println( !(x == y) + " " + (x != y) );
    }



}