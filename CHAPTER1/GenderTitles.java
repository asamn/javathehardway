import java.util.Scanner;
import static java.lang.System.*;

public class GenderTitles
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        int age;
        String firstName, lastName, gender, married;

        out.print("What is your first name? ");
        firstName = input.next();

        out.print("What is your last name? ");
        lastName = input.next();

        out.print("Are you a male or a female? Sorry, I can't see correctly. ");
        gender = input.next();

        out.print("How old are you? ");
        age = input.nextInt();

        if (age >= 21)//old enough to have title
        {
            if (gender.equals("f") || gender.equals("F") || gender.equals("female") || gender.equals("Female") || gender.equals("FEMALE"))
            {
                out.print("Are you married? ");
                married = input.next();
                if (married.equals("y") || married.equals("Y") || married.equals("yes") || married.equals("Yes") || married.equals("YES"))
                {
                    out.println("That's unfortunate... I mean, good for you!");
                    firstName = "Mrs.";
                }
                else
                {
                    firstName = "Ms.";
                }
            }
            else if (gender.equals("m") || gender.equals("M") || gender.equals("male") || gender.equals("Male") || gender.equals("MALE"))
            {
                firstName = "Mr."; //.equals is for if
            }
            else //no gender detected
            {
                //do nothing
            }
        }
        out.println("\n" + firstName + " " + lastName);



    }


}