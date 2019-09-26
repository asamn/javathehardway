import java.util.Scanner;

/*
#	Planet	Relative gravity
1	Venus	0.78
2	Mars	0.39
3	Jupiter	2.65
4	Saturn	1.17
5	Uranus	1.05
6	Neptune	1.23
*/

public class SpaceBoxing
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int planet;
        double weight, multiplier = 0;
        String planetName = "planet";

        System.out.print("Enter your weight: ");
        weight = input.nextDouble();

        System.out.print("\nList of planets:\n");
        System.out.print("\t1. Venus\t2. Mars\t\t3. Jupiter\n\t4. Saturn\t5. Uranus\t6. Neptune\n");
        System.out.println("\nChoose your planet: ");
        planet = input.nextInt();


        if (planet == 1)
        {
            planetName = "Venus.";
            multiplier = 0.78;
        }
        else if (planet == 2)
        {
            planetName = "Mars.";
            multiplier = 0.39;
        }
        else if (planet == 3)
        {
            planetName = "Jupiter.";
            multiplier = 2.65;
        }
        else if (planet == 4)
        {
            planetName = "Saturn.";
            multiplier = 1.17;
        }
        else if (planet == 5)
        {
            planetName = "Uranus.";
            multiplier = 1.05;
        }
        else if (planet == 6)
        {
            planetName = "Neptune.";
            multiplier = 1.23;
        }
        else
        {
            System.out.println("You didn't pick a planet.");
            planetName = "Earth.";
            multiplier = 1.00;
        }
        weight *= multiplier;

        System.out.println("Your weight would be " + weight + " pounds on " + planetName);



    }



}


/*
1. Venus   2. Mars    3. Jupiter
   4. Saturn  5. Uranus  6. Neptune



   */