import java.util.Scanner;

/*m = meters kg = kilograms bmi = body mass
2.205 kg in pounds, 39.37 inches in meters

*/

public class BMICalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
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

        System.out.println("Your BMI: " + bmi);

    }




}


