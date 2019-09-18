#include <stdio.h>
#include <cs50.h>


int main(int argc, string argv[])
{
    if (argc != 4) //three inputs needed
    {
        return 1;
    }
    else
    {
        float firstNumber =  atof(argv[1]); //gets first input
        float secondNumber = atof(argv[3]); //gets third input because second is operator
        int modNumber; //for finding %
        string plus = (argv[2]); //gets second input operator which is a char
        char plusChar = plus[0];//converts string to char
        float result;

        if (plusChar == '+')
        {
            result = firstNumber + secondNumber;
            printf("%f\n", result);
            return 0;
        }
        else if (plusChar == '-')
        {
            result = firstNumber - secondNumber;
            printf("%f\n", result);
            return 0;
        }
        else if (plusChar == 'x' || plusChar == 'X') //star does not work
        {
            result = firstNumber * secondNumber;
            printf("%f\n", result);
            return 0;
        }
        else if (plusChar == '/')
        {
            result = firstNumber / secondNumber;
            printf("%f\n", result);
            return 0;
        }
        else if (plusChar == '%') //for remainders
        {
            modNumber = firstNumber / secondNumber; //float does not work
            result = firstNumber - (secondNumber * modNumber);
            printf("%f\n", result);
            return 0;
        }
        else
        {
            printf("ERROR! NO OPERATOR FOUND!\n");
            return 1;
        }
    }
}