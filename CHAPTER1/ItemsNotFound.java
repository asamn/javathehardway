import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

public class ItemsNotFound
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(in);
        String[] questions = {"Type Abderus. ", "Type Achilles.", "Type Aeneas."};
        String[] answers = {"Abderus", "Achilles", "Aeneas"};
        String answer = "";
        double percent, score = 0, guessingScore = 0;
        int[] qNumber = {1,2,3}; //question number
        int cQuestion = 0; //current question

        out.println("\nGuessing Quiz");
        guessingScore = guessingQuiz(input, answer);

        out.println("Typing Test");
        while (cQuestion < questions.length)
        {//

            out.println(qNumber[cQuestion] + ". " + questions[cQuestion]);
            out.print(">");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase(answers[cQuestion]))
            {
                out.println("Correct!!! ");
                score++;
            }
            else
            {
                out.println("WRONG!");
                corrector(answer, answers[cQuestion]);
            }
            cQuestion++;
        }
        percent = ((score / questions.length)*0.25 + (guessingScore / 5)* 0.75) *100 ;//five questions to score 100 on guessing quiz
        out.println("\nTyping Score: " + score + " out of " + questions.length);
        out.println("Guessing Score: " + guessingScore);
        out.println("Typing quiz is 25% of grade, guessing test is 75%: ");
        out.println(percent + "%");

    }

    public static void corrector(String answer, String word)
    {

        for (int i = 0; i < word.length() && i < answer.length(); i++)
        {
            char character = word.charAt(i);

            char answerChar = answer.charAt(i);
            if (Character.toLowerCase(character) == Character.toLowerCase(answerChar))
            {
                out.print(answerChar);
            }
            else
            {
                character = Character.toUpperCase(character);
                out.print("-" + character);
            }

        }
        if (word.length() > answer.length())
        {
            for (int i = word.length() - answer.length(); i > 0; i--)
            {
                char character = word.charAt(word.length() - i);
                character = Character.toUpperCase(character);
                out.print("-" + character);
            }
        }
        out.println("  Not \"" + answer + ".\" ");
        out.println();
    }

    public static double guessingQuiz(Scanner input, String answer)
    {
        boolean found = false, foundAll = false;
        int x = 0, n = 0;
        double guessingScore = 0;
        String[] guessingAnswers = {"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
                                    "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
                                    "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
                                    "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus", "Ulysses" };

        out.println("List any Greek Hero - you cannot guess the same hero more than once; score at least five to get 100%: ");
        do
        {
            n = 0;
            x = 0;//reset everything
            found = false;

            for (String i: guessingAnswers)
            {
                if (i.equalsIgnoreCase("NULL"))
                {
                    n++;
                }

            }
            if (n >= guessingAnswers.length)//found all
            {
                out.println ("You've found them all!");
                guessingScore = guessingAnswers.length;
                foundAll = true;
                found = false;
            }
            else
            {
                out.print(">");
                answer = input.nextLine();
            }

            for (String i : guessingAnswers)
            {
                if (answer.equalsIgnoreCase(i) && !answer.equalsIgnoreCase("NULL"))
                {
                    found = true;
                    guessingAnswers[x] = "NULL";
                    if (answer.equalsIgnoreCase("Ulysses"))
                    {
                        Ulysses();
                    }
                }
                x++;
            }
            if (!found && foundAll == false)
            {
                out.println("WRONG! ");
            }
            else if (foundAll == false)
            {
                out.println("Right!");
                guessingScore++;
            }
        }
        while (found);
        out.println("You scored " + guessingScore + " points. \n");
        return guessingScore;
    }

    public static void Ulysses()
    {

 out.println("                               .,,*.  ,,...   ");
 out.println("                        .. .*///**/((//////((,   ");
 out.println("                   .*//(#((***/*///////*##(%#///,    ");
 out.println("                ,*(*((#/(((((((//**(/***(#%%%%%#*(.      ");
 out.println("              ,***/###((***,,//*(/*/(/#%%%&(/*//(#.        ");
 out.println("             ,((####*,*%/*/*#/(((/***/((%***/#%%##.        ");
 out.println("            .,*(/(#,*((#((///(/###*//((((%/((((#%%#,       ");
 out.println("           .,//#(%*/(/&&/**#//((/#*/*(((((#%%#((######     ");
 out.println("        .,,,*//#%*//(#*/(//*/*****/(####(//((//(###%#%/    ");
 out.println("    .*,,,,**//%&*/*#(//,..,,,,,,,*****/////(%////(#####    ");
 out.println("  .***,/(&&(///*(((/,.,,,,,***,,*******/////#(///(((//*(/  ");
 out.println(" .***,,%/,(,/(///,...,,,,,,,,*,,,,***/*/*/(/((///((#////## ");
 out.println(" ,**,**,,(**((/,........,,,,,,,,,*******////*(((///(////(# ");
 out.println("  .****,*#*((#,..,,,,,***,,,,,,,******///**(/**/((/(**(##, ");
 out.println("  .*,,,*(//(&(..,**///*/*,,..,**((#(((///*//#//(/#%(//#*   ");
 out.println("   ,,*(/*/#%%.,,**.,,****/,.,,*/#%##(/((////#%(/((#%#((.   ");
 out.println("    *#((/(#&(.,*...,,,*,,,...,*/###*,,*/(((/(%%#(#%%###.   ");
 out.println("   .//(/*/#&,.....,,,,,,.....,*/(((/*/////((/%%%(%#%#%#,   ");
 out.println("   *////*/(#.........,......,.,/////***//////%%###(####,   You thought the leaden winter");
 out.println("   ******/(,........,,,,....,.*/*///*********%#(#(((#(/(   Would bring you down forever");
 out.println("  .,*****,(.........,,,...,../(((///*********%#(%*/*#//#.  But you rode upon a steamer");
 out.println("   **,*,,//...,,...,,,,,.*.,///#(((/*****///*&%#%***((/,   To the violence of the sun");
 out.println("   ,,.,///,......,.,,,,....,,,,*(/**********/&&%(((///,   And the colors of the sea");
 out.println("   */**,,.,..............,*(//(///*****///**(#%#(////(,   Blind your eyes with trembling mermaids");
 out.println("   ,,,*#,,,..........,*(////(((////****///**((##%#####,   And you touch the distant beaches");
 out.println("   ,*,,*/#&..,......,,..,,,,,***((,***/*/**/%%########,   With tales of brave Ulysses");
 out.println("    ,,*,(#%*............,*****////***//****/###%%####(   How his naked ears were tortured");
 out.println("    ,,,*//(%..,,.........,,,,,******//*/***/##(#(###,   By the sirens sweetly singing");
 out.println("     ,,,*/*(/,,,,.......,,*,***/////////***/(%(((#/.   For the sparkling waves are calling you");
 out.println("     **,////&/,,,,,,,,,,,*****/////////*****/#(%#,   To touch their white laced lips");
 out.println("       **/*/%&.********///(//(/(//////*///**//(#   And you see a girl's brown body");
 out.println("       .**//(%..,*//////((((((((////////////*//   Dancing through the turquoise");
 out.println("        ./(/(#*...,,*//((((((/((////////////**.   And her footprints make you follow");
 out.println("         .*/((#.........,,,,****/*/////////****   Where the sky loves the sea");
 out.println("          **/(%...........,,,,***,,,***********   And when your fingers find her");
 out.println("           ,/, .............,,,,,,,,,,,,*****/**   She drowns you in her body");
 out.println("                ,..........,,,,,,,,,,,,,,*****//*   Carving deep blue ripples");
 out.println("                .........,,,,,,,,.,,,,,,,******/*/,   In the tissues of your mind");
 out.println("                ,......,,,,,*,....,,,,,******/****(   The tiny purple fishes");
 out.println("                 .,.....,,,,,......,,,,,*******,,//(.   Run laughing through your fingers");
 out.println("                  ,..............,..,,,,*********,*(.   And you want to take her with you");
 out.println("                  .................,,,,,********,,*(.   To the hard land of the winter");
 out.println("                   .................,,,,,***/*,,,,//     Her name is Aphrodite");
 out.println("                   .............***,,,***********,        And she rides a crimson shell");
 out.println("                   ..........,***,**,*/**,**//*           You know you cannot leave her");
 out.println("                 .,.....,...,,,,,******,//*               For you touched the distant sands");
 out.println("                ,......,,,....,,,****//,                  With tales of brave Ulysses");
 out.println("                 .,,,,..,,,...,*,                         How his naked ears were tortured");
 out.println("                                                          By the sirens sweetly singing");
 out.println("          REST IN PEACE: GINGER BAKER 1939-2019           The tiny purple fishes");
 out.println("                                                          Run laughing through your fingers");
 out.println("                                                          You want to take her with you");
 out.println("                                                          To the hard land of the winter");

    }
}

