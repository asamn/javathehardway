import java.util.Scanner;

public class LittleQuiz
{
    public static void main(String[] args)
    {

        double score = 0, percent;
        String answer;

        Scanner input = new Scanner(System.in);

        System.out.print("R U ready for the quiz? ");
        answer = input.next();
        if (answer.equals("Y")|| answer.equals("y") || answer.equals("Yes") || answer.equals("YES") || answer.equals("yes"))
        {
            System.out.println("Good for you\n");


            System.out.println("1) What is the \"trash\" capital of the world? ");
            System.out.println("\t1. Boston\n\t2. Detroit\n\t3. Quebec");
            answer = input.next();
            if (answer.equals("2"))
            {
                score++;
                System.out.println("\nCorrect!\n");
            }
            else
            {
                System.out.println("\nIncorrect!\n");
            }


            System.out.println("2) What color underwear am I wearing? ");
            System.out.println("\t1. Black\n\t2. Pink\n\t3. Brown");
            answer = input.next();
            if (answer.equals("2"))
            {
                score++;
                System.out.println("\nCorrect\n");
            }
            else
            {
                System.out.println("\nWRONG!!!\n");
            }


            System.out.println("3) Do you remember the 21st night of September? ");
            System.out.println("\t1. no\t2. no\t3. no\t4. no\t5. no\t6. no\t7. no\t8. no\t9. no\t10. no\t11. no\n\t12. no\t13. no\t14. no\t15. no\t16. no\t17. no\t18. no\t19. no\t20. no\t21. YES");
            answer = input.next();
            if (answer.equals("21"))
            {
                score++;
                System.out.println("\ncOrREcT\n");
            }
            else
            {
                System.out.println("\nIncorrect!\n");
            }


            System.out.println("4) What is my name? ");
            System.out.println("\t1. asamn\n\t2. asam\n\t3. assam");
            answer = input.next();
            if (answer.equals("1"))
            {
                score++;
                System.out.println("\nCorrect!\n");
            }
            else
            {
                System.out.println("\nIncorrect!\n");
            }


            System.out.println("BONUS) You want me when you need me. But when you have me, you give it away. What am I? ");
            answer = input.next();
            if (answer.equals("advice") || answer.equals("Advice") || answer.equals("ADVICE"))
            {
                score++;
                System.out.println("\nCORRECT!\n");
            }
            else
            {
                System.out.println("\nIncorrect!\n");
            }


            System.out.println("You scored " + score + " out of 4.0!");
            percent = (score / 4) * 100;
            System.out.println(percent + "%");

            if(score <= 0)
            {
                System.out.println("YOU SUCC eggs");
            }
            else if (score < 4)
            {
                System.out.println("Good job!!!");
            }
            else
            {
                System.out.println("Congrats!!!");
            }

        }

        else
        {
            System.out.print("It's OK take your time");
            score = 0;
        }




    }


}