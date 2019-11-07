import java.util.Scanner;
import static java.lang.System.*;

public class HeronsFormula
{
    public static void main(String[] args)
    {
        double a, b;
        String tri = "A triangle with sides ";

        a = findArea(3,3,3); //a, b, c
        b = findArea(13,30,21);

        out.println(tri + "3,3,3 has area of " + a);
        out.println(tri + "13,30,21 has area of " + b);

        out.println(tri + "6,6,6 has area of " + findArea(6,6,6));

    }

    public static double findArea(int a, int b, int c)
    {
        double semiPerimeter, area;

        semiPerimeter = (a + b + c) / 2;

        area = Math.sqrt(semiPerimeter * (semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));

        return area;
    }
}
  /*Why did you create a variable called tws and store words in it? Why not just put those
    words directly between the quotes in the println() statement?
    It’s a dumb reason: if I hadn’t done that, lines 15-17 would have been too long for
    the print version of this book.
    */
