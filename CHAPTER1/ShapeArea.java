import java.util.Scanner;
import static java.lang.System.*;

public class ShapeArea
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(in);
        double area = 0;
        int answer;

        out.println("SHAPE CALCULATOR V6.9");
        out.println("(c) 2077 RobCo Industries");


        do
        {
            out.print("\n1) Circle ");
            out.println("\t2) Rectangle ");
            out.print("3) Triangle ");
            out.println("\t4) Square ");
            out.println("5) Exit");
            out.print("Calculate: ");
            answer = input.nextInt();

            if (answer == 1)
            {
                out.print("\nRadius: ");
                double radius = input.nextDouble();
                area = findCircle(radius);

                out.println("Area: " + area);

            }
            else if (answer == 2)
            {
                out.println("Length: ");
                double rectBase = input.nextDouble();
                out.println("Width: ");
                double rectHeight = input.nextDouble();
                area = findRectangle(rectBase, rectHeight);

                out.println("Area: " + area);
            }
            else if (answer == 3)
            {
                out.println("Base: ");
                double triBase = input.nextDouble();
                out.println("Height: ");
                double triHeight = input.nextDouble();
                area = findTriangle(triBase, triHeight);

                out.println("Area: " + area);

            }
            else if (answer == 4)
            {
                out.println("Sides: ");
                double squareSides = input.nextDouble();
                area = findSquare(squareSides);

                out.println("Area: " + area);
            }
            else if (answer == 5)
            {
                break;
            }

        }
        while(answer != 5);
    }


    public static double findCircle(double r)
    {
        r = (r*r) * Math.PI;
        return r;
    }


    public static double findRectangle(double b, double h)
    {
        double rectArea = b*h;
        return rectArea;
    }


    public static double findTriangle(double triB, double triH)
    {
        double triArea = (triB*triH)/2;
        return triArea;
    }


    public static double findSquare (double squared)
    {
        squared = squared*squared;
        return squared;
    }
}