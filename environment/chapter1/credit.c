#include <stdio.h>
#include <cs50.h>
#include <math.h>
/*sequence
get number of digits
if not right amount of digits then invalid
get first two digits
if not right two digits then invalid
compare number of digits with first two digits
initiate formula on number entered
/*/


int main(void)
{
    long long int number = get_long_long("\nEnter Your Credit Card Number, only accepts VISA, MASTERCARD, and AMEX.\n"); //long long for long ints
    long long int number4digits = number;
    long long int number4sumcheck = number;

    int numberOfDigits;
    while(number4digits > 0) //same as number entered
    {
        number4digits = number4digits / 10; //strips one digit
        numberOfDigits = numberOfDigits + 1; //adds to count
    }
    number4digits = number; //resets number
    long long int firstTwoDigits;
    while(number4digits > 100 || number4digits > 99) //while number isnt more than two digits
    {
        number4digits = number4digits / 10;
    }
    firstTwoDigits = number4digits;
    string CreditCard = ("UNDEFINED\n");

    int currentSecondLastDigit = 0;
    int currentLastDigit = 0;
    int totalSum = 0;

    if(numberOfDigits == 15)
    {

        if(firstTwoDigits == 37 || firstTwoDigits == 34)
        {
            CreditCard = ("AMEX");
            for(int i = 0; i < numberOfDigits; i++)
            {

                number4sumcheck = number4sumcheck / 10; //divides by ten twice to get every other digit
                currentSecondLastDigit = number4sumcheck % 10;
                currentSecondLastDigit = currentSecondLastDigit * 2;
                if(currentSecondLastDigit >= 10)//14 --> 1 + 4
                {
                    currentSecondLastDigit = (currentSecondLastDigit - 10) + 1;
                }
                totalSum = totalSum + currentSecondLastDigit;
                number4sumcheck = number4sumcheck / 10;
            }
            number4sumcheck = number;

            for(int i = 0; i < numberOfDigits; i++)
            {
            totalSum = totalSum + currentLastDigit;
            currentLastDigit = number4sumcheck % 10;
            number4sumcheck = number4sumcheck / 10;
            number4sumcheck = number4sumcheck / 10;
            }
            if(totalSum % 10 == 0)
            {
                printf("%s\n", CreditCard);
            }
      else
      {
            printf("INVALID\n");
      }
      }
      else
      {
        printf("INVALID\n");
      }
    }

    else if(numberOfDigits == 16)
    {
        if(firstTwoDigits >= 40 && firstTwoDigits < 50) //if begins with 4
        {
            CreditCard = ("VISA");
               for(int i = 0; i < numberOfDigits; i++)
            {

                number4sumcheck = number4sumcheck / 10; //divides by ten twice to get every other digit

                currentSecondLastDigit = number4sumcheck % 10;
                currentSecondLastDigit = currentSecondLastDigit * 2;
                if(currentSecondLastDigit >= 10)//14 --> 1 + 4
                {
                    currentSecondLastDigit = (currentSecondLastDigit - 10) + 1;
                }
                totalSum = totalSum + currentSecondLastDigit;
                number4sumcheck = number4sumcheck / 10;
            }
            number4sumcheck = number;

            for(int i = 0; i < numberOfDigits; i++)
            {
            totalSum = totalSum + currentLastDigit;
            currentLastDigit = number4sumcheck % 10;

            number4sumcheck = number4sumcheck / 10;
            number4sumcheck = number4sumcheck / 10;

            }
            if(totalSum % 10 == 0)
            {
                printf("%s\n", CreditCard);
            }
            else
            {
                printf("INVALID\n");
            }

        }
           else if(firstTwoDigits >= 51 && firstTwoDigits <= 55)
        {
            CreditCard = ("MASTERCARD");
            for(int i = 0; i < numberOfDigits; i++)
            {

                number4sumcheck = number4sumcheck / 10; //divides by ten twice to get every other digit

                currentSecondLastDigit = number4sumcheck % 10;

                currentSecondLastDigit = currentSecondLastDigit * 2;
                if(currentSecondLastDigit >= 10)//14 --> 1 + 4 important to use >=
                {
                    currentSecondLastDigit = (currentSecondLastDigit - 10) + 1;
                }
                totalSum = totalSum + currentSecondLastDigit;
                number4sumcheck = number4sumcheck / 10;
            }
            number4sumcheck = number;
            for(int i = 0; i < numberOfDigits; i++)
            {
            totalSum = totalSum + currentLastDigit;
            currentLastDigit = number4sumcheck % 10;

            number4sumcheck = number4sumcheck / 10;
            number4sumcheck = number4sumcheck / 10;
            }
            if(totalSum % 10 == 0)
            {
                printf("%s\n", CreditCard);
            }
      else
      {
        printf("INVALID\n");
      }
        }
        else
        {
            printf("INVALID\n");
        }

    }
    else if(numberOfDigits == 13)
    {
        if(firstTwoDigits >= 40 && firstTwoDigits < 50) //if begins with 4
        {
            CreditCard = ("VISA");
               for(int i = 0; i < numberOfDigits; i++)
            {

                number4sumcheck = number4sumcheck / 10; //divides by ten twice to get every other digit

                currentSecondLastDigit = number4sumcheck % 10;
                currentSecondLastDigit = currentSecondLastDigit * 2;
                if(currentSecondLastDigit >= 10)//14 --> 1 + 4
                {
                    currentSecondLastDigit = (currentSecondLastDigit - 10) + 1;
                }
                totalSum = totalSum + currentSecondLastDigit;
                number4sumcheck = number4sumcheck / 10;
            }
            number4sumcheck = number;

            for (int i = 0; i < numberOfDigits; i++)
            {
                totalSum = totalSum + currentLastDigit;
                currentLastDigit = number4sumcheck % 10;
                number4sumcheck = number4sumcheck / 10;
                number4sumcheck = number4sumcheck / 10;
            }
            if (totalSum % 10 == 0)
            {
            printf("%s\n", CreditCard);
            }
            else
            {
            printf("INVALID\n");
            }
        }
        else
        {
            printf("INVALID\n");
        }


    }
    else
    {
        printf("INVALID\n");
    }


}



/*




/*/