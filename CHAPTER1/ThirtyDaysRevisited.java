import java.util.Scanner;

public class ThirtyDaysRevisited
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int month = 0;

        System.out.print("Enter month (1-12): ");
        month = input.nextInt();

        System.out.println("\n" + countDays(month) + " days in " + monthToString(month));

    }


    public static int countDays(int month)
    {
        int days = 0;

        switch(month)
        {
            case 9:
            case 4:
            case 6:
            case 11:
                days = 30;
                break;

            case 28:
                days = 28;
                break;

            default:
                days = 31;
                break;
        }

        return days;
    }


    public static String monthToString(int month)
    {
        String monthName;

        switch(month)
        {
            case 1:
                monthName = "January";
                break;

            case 2:
                monthName = "February";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                System.out.println("Do you remember the 21st night of September? ");
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;

            default:
                monthName = "Month";
                break;
        }

        return monthName;
    }

}