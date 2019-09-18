/*
- Mad Libs: Ask user for a float, int, string, char. Combine them into a humorous output with printf statements.

- Loops: Ask user for a number to count to from 1 to that number. Implement with a for loop. Ask user for another number between 0 and 12 and recite the multiplication table up to 12 for that number. Implement with a while loop.

- Geometry: Create functions to calculate area or perimeter of a square, triangle, and rectangle. Create a program that will ask the user which formula he/she would like to calculate, ask the lengths to use, and output the result.

- Lottery: Create a program that will draw the winning numbers, and then simulate drawing 10000 lottery tickets. Keep track of how many tickets matched exactly 1 number, exactly 2, etc. and in a final print out display the percentage for each.

#include <stdio.h>
#include <cs50.h>

int main(void)
{
    void Ask();
    Ask();
}
*/
#include <stdio.h>
#include <cs50.h>

int main(void)
{
    float a;
    a = 5/6;
    printf ("%f\n",a); // 876876

    float b;
    b = 5/6;
    printf ("%f\n",b);

    float c;
    c = (float)5 / (float) 6;
    printf ("%f\n",c);

    float d;
    d = (float)5 / 6;
    printf ("%f\n",d);

    printf ("%.2f\n",d);

    float e;
    e = 10.1 * (1/2);
    printf ("%.2f\n",e);

    e = (10.1 * 1) / 2;
    printf ("%.2f\n",e);

}

