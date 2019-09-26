import java.util.Scanner;

public class SecretWord
{
    public static void main(String[] args)
    {
        String word, password = "DannyDevito";
        Scanner input = new Scanner(System.in);

        System.out.print("What's the password? (case sensitive) ");
        word = input.next();

        if (word.equals(password) || word.equals(password + "IsThicc"))
        {
            System.out.print("CORRECT");
        }
        else
        {
            System.out.print("WRONG");
        }

        if (word == password)
        {
            System.out.print("this text will never show");
        }
    }
}