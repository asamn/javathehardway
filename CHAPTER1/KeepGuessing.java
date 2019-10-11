//the code was looping uncontrollably because it didnt ask for another input in the while loop, it was impossible to make secret = guess

import java.util.Scanner;

public class KeepGuessing
{
    public static void main (String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(Math.random()*10);

        System.out.println( "I have chosen a number between 1 and 10." );
        System.out.println( "Try to guess it." );
        System.out.print( "Your guess: " );
        guess = keyboard.nextInt();

        while ( secret != guess ) {
        System.out.println( "That is incorrect. Guess again." );
        System.out.print( "Your guess: " );
        guess = keyboard.nextInt();//stops the endless loop
        }

    System.out.println( "That's right! You're a good guesser." );

    }
}

/*
public static void main( String[] args ) {
5 Scanner keyboard = new Scanner(System.in);
6 int secret, guess;
7
8 secret = 1 + (int)(Math.random()*10);
9
10 System.out.println( "I have chosen a number between 1 and 10." );
11 System.out.println( "Try to guess it." );
12 System.out.print( "Your guess: " );
13 guess = keyboard.nextInt();
14
15 while ( secret != guess ) {
16 System.out.println( "That is incorrect. Guess again." );
17 System.out.print( "Your guess: " );
18 }
19
20 System.out.println( "That's right! You're a good guesser." );
21 }*/