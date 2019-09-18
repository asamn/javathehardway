/*  This program asks the user for a number between 30 and 80, verifying it is an acceptable input.
    It then uses a while loop to count from from that number to zero.
    The program only prints out every increment of 5 (i.e. 25, 20, 15, 10, 5, 0)
    When reaching zero, the program prints "0", and then prints how many times it printed a number.

    For example: If the user entered 28, the program would print:
        25
        20
        15
        10
        5
        0
        This program printed 6 numbers.

    *More points for having an efficient solution rather than a "brute force" solution*
*/
// AUTHOR: ADAM SAM
// Worth: 10 points
#include <stdio.h>
#include <cs50.h>


/*RULES FOR ROUNDING 5
if the last digit is 4, then it rounds to 5
anything lower than 4 rounds to 0
if the last digit is 9, then it rounds to 10
anything lower than 9 rounds to 5
if the last digit is 5 or 0, then the number is left alone

/*/

int main(void)
{
    int number;
    do
    {
        number = get_int("Enter a number.\n");
    }
    while (number < 30 || number > 80);

    int lastDigit = number % 10;

    printf("Last digit is %i.\n", lastDigit);

    if (lastDigit == 1)
    {
        number = number - 1;
    }
    else if (lastDigit == 2)
    {
        number = number - 2;
    }
    else if (lastDigit == 3)
    {
        number = number - 3;
    }
    else if (lastDigit == 4)
    {
        number = number + 1;
    }
    else if (lastDigit == 6)
    {
        number = number - 1;
    }
    else if (lastDigit == 7)
    {
        number = number - 2;
    }
    else if (lastDigit == 8)
    {
        number = number - 3;
    }
    else if (lastDigit == 9)
    {
        number = number + 1;
    }
    else
    {

    }
    printf("Rounded to %i.\n", number);

    int counter = 0;

    while (number >= 0)
    {
        printf("%i\n", number);
        number = number - 5;
        counter = counter + 1;


    }
    printf("This program printed %i numbers.\n", counter);


    // TODO
}