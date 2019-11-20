import java.io.File;
import java.net.URL;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

public class LowestTemperature
{
    public static void main(String[] args) throws Exception //throws used when finding/reading files
    {
        String url = "https://learnjavathehardway.org/txt/";
        double[] temps = findArray(url + "avg-daily-temps-atx.txt"); //avg-daily-temps-atx.txt is a text of arrays, arrayFromUrl is from          url + avg...txt results in https://learnjavathehardway.org/txt/avg-daily-temps-atx.txt, which could be used instead     double temps = 6717
        //find array gives temps its values
        double lowest = 9999.99; //should not be in for loop 9999.99 not 0 because there could or could not be the lowest temp greater than zero but there will not be a temp greater than 9999.99
        double highest = -9999.99;
        double average = findAvg(temps);

        for (int i = 0; i < temps.length; i++)
        {
            if (temps[i] < lowest)
            {
                lowest = temps[i];
            }
            if (temps[i] > highest)
            {
                highest = temps[i];
            }
        }

        out.println("Lowest Temperature: " + lowest + "F (" + convertToC(lowest) + "C) ");
        out.println("Highest Temperature: " + highest + "F (" + convertToC(highest) + "C) ");
        out.println("Average Temperature: " + average + "F (" + convertToC(average) + "C) ");


    }

    public static double[] findArray(String url) throws Exception
    {
        Scanner readText = new Scanner ( (new URL(url) ).openStream() ); //uses java.net.URL, opens https://learnjavathehardway.org/txt/avg-daily-temps-atx.txt
        int count = readText.nextInt(); //finds an int called 6717 which is placed on top of the txt file, amount of temperatures placed convienently
        out.println(count + " found");
        double[] textArray = new double[count]; //array of 6717 doubles
        for (int i = 0; i < textArray.length; i++)
        {
            textArray[i] = readText.nextDouble(); //reads doubles not ints, sets values for arrays, [0] = 48.1
            //out.println(textArray[i]);
        }

        return textArray;
    }
    //return (f-32)*5/9;
    public static double convertToC (double F)
    {
        return ((F-32)*5/9);
    }

    public static double findAvg(double[] temps)
    {
        double combinedTemps = 0;
        double avg = 0;
        for (int i = 0; i < temps.length; i++)
        {
            combinedTemps = combinedTemps + temps[i];
        }
        avg = combinedTemps/temps.length;

        return avg;
    }

}