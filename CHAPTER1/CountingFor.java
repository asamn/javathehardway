import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class CountingFor
{
    public static void main (String[] args) throws Exception
    {
        Scanner input = new Scanner(in);
        int n;
        String output;

        out.print("Enter a message to display five times: ");
        output = input.next();

        for (n = 1; n <= 5; n++)
        {
            out.println(output);
        }

        out.println("Ten times counting by 5");
        for (n = 5; n <= 50; n = n + 5)
        {
            out.print(n + "\t");
            out.println(output);
        }



        out.println("Three times backwards ");
        for (n = -1; n >= -3; n--)
        {
            out.print(n + "\t");
            out.println(output);
        }



    }
}