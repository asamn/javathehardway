#include <stdio.h>
#include <cs50.h>

int main(void)
{
    void makeChange(void);
     makeChange();
}






    void makeChange(void)
    {
    void makeChange(void);
    float amount = (0.99);
    float changedAmount = amount;
    int coins = (0);
    int HalfDollars = (0);
    int Quarters = (0);
    int Dimes = (0);
    int Nickels = (0);
    int Pennies = (0);





while(changedAmount > 0)
       {


         if(changedAmount == 0.50 || changedAmount > 0.50)
            {
            changedAmount = changedAmount - 0.50;
            coins = coins + 1;
            HalfDollars = HalfDollars + 1;
            }
         else if(changedAmount == 0.25 || changedAmount > 0.25)
            {
            changedAmount = changedAmount - 0.25;
            coins = coins + 1;
            Quarters = Quarters + 1;
            }
         else if(changedAmount == 0.10 || changedAmount > 0.10)
            {
            changedAmount = changedAmount - 0.10;
            coins = coins + 1;
            Dimes = Dimes + 1;
            }
        else if(changedAmount == 0.05 || changedAmount > 0.05)
            {
            changedAmount = changedAmount - 0.05;
            coins = coins + 1;
            Nickels = Nickels + 1;
            }
        else if(changedAmount == 0.00 || changedAmount > 0.00)
            {
            changedAmount = changedAmount - 0.01;
            coins = coins + 1;
            Pennies = Pennies + 1;
            }



    }
    printf("%i coins changed from %f... %i half dollars, %i quarters, %i dimes, %i nickels, and %i pennies. %f", coins, amount, HalfDollars, Quarters, Dimes, Nickels, Pennies, changedAmount);

}