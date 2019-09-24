import java.util.Scanner;

public class VariableChangeShortcuts
{
    public static void main (String[] args)
    {
        int a, b, c;

        a = 5;
        b = 5;
        c = 5;
        System.out.println("a: " + a + "\tb: " + b + "\tc: " + c);
        a = a + 3;
        b = b - 3;
        c = c * 3;
        System.out.println("a: " + a + "\tb: " + b + "\tc: " + c + "\n");



        a = 5;
        b = 5;
        c = 5;
        System.out.println("a: " + a + "\tb: " + b + "\tc: " + c);
        a += 3;
        b -= 3;
        c *= 3;
        System.out.println("a: " + a + "\tb: " + b + "\tc: " + c + "\n");



        a = b = c = 5;
        System.out.println("a: " + a + "\tb: " + b + "\tc: " + c);
        a += 1;
        b -= 2;
        c *= 3;
        System.out.println("a: " + a + "\tb: " + b + "\tc: " + c + "\n");



        a = b = 5;
        System.out.println("a: " + a + "\tb: " + b);
        a =+ 1; //equal positive one
        b =- 2; //equal negative two
        System.out.println("a: " + a + "\tb: " + b + "\n");



        a = b = 5;
        System.out.println("a: " + a + "\tb: " + b);
        a++;
        b++;
        System.out.println("a: " + a + "\tb: " + b + "\n");


    }


}