import java.util.Scanner;
/*
double ft, in, lb, totalInches;
        double m, kg, bmi;

        System.out.print("Height in feet only: ");
        ft = input.nextDouble();

        System.out.print("Height in inches only: ");
        in = input.nextDouble();

        System.out.print("Weight in pounds: ");
        lb = input.nextDouble();

        totalInches = (ft * 12) + in;
        m = totalInches / 39.37;
        kg = lb / 2.205;
        bmi = kg / (m*m);

*/



public class BMICategories
{
    public static void main(String[] args)
    {
        double bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("BMI: ");
        bmi = input.nextDouble();

        System.out.print("\nYour BMI is " + bmi + ".\nYour BMI category is... ");

        if (bmi <= 1.0)
        {
            System.out.println("third-world country inhabitant");
        }
        else if ( bmi < 15.0 )
        {
            System.out.println("very severely underweight");
        }
        else if ( bmi <= 16.0 )
        {
            System.out.println("severely underweight");
        }
        else if ( bmi < 18.5)
        {
            System.out.println("underweight");
        }
        else if ( bmi < 25.0)
        {
            System.out.println("normal weight");
        }
        else if ( bmi < 30.0)
        {
            System.out.println("overweight");
        }
        else if ( bmi < 35.0)
        {
            System.out.println("obese");
        }
        else if ( bmi < 40.0)
        {
            System.out.println("severely obese");
        }
        else if ( bmi < 80.0)
        {
            System.out.println("morbidly obese");
        }
        else
        {
            System.out.println("Amy Schumer level obese");
        }

    }
}