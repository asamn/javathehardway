import java.util.Scanner;


public class AgeMessages
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int age;
        double height;

        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your height in inches: ");
        height = input.nextDouble();

        if ( height < 60 && age > 5 && age < 120)//too short for life
        {
            age = 5;
            System.out.println("You're short? That must mean you're like five. ");
        }
        else if ( height <= 0 )
        {
            age = 0;
        }

        System.out.println("You should be: ");
        if ( age <= 0 || age > 120)
        {
            System.out.println("\tnot existing");
        }
        else
        {

            if ( age < 6 )
            {
                System.out.println("\tcoloring in coloring books");
            }
            if ( age < 10 )
            {
                System.out.println("\tplaying Fortnite");
            }
            if ( age < 13 )
            {
                System.out.println("\ttoo young to be on the internet");
            }
            if ( age < 16 )
            {
                System.out.println("\ttoo young to drive");
            }
            if ( age < 17 )
            {
                System.out.println("\ttoo young to play \"violent\" video games");
            }
            if ( age < 18 )
            {
                System.out.println("\ttoo young to smoke");
            }
            if ( age < 21 )
            {
                System.out.println("\ttoo young to drink alcohol");
            }
            if ( age < 30 )
            {
                System.out.println("\ttoo young to die");
            }
            if ( age < 35 )
            {
                System.out.println("\ttoo young to be the U.S President");
            }
            if ( age < 65 )
            {
                System.out.println("\ttoo young to retire");
            }
            if ( age >= 70)
            {
                System.out.println("\tin a nursing home");
            }

        }

    }


}