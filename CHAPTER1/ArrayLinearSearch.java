import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

public class ArrayLinearSearch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        int[] listNumbers = {14434, 13370, 71337, 85034, 55555, 66610, 63552, 80085 }; //int cannot start with 0
        int inputNumber = 0;
        boolean found = false;

        out.println(listNumbers.length + " numbers found:");

        for (int i : listNumbers) //for each item in array
        {
            out.print(i + " ");
        }

        out.print("\nEnter a number to find: ");
        inputNumber = input.nextInt();

        for (int i : listNumbers)
        {
            if (inputNumber == i)
            {
                out.println("Number found! " + i);
                found = true;
            }
        }
        if (!found)
        {
            out.println("Number not found! " + inputNumber);
        }

    }

}