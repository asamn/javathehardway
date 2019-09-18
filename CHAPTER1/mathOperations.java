import java.util.Scanner;

/* a = 10, b = 27, x = 1.1, one = dog, two = house */

public class mathOperations
{
public static void main (String[] args )
{
    Scanner input = new Scanner(System.in);

    int a, b, c, d, e, f, g;
    double x, y, z;
    String one, two, both;

    System.out.print("A ");
    a = input.nextInt();

    System.out.print("B ");
    b = input.nextInt();

    c = a + b;

    d = a - b;

    e = (a + b) * 3;

    f = b / 2;

    g = b % 10;

    System.out.print("X ");
    x = input.nextDouble();

    y = x*x;

    z = b / 2;

    System.out.print("One ");
    one = input.next();

    System.out.print("Two ");
    two = input.next();

    both = one + two;

    System.out.println("");
    System.out.println("a is " + a + ", b is " + b + ", x is " + x + ", one is " + one + ", two is " + two + ".");
    System.out.println("a + b is " + c);
    System.out.println("a - b is " + d);
    System.out.println("(a + b) * 3 is " + e);
    System.out.println("b / 2 is " + f);
    System.out.println("b % 10 is " + g);
    System.out.println("x*x is " + y);
    System.out.println("b / 2 is " + z);
    System.out.println("one is " + one + ", while two is " + two + ". one and two is " + one + two + ".");
    System.out.println( both );



}

}