/*  This program asks the user for a positive integer between 1 and 10(inclusive) using a do-while loop
    If the number is less than 4, the program prints "Too small!"
    If the number is greater than or equal 4 but less than 8, it prints "Very Close!"
    If the number is greater than or equal to 8, it prints "Too big!"
    If the number is 5, the program prints "You got it!" and nothing else
    Ensure only one message can print while running the program for any acceptable input
*/
// AUTHOR: ADAM SAM
// Worth 10 points

#include <stdio.h>
#include <cs50.h>

int main(void)
{
    int number;
    do
    {
        number = get_int("Enter Number \n"); //repeats prompt until while conditions are met
    }
    while (number < 1 || number > 10);

    if (number == 5)
    {
        printf("You got it!\n");

    }

    else if (number < 4)
    {
        printf("Too small!\n");

    }
    else if (number >= 4 && number < 8)
    {
        printf("Very close!\n");
    }
    else if (number >= 8)
    {
        printf("Too big!\n");
    }


    // TODO: Get input (verify between 1 and 10)
    // TODO: Print appropriate message
}