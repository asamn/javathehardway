/*  This program asks the user to input their name, a floating point number, a day of the week, a noun, and an integer
    It then prints out a madlib-esque sentence that includes all of the above inputs
*/
// AUTHOR: ADAM SAM
// Worth 5 points
#include <stdio.h>
#include <cs50.h>

int main(void)
{
    string name = get_string("Enter your name.\n");
    float floatValue = get_float("Enter a number with a decimal.\n");
    string noun = get_string("Enter a noun.\n");
    int integer = get_int("Enter an integer.\n");
    string DayOfWeek = "day of a week";
    char DayOfWeekChar =
        get_char("Select any day of a week.\nS = Sunday\nM = Monday\nT = Tuesday\nW = Wednesday\nH = Thursday\nF = Friday\nA = Saturday\n");


    if (DayOfWeekChar == 's' || DayOfWeekChar == 'S')
    {
        DayOfWeek = "Sunday";
    }
    else if (DayOfWeekChar == 'm' || DayOfWeekChar == 'M')
    {
        DayOfWeek = "Monday";
    }
    else if (DayOfWeekChar == 't' || DayOfWeekChar == 'T')
    {
        DayOfWeek = "Tuesday";
    }
    else if (DayOfWeekChar == 'w' || DayOfWeekChar == 'W')
    {
        DayOfWeek = "Wednesday";
    }
    else if (DayOfWeekChar == 'h' || DayOfWeekChar == 'H')
    {
        DayOfWeek = "Thursday";
    }
    else if (DayOfWeekChar == 'f' || DayOfWeekChar == 'F')
    {
        DayOfWeek = "Friday";
    }
    else if (DayOfWeekChar == 'a' || DayOfWeekChar == 'A')
    {
        DayOfWeek = "Saturday";
    }
    else
    {
        printf("ERROR! INVALID INPUT\n");
    }
    printf("Hello, %s. You have a %.2f kill to death ratio in Black Ops 4. Your net worth is $%i. Last %s, I saw you purchase a %s at 7/11.",
            name, floatValue, integer, DayOfWeek, noun);



    // TODO
}
