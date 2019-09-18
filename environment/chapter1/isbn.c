
/*
characteristics of an isbn number
10 digits
no dashes
formula at the bottom of script
/*/
/*

//unacceptable for check50, but is superior, goto line 219
#include <stdio.h>
#include <cs50.h>
#include <math.h>

int main(void)
{
    //til that dividing by ten will remove a digits place of a number
    printf("ISBN Checker V 1.0\nBy: ASAMN\n");
    long long int isbn = get_long_long("\nEnter ISBN\n"); //long long for long ints
    long long int isbn2 = isbn; //int to be changed
    long long int isbn3 = isbn; //int to be changed to find digits
    int numberOfDigits;
    long long int firstDigitToBeChecked = isbn; //checks first digit if its a zero because beginning with zero wont count that digit
    for(int i = 1; i < 10; i++)
    {
        firstDigitToBeChecked = firstDigitToBeChecked / 10;

    }
    printf("\n%lli is the first digit...\n", firstDigitToBeChecked);


    while(isbn2 > 0) //adds each time isbn can be divided by ten
    {
        isbn2 = isbn2 / 10;
        numberOfDigits = numberOfDigits + 1;
    }
    if(firstDigitToBeChecked == 0)
    {
        numberOfDigits = numberOfDigits + 1;
    }
    printf("%i digits...\n", numberOfDigits);


    if(numberOfDigits == 10)
    {
    printf("Correct amount of digits!!!\n");




    int divider = 10;
    int tenthDigit = 0;
    while(divider - 1 > 0)
    {
    tenthDigit = isbn3 % 10;
    divider = divider - 1;
    }
    printf("%i\n", tenthDigit);
    isbn3 = isbn3 / 10; //take away one by one digit




    divider = 10; //resets the divider back
    int ninthDigit = 0;
    while (divider - 1 > 0)
    {
        ninthDigit = isbn3 % 10;
        divider = divider - 1;
    }
    printf("%i\n", ninthDigit);
    isbn3 = isbn3 / 10; //take away one by one digit




    divider = 10; //resets the divider back
    int eighthDigit = 0;
    while (divider - 1 > 0)
    {
        eighthDigit = isbn3 % 10;
        divider = divider - 1;
    }
    printf("%i\n", eighthDigit);
    isbn3 = isbn3 / 10; //take away one by one digit





    divider = 10; //resets the divider back
    int seventhDigit = 0;
    while (divider - 1 > 0)
    {
        seventhDigit = isbn3 % 10;
        divider = divider - 1;
    }
    printf("%i\n", seventhDigit);
    isbn3 = isbn3 / 10; //take away one by one digit




    divider = 10; //resets the divider back
    int sixthDigit = 0;
    while (divider - 1 > 0)
    {
        sixthDigit = isbn3 % 10;
        divider = divider - 1;
    }
    printf("%i\n", sixthDigit);
    isbn3 = isbn3 / 10; //take away one by one digit




    divider = 10; //resets the divider back
    int fifthDigit = 0;
    while (divider - 1 > 0)
    {
        fifthDigit = isbn3 % 10;
        divider = divider - 1;
    }
    printf("%i\n", fifthDigit);
    isbn3 = isbn3 / 10; //take away one by one digit





    divider = 10; //resets the divider back
    int fourthDigit = 0;
    while (divider - 1 > 0)
    {
        fourthDigit = isbn3 % 10;
        divider = divider - 1;
    }
    printf("%i\n", fourthDigit);
    isbn3 = isbn3 / 10; //take away one by one digit





    divider = 10; //resets the divider back
    int thirdDigit = 0;
    while (divider - 1 > 0)
    {
        thirdDigit = isbn3 % 10;
        divider = divider - 1;
    }
    printf("%i\n", thirdDigit);
    isbn3 = isbn3 / 10; //take away one by one digit





    divider = 10; //resets the divider back
    int secondDigit = 0;
    while (divider - 1 > 0)
    {
        secondDigit = isbn3 % 10;
        divider = divider - 1;
    }
    printf("%i\n", secondDigit);
    isbn3 = isbn3 / 10; //take away one by one digit




    divider = 10; //resets the divider back
    int firstDigit = 0;
    while (divider - 1 > 0)
    {
        firstDigit = isbn3 % 10;
        divider = divider - 1;
    }
    printf("%i\n", firstDigit);
    isbn3 = isbn3 / 10; //take away one by one digit


    int sum = 0;
    sum = (firstDigit * 0)+(secondDigit*2)+(thirdDigit*3)+(fourthDigit*4)+(fifthDigit*5)+(sixthDigit*6)+(seventhDigit*7)+(eighthDigit*8)+(ninthDigit*9)+(tenthDigit*10);
    printf("Sum of %i...\n", sum);
    int sumDivided = sum % 11;
    printf("Remainder of %i...\n", sumDivided);
    if(sumDivided == 0)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
    }


    else
    {
        printf("Not right amount of digits, enter ten digits with no dash things.");
    }
}

/*/
/*/

1·0 + 2·7 + 3·8 + 4·9 + 5·7 + 6·5 + 7·1 + 8·9 + 9·8 + 10·4 = 330
*/







//simplified version

#include <stdio.h>
#include <cs50.h>
#include <math.h>

int main(void)
{
    //til that dividing by ten will remove a digits place of a number
    long long int isbn = get_long_long("\nEnter ISBN\n"); //long long for long ints
    long long int isbn2 = isbn; //int to be changed
    long long int isbn3 = isbn; //int to be changed to find digits
    int numberOfDigits;
    long long int firstDigitToBeChecked = isbn; //checks first digit if its a zero because beginning with zero wont count that digit
    for(int i = 1; i < 10; i++)
    {
        firstDigitToBeChecked = firstDigitToBeChecked / 10;

    }


    while(isbn2 > 0) //adds each time isbn can be divided by ten
    {
        isbn2 = isbn2 / 10;
        numberOfDigits = numberOfDigits + 1;
    }
    if(firstDigitToBeChecked == 0)
    {
        numberOfDigits = numberOfDigits + 1;
    }

    int divider = 10; //or multiplier
    long long int sum = 0;

    if(numberOfDigits == 10)
    {

    long long int digit = 0;
    while(isbn3 > 0) //isbn is 1632168146
    {
    //digit is the rightmost number, % gets this
    //the rightmost number is timesed by ten, the previous digit is timesed by nine, the divider is what the digit is timsed by
    //sum is the collection of digits added up together
    //isbn is reduced, making the previous digit the rightmost

    digit = isbn3 % 10;              //%10 of 1632168146 is 6... 1632168146 / 10 is 163216814 remainder 6, it all starts with the rightmost digit
    digit = digit * divider;        //6 * 10, this is part of the formula, tenth digit is timsed by ten
    divider = divider - 1;          //10 > 9, the ninth digit is timsed by nine
    sum = sum + digit;              // 60 -> 54+60 > 104
    isbn3 = isbn3 / 10;             //1632168146 > 163216814 > 16321681 > 1632168 > 163216 > 16321 > 1632 > 163 > 16 > 1 > 0, ten times
                                  //why didnt it work last time
    }

    if(sum % 11 == 0)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
    }


    else
    {
        printf("NO\n");
    }

}



//1632168146
//1·0 + 2·7 + 3·8 + 4·9 + 5·7 + 6·5 + 7·1 + 8·9 + 9·8 + 10·4 = 330

//    int mysterytest = ((1 * 0) + (6*2) + (3*3) + (2*4) + (5) + (6*6) + (7*8) + (8) + (9*4) + (6*10)); > 230
//230 % 11 equals 1


