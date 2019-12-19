import java.io.File;
import java.net.URL;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

class Temp
{
    int month, day, year;
    double temperature;
}
public class TemperatureByData
{
    public static void main (String[] args) throws Exception
    {
        String url = "https://learnjavathehardway.org/txt/avg-daily-temps-with-dates-atx.txt";
        Scanner readURL = new Scanner(new java.net.URL(url).openStream());
        Temp[] tempArray = new Temp[10000];
        int count = 0;
        while (readURL.hasNext() && count < tempArray.length)
        {
            Temp a = new Temp();
            a.month = readURL.nextInt();
            a.day = readURL.nextInt();
            a.year = readURL.nextInt();
            a.temperature = readURL.nextDouble();
            if (a.temperature == -99) //-99 means missing
            {
                //do nothing
            }
            else
            {
                tempArray[count] = a; //sets tempArray to a
                count++;
            }
        }
        readURL.close();
        out.println(count + " temperatures found \n");

        double combinedTemp = 0;
        double combinedTempNov = 0;
        int countNov = 0;
        for (int i = 0; i < count; i++)
        {
            combinedTemp += tempArray[i].temperature; //not =+
            if (tempArray[i].month == 11)
            {
                countNov++;
                combinedTempNov += tempArray[i].temperature;
            }
        }

        double yearlyAverage = roundNumber(combinedTemp/count);
        double novAverage = roundNumber(combinedTempNov/countNov);

        out.println(yearlyAverage + " Yearly Average ");
        out.println(novAverage + " Average of " + countNov + " days in November ");

    }

    public static double roundNumber (double n)
    {
        n = Math.round(n*10)/10.0; //*10 makes 681.0, /10 moves the decimal to 68.1, rounding n alone makes 68.0
        return n;
    }

}


