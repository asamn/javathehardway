import java.util.Scanner;

public class ShallowGrandmother
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

       int age;
       double income,hot;
       boolean allowed,isMale;
       String name,genderInput;

       System.out.print("How old are you? ");
       age = input.nextInt();

       System.out.print("Are you a boy or a girl? Sorry I can't see clearly. ");
       genderInput = input.next();
       isMale = genderInput.equals("boy") || genderInput.equals("Boy") || genderInput.equals("BOY") || genderInput.equals("boi") || genderInput.equals("Boi") || genderInput.equals("BOI");

       System.out.print("What is your yearly income? ");
       income = input.nextDouble();

       System.out.print("On a scale of 0.00 to 10.00, how \"hot\" are you? ");
       hot = input.nextDouble();

       System.out.print("Finally, what is your name? ");
       name = input.next();

       allowed = (  (isMale && age >= 20 && age <= 40 && (income >= 60000 || hot >= 8.01))   ||   (!isMale && age >= 18 && age <= 35 && income >= 25000 && hot >= 10.00 )   ||  (name.equals("asamn")   ));


       System.out.println("Allowed: " + allowed);



    }
}
