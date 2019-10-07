import java.util.Scanner;

public class DictionaryOrder
{
    public static void main (String[] args)
    {
        String word, otherWord;
        Scanner input = new Scanner(System.in);
        // 1 = before, 2 = is, 3 = after

        System.out.print("Enter a word: ");
        word = input.nextLine(); //nextLine includes everything in line


        otherWord = "C++"; //+ signs are counted
        if (word.compareToIgnoreCase(otherWord) < 0) //sets below 0 if comes before alphabet <= if comes before or is
        {
            System.out.println(word + " comes before " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) == 0) //0 if 0 difference
        {
            System.out.println(word + " is " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) > 0) //sets above 0 if comes after alphabet
        {
            System.out.println(word + " comes after " + otherWord);
        }

        otherWord = "GO";
        if (word.compareToIgnoreCase(otherWord) < 0)
        {
            System.out.println(word + " comes before " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) == 0)
        {
            System.out.println(word + " is " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) > 0)
        {
            System.out.println(word + " comes after " + otherWord);
        }

        otherWord = "Java";
        if (word.compareToIgnoreCase(otherWord) < 0)
        {
            System.out.println(word + " comes before " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) == 0)
        {
            System.out.println(word + " is " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) > 0)
        {
            System.out.println(word + " comes after " + otherWord);
        }

        otherWord = "Lisp";
        if (word.compareToIgnoreCase(otherWord) < 0)
        {
            System.out.println(word + " comes before " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) == 0)
        {
            System.out.println(word + " is " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) > 0)
        {
            System.out.println(word + " comes after " + otherWord);
        }

        otherWord = "Python";
        if (word.compareToIgnoreCase(otherWord) < 0)
        {
            System.out.println(word + " comes before " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) == 0)
        {
            System.out.println(word + " is " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) > 0)
        {
            System.out.println(word + " comes after " + otherWord);
        }

        otherWord = "Ruby";
        if (word.compareToIgnoreCase(otherWord) < 0)
        {
            System.out.println(word + " comes before " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) == 0)
        {
            System.out.println(word + " is " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) > 0)
        {
            System.out.println(word + " comes after " + otherWord);
        }

        otherWord = "VisualBasic";
        if (word.compareToIgnoreCase(otherWord) < 0)
        {
            System.out.println(word + " comes before " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) == 0)
        {
            System.out.println(word + " is " + otherWord);
        }
        if (word.compareToIgnoreCase(otherWord) > 0)
        {
            System.out.println(word + " comes after " + otherWord);
        }

    }

}