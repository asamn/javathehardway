import java.util.Scanner;

public class WeaselOrNot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word;
        boolean yes,no;

        System.out.println("Type in \"pp\" please. Or \"PP.\"");

        word = input.next();

        no = !word.equals("pp") && !word.equals("PP"); //&&
        yes = word.equals("pp") || word.equals("PP");

        System.out.println("You typed the word: " + yes);
        System.out.println("You didn't type the word: " + no);

    }


}