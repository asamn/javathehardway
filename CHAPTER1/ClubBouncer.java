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

        System.out.print("Enter your \"allure\": ")
        allure = input.nextDouble();

        System.out.print("Are you a male, or a female? Sorry I can't see correctly: ")
        genderInput = input.next();
        if (genderInput.equals("M") || genderInput.equals("m")  || genderInput.equals("male")  || genderInput.equals("Male") || genderInput.equals("MALE"))
        {
            isMale = true;
        }
        else if (genderInput.equals("F") || genderInput.equals("f") || genderInput.equals("female") || genderInput.equals("Female") || genderInput.equals("FEMALE"))
        {
            isMale = false;
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
        }
        else
        {
            if ( age < 18 )
            {
                System.out.println("FBI, OPEN UP!!! ");
                allowed = false;
            }
            else
            {
                if (!isMale && (age >= 21 || allure >= 7.5))
                {
                    allowed = true;
                }
                else if (isMale && (age >= 21 || allure >= 10.0))
                {
                    allowed = true;
                }
                else
                {
                    allowed = false;
                }
            }


        }






    }
}