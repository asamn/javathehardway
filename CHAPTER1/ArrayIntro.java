import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

public class ArrayIntro
{
    public static void main(String[] args)
    {
        String[] planetList = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

        for (String output : planetList) //: means do for each item in array
        {
            out.print(output.toUpperCase() + "\t");
            out.print("\t");
            for (int i = 0; i < output.length(); i++)//does this in each word
            {
                output = output.toLowerCase();// makes all lower
                char c = output.charAt(i);
                if (i%2 != 0) //if odd number
                {
                    c = Character.toUpperCase(c);
                }

                out.print(c);
            }
            out.print("\t\t");

            for (int i = 0; i < output.length(); i++)
            {
                output = output.toUpperCase();
                char c = output.charAt(i);
                if (c == 'I')
                {
                    c = Character.toLowerCase(c);
                }
                out.print(c);
            }
            out.print("\t\t");

            boolean boolWord = false;
            for (int i = 0; i < output.length(); i++)
            {
                output = output.toLowerCase();
                char c = output.charAt(i);
                if (output.charAt(i) == 'a' && output.charAt(i + 1) == 'n' && output.charAt(i + 2) == 'u' && output.charAt(i + 3) == 's') //profanity filter
                {
                    boolWord = true;
                }
                if (boolWord)
                {
                    c = Character.toUpperCase(c);
                }
                out.print(c);
            }
            out.print("\n"); //new line for each word
        }

    }

}



