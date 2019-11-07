import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class GettingFromFile
{
    public static void main (String[] args) throws Exception//declared to be thrown
    {
        Scanner input = new Scanner(System.in);
        String fileName = "NumberAndNames.txt";
        Scanner readFile = new Scanner(new File (fileName));
        String name;
        int x,y,z,sum;

        name = readFile.nextLine();
        x = readFile.nextInt();
        y = readFile.nextInt();
        z = readFile.nextInt();
        sum = x+y+z;
        System.out.println(x + " + " + y + " + " + z + " = " + sum);
        System.out.println("Your name: " + name);



    }

}