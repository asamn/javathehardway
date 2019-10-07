import java.util.Scanner;

public class ThirtyDays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int month, days;
        String monthName;

        System.out.print("Enter month (1-12): ");
        month = input.nextInt();

        switch(month) //(month) compares month int
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
        }

        switch(month) //9,4,6,11 all have 30 days
        {
            case 9:
            case 4:
            case 6:
            case 11:
                days = 30;
                break;

            case 2:
                days = 28;
                break;

            default:
                days = 31;
        }

        System.out.println("\n" + days + " days in " + monthName);

    }
}