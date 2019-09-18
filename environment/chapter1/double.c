#include <stdio.h>
#include <cs50.h>
#include <math.h>


void doubling();


int main(void)
{
    doubling();
}


void ask();



void doubling(void)
{


    printf("\n                   !#########       #\n               !########!          ##!\n            !########!               ###\n         !##########                  ####\n       ######### #####                ######\n        !###!      !####!              #####\n          !           #####            ######!\n                        !####!         #######\n                           #####       #######\n                             !####!   #######!\n                                ####!########\n             ##                   ##########\n           ,######!          !#############\n         ,#### ########################!####!\n       ,####'     ##################!'    #####\n     ,####'            #######              !####!\n    ####'                                      #####\n    ~##                                          ##~\n");

    printf("\n   NUMBER DOUBLER V2.51\n☭☭☭ MADE IN THE USSR ☭☭☭\n\n");

    int number = get_int("Enter a Number\n");

    if (number == 0 || number < 0)
    {
        printf("CYKA BLYAT! NUMBER NOT VALID!\n");
    }

    else
    {
    for (int i = 1; i <= number; i++)
    {
        if(i % 2 == 0)
        {
            printf("%i\n", i * 2);
        }
        else
        {
            printf("%i\n", i);
        }
    }
    }

}





/*
//ask integer
//print number from one
//every other input print double the value
//1,4,3 8 5, 12,7
/*/





