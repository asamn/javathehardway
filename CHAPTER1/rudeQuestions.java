import java.util.Scanner;

public class rudeQuestions
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        double weight, income;

        System.out.print("What is your name? ");
        name = input.next();

        if ( name.equals("assam") )
        {
            System.out.println("nice name");

        }

        System.out.print("Good day, " + name + ", how old are you? ");
        age = input.nextInt();

        if (age <= 9)
        {
            System.out.print( age + " years old? You should be coloring... ");

        }
        else if (age >= 80)
        {
            System.out.print( age + " years old? You should be dead by now... ");

        }

        System.out.print("So you're " + age + " years old... how much do you weigh in pounds? ");
        weight = input.nextDouble();

        if (weight >= 150)
        {
            System.out.print( weight + " pounds? You need a salad. ");

        }
        else if (weight < 100)
        {
            System.out.print( weight + " pounds? You need a Big Mac. ");

        }
        else if (weight >= 100 && weight <= 149 )
        {
            System.out.print( weight + " pounds. ");

        }

        System.out.print("Finally, what is your income? ");
        income = input.nextDouble();

        if (income <= 0)
        {
            System.out.print( income + " per hour... get a job, loser!!! ");

        }
        else if (income > 0 && income < 9.50)
        {
            System.out.print (income + " per hour? I feel sorry for you! ");

        }
        else if (income >= 9.50)
        {
            System.out.print (income + "per hour. ");

        }
        System.out.print ("Thanks for answering my questions, " + name + ".");

    }








}