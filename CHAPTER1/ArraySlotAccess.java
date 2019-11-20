import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

public class ArraySlotAccess
{
    public static void main(String[] args)
    {
        int[] array = new int[3]; //3 items

        out.print("Values: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = 1 + (int)(100*Math.random()); //1-100
            out.print(array[i] + " ");
        }

        array[0] = 6;
        array[1] = 9;
        array[2] = 80085;
        out.print("\nValues: ");
        printValues(array);

        int x = 0;
        array[x] = 0 + (int)(50*Math.random()); //0-49
        x = 1;
        array[x] = 0 + (int)(50*Math.random()); //0-49
        x = 2;
        array[x] = 0 + (int)(50*Math.random()); //0-49
        out.print("Values: ");
        printValues(array);



    }

    public static void printValues(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            out.print(array[i] + " ");
        }
        out.println();
    }
}