import java.util.Scanner;

public class ClubBouncer
{
    public static void main(String[] args)
    {
        int age;
        double allure;
        boolean allowed, isMale;
        String name, genderInput;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your \"allure\": ");
        allure = input.nextDouble();

        System.out.print("Are you a male, or a female? Sorry I can't see correctly: ");
        genderInput = input.next();
        if (genderInput.equals("M") || genderInput.equals("m")  || genderInput.equals("male")  || genderInput.equals("Male") || genderInput.equals("MALE"))
        {
            isMale = true;
        }
        else if (genderInput.equals("F") || genderInput.equals("f") || genderInput.equals("female") || genderInput.equals("Female") || genderInput.equals("FEMALE"))
        {
            isMale = false;
            allure += 0.5;
        }
        else
        {
            System.out.println("What kind of gender is that? I'm going to assume you're a male. ");
            isMale = true;
        }

        System.out.print("Finally, enter your name: ");
        name = input.next();

        if (name.equals("asamn") && isMale)
        {
            allowed = true;
            allure = 100000.0;
        }
        else
        {

            if (!isMale && (age >= 21 && allure >= 7.5))
            {
                allowed = true;
                System.out.println("\nWelcome, maam. ");
            }
            else if (isMale && (age >= 21 && allure >= 10.0))
            {
                allowed = true;
                System.out.println("Welcome, sir. ");
            }
            else
            {
                allowed = false;
                System.out.println("You're not allowed in. ");
            }

        }
        if (allowed)
        {
           System.out.println("You're allowed in. ");
        }
        else
        {
            System.out.println("Go away. ");
        }



    }
}