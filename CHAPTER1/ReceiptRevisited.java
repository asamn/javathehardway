import java.util.Scanner;
import java.io.PrintWriter;

public class ReceiptRevisited
{
    public static void main (String[] args) throws Exception//declared to be thrown
    {
        Scanner input = new Scanner(System.in);
        String fileName = "receipt.txt";
        PrintWriter printToFile = new PrintWriter(fileName);
        String month, day, year, date, time;
        double gallons, pricePerGallon = 3.459, total;
        System.out.println("Enter the date, ");
        System.out.print("M: ");
        month = input.next();
        System.out.print("D: ");
        day = input.next();
        System.out.print("Y: ");
        year = input.next();
        date = (month + "/" + day + "/" + year);
        System.out.println("Enter Gallons: ");
        gallons = input.nextDouble();
        total = gallons * pricePerGallon;
        System.out.println("RECEIPT PRINTED TO " + fileName);

        printToFile.println( "+------------------------+" );
        printToFile.println( "                          " );
        printToFile.println( "      CORNER STORE        " );
        printToFile.println( "                          " );
        printToFile.println( "  " + date                  );
        printToFile.println( "                          " );
        printToFile.println( "  Gallons: " + gallons      );
        printToFile.println( "  Price/gallon: $" + pricePerGallon);
        printToFile.println( "                          " );
        printToFile.println( "  Fuel total: $" + total    );
        printToFile.println( "                          " );
        printToFile.println( "+------------------------+" );
        printToFile.close();

    }

}