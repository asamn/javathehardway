import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

public class NestingLoops
{
    public static void main(String[] args)
    {
        char letter;
        int x, y;

        for (letter = 'A'; letter <'F'; letter++)
        {
            for (int i = 1; i <= 5; i++) //adds after letter
            {
            out.println(letter + " " + i);
            }
        }
        for (x = 1; x <=10; x++)
        {
            for (y = 1; y <=3; y++)
            {
                out.print("(" + x + "," + y + ")" + "\t");
                if (x == 5 && y == 3)
                {
                    out.print("\n");
                }
            }

        }

    }

}