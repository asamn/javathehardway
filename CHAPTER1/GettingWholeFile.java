import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class GettingWholeFile
{
    public static void main (String[] args) throws Exception
    {
        String fileName = "someWords.txt", javaName = "GettingWholeFile.java";
        File textFile = new File (fileName);
        File javaFile = new File (javaName);
        Scanner readJava = new Scanner (javaFile);
        Scanner readFile = new Scanner (textFile);

        Scanner input = new Scanner(in);
        int fourLetterWords = 0, caps = 0; int capWords = 0;

        while (readFile.hasNext()) //while reader has a word to read
        {
            String word = readFile.next();


            out.print(word + " ");
            //Thread.sleep(200);

            //out.println(word.length());
            if (word.length() == 4)
            {
                fourLetterWords++;
            }

        }
        readFile.close();

        while (readJava.hasNext()) //while reader has words to read
        {

            String jWord = readJava.next();

            if (Character.isUpperCase(jWord.charAt(0)))
            {
                capWords++;
            }

        }
        readJava.close();
        out.println(capWords + " words begin with caps");
    }
}