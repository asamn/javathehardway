import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;
//etbj zrr btms ahsbg

public class CaesarCipher
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(in);
        File caesarText = new File("CaesarText.txt");
        Scanner readFile = new Scanner(caesarText);
        int shift;
        String message = "", choice, convertedMessage = "";
        boolean loadFile = false;
        if (!caesarText.exists() && caesarText.length() == 0)
        {
            out.println("FILE NOT FOUND!");
        }
        else
        {
            out.print("Load a file? ");
            do
            {
                choice = input.nextLine();
                if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"))
                {
                    loadFile = true;
                }
                else if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n"))
                {
                    loadFile = false;
                }
            }
            while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("no") && !choice.equalsIgnoreCase("n"));
        }

        if (loadFile == true)
        {
            if (caesarText.length() <= 0)
            {
                out.println("ERROR! NO TEXT FOUND!");
            }
            else
            {
                message = readFile.nextLine();
                out.println("FILE LOADED!");
            }
        }
        else
        {
            out.print("Enter a message to convert: ");
            message = input.nextLine();
        }
        out.print("Enter a shift: ");
        shift = input.nextInt();

        for (int i = 0; i < message.length(); i++)
        {
            char letter = message.charAt(i);
            //out.println(character);
            convertedMessage = convertedMessage + caesarCipher(letter, shift);//add onto the converted message, chars can be added to strings
            //out.println("\t" + convertedMessage);
        }
        out.println(convertedMessage);
    }

    public static char caesarCipher(char letter, int shift)
    {
        int letterValue = letter;

        if (!Character.isLetter(letter))//if is not lettere
        {
            return letter;
        }


        letterValue = letterValue + shift;//converts string to int

        //wraps letters around alphabet if passes z
        if ( Character.isUpperCase(letter) && letterValue > 'Z' || Character.isLowerCase(letter) && letterValue > 'z' )//no character.ignoreCase
        {
            letterValue = letterValue - 26;
        }
        if ( Character.isUpperCase(letter) && letterValue < 'A' || Character.isLowerCase(letter) && letterValue < 'a' )
        {
            letterValue = letterValue + 26;
        }

        letter = (char)letterValue;//converts int back to string
        return letter;
    }


}