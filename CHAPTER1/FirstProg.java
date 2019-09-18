import java.util.Scanner;

public class FirstProg
{



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String name, date;

        System.out.println("Enter ur name");
        name = input.next();
        System.out.println("Enter the date");
        date = input.next();
        System.out.println();

        System.out.println("I am " + name + ", determined to learn how to code.");


        System.out.println("Today's date is" + " " + date + ".");


    }



}

