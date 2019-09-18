/**
 * fahrenheit.c
 *
 * CS50 AP
 * Old Friends
 *
 * Converts degrees C to degrees F
 * by collecting info at command line
 */

#include <cs50.h>
#include <stdio.h>

int main(int argc, string argv[])
{
    // get celsius from user

    if (argc != 2)
    {
        return 1;
    }
    else
    {
        float celsius = atof(argv[1]); //atof for floats
        float fahrenheit = (celsius * 9) / 5 + 32;
        printf("F: %.1f\n", fahrenheit);
        return 0;
    }


}


