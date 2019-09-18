//:( input of 23 yields output of 92, cs50 does not take in account half dollar coins
#include <stdio.h>
#include <cs50.h>
#include <math.h>

int main(void)
{
    printf("THIS PROGRAM DOES NOT COUNT HALF DOLLAR COINS BECASUE CS50 IS MEGALOMANIAC TRASH\n\n");
    void makeChange(void);
    makeChange();
}






void makeChange(void)
{
    void makeChange(void);
    printf("Enter Amount\n"); //prevents output repitition from pressing enter key
    float amount = get_float(""); //prevents output repitition
    int changedAmount = round(amount * 100); //double is too precise
    int coins = (0);
    int HalfDollars = (0);
    int Quarters = (0);
    int Dimes = (0);
    int Nickels = (0);
    int Pennies = (0);
    int DollarCoins = (0);

    if (amount < 0)
    {

        return makeChange();


    }


else
{
    while (changedAmount == 25 || changedAmount > 25)
    {
        changedAmount = changedAmount - 25;
        coins = coins + 1;
        Quarters = Quarters + 1;
    }
    while (changedAmount == 10 || changedAmount > 10)
    {
        changedAmount = changedAmount - 10;
        coins = coins + 1;
        Dimes = Dimes + 1;
    }
    while (changedAmount == 5 || changedAmount > 5)
    {
        changedAmount = changedAmount - 5;
        coins = coins + 1;
        Nickels = Nickels + 1;
    }

while (changedAmount > 0 && changedAmount < 5) //its zero becasue > 1 is two
{
    changedAmount = changedAmount - 1;
    coins = coins + 1;
    Pennies = Pennies + 1;
}
if(changedAmount > 0.1 && changedAmount < 1) //prevents missing cent from decimals between 1 and 0, 0.1 because it could take -0.000000015, 0.999999 is the cause of missing cents
{
    changedAmount = changedAmount - 1;
    coins = coins + 1;
    Pennies = Pennies + 1 ;
}

if (changedAmount < -0.1) //prevents extra cent, -0.1 because it could take in something like -0.00000015
{
    changedAmount = changedAmount + 1;
    coins = coins - 1;
    Pennies = Pennies - 1 ;
}

    printf("%i\n", coins);

}
}

















/*
//rejected by check50 but far superior
#include <stdio.h>
#include <cs50.h>
#include <math.h>

int main(void)
{
    void makeChange(void);
    makeChange();
}






void makeChange(void)
{
    bool IncludeDollarCoins = false;
    printf("Include dollar coins?\nY/N\n");
    char choice; //creates choice
    scanf("%c", &choice);
    if(choice == 'n'|| choice == 'N')
    {
        IncludeDollarCoins = false;
    }
    else if(choice == 'y'|| choice =='Y')
    {
        IncludeDollarCoins = true;
    }
    else
    {
        return makeChange();
    }

    void makeChange(void);
    printf("Enter Amount\n"); //prevents output repitition from pressing enter key
    double amount = get_float(""); //prevents output repitition
    float changedAmount = round(amount * 100); //double is too precise
    int coins = (0);
    int HalfDollars = (0);
    int Quarters = (0);
    int Dimes = (0);
    int Nickels = (0);
    int Pennies = (0);
    int DollarCoins =(0);


    if (amount < 0)
    {
        printf("That is not a valid amount, continue anyway?\n");

    }


if (IncludeDollarCoins == true)
{
while (changedAmount == 100|| changedAmount > 100)
{
    changedAmount = changedAmount - 100;
    coins = coins + 1;
    DollarCoins = DollarCoins + 1;
}
}

while (changedAmount == 50 || changedAmount > 50)
{
    changedAmount = changedAmount - 50;
    coins = coins + 1;
    HalfDollars = HalfDollars + 1;
}
while (changedAmount == 25 || changedAmount > 25)
{
    changedAmount = changedAmount - 25;
    coins = coins + 1;
    Quarters = Quarters + 1;
}
while (changedAmount == 10 || changedAmount > 10)
{
    changedAmount = changedAmount - 10;
    coins = coins + 1;
    Dimes = Dimes + 1;
}
while (changedAmount == 5 || changedAmount > 5)
{
    changedAmount = changedAmount - 5;
    coins = coins + 1;
    Nickels = Nickels + 1;
}
while (changedAmount > 0 && changedAmount < 5) //its zero becasue > 1 is two
{
    changedAmount = changedAmount - 1;
    coins = coins + 1;
    Pennies = Pennies + 1;
}
if(changedAmount > 0 && changedAmount < 1) //prevents missing cent from decimals between 1 and 0
{
    changedAmount = changedAmount - 1;
    coins = coins + 1;
    Pennies = Pennies + 1 ;
}

if (changedAmount < -0.1) //prevents extra cent
{
    changedAmount = changedAmount + 1;
    coins = coins - 1;
    Pennies = Pennies - 1 ;
}

    printf("%i\n", coins);
    if (IncludeDollarCoins== false)
    {
    printf("%i coins changed from %.2f... %i half dollars, %i quarters, %i dimes, %i nickels, and %i pennies.\n %f", coins, amount, HalfDollars, Quarters, Dimes, Nickels, Pennies, changedAmount);
    }
    else
    {
    printf("%i coins changed from %.2f... %i dollar coins, %i half dollars, %i quarters, %i dimes, %i nickels, and %i pennies.\n", coins, amount, DollarCoins, HalfDollars, Quarters, Dimes, Nickels, Pennies);
    }



}














/*/


































/*while(changedAmount > 0) does not work becasue it creates an endless loop
{
        if (changedAmount == 100 || changedAmount > 100)
        {
            changedAmount = changedAmount - 100;
            coins = coins + 2;
            HalfDollars = HalfDollars + 2;
        }

        else if(changedAmount == 50 || changedAmount > 50)
            {
            changedAmount = changedAmount - 50;
            coins = coins + 1;
            HalfDollars = HalfDollars + 1;
            }
         else if(changedAmount == 25 || changedAmount > 25)
            {
            changedAmount = changedAmount - 25;
            coins = coins + 1;
            Quarters = Quarters + 1;
            }
         else if(changedAmount == 10 || changedAmount > 10)
            {
            changedAmount = changedAmount - 10;
            coins = coins + 1;
            Dimes = Dimes + 1;
            }
        else if(changedAmount == 5 || changedAmount > 5)
            {
            changedAmount = changedAmount - 5;
            coins = coins + 1;
            Nickels = Nickels + 1;
            }
        if(changedAmount == 1 || changedAmount > 1)
        {

            changedAmount = changedAmount - 1;
            coins = coins + 1;
            Pennies = Pennies + 1;
        }
}
/*///cs50/2017/ap/pennie