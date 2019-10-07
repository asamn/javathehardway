//import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int score;

        System.out.print("Enter your math score: ");
        score = input.nextInt();
        System.out.print("Admittance: ");

        if (score >= 790)
        {
        System.out.print("CERTAIN");
        }
        else if (score >= 710)
        {
        System.out.print("SAFE");
        }
        else if (score >= 580)
        {
        System.out.print("PROBABLE");
        }
        else if (score >= 500)
        {
        System.out.print("UNCERTAIN");
        }
        else if (score >= 390)
        {
        System.out.print("UNLIKELY");
        }
        else
        {
        System.out.print("DENIED");
        }

    }

}