//check50 is rigged
#include <stdio.h>
#include <math.h>
#include <cs50.h>

int main(void)
{
    void makePennies(void);
    makePennies();
}

void makePennies(void)
{

 int Days = get_double("How many days? \n"); //Days used for output //30
 double DaysF = Days; //Days put into function
   if(Days < 0.0) //If is number
   {
   printf("PLEASE ENTER A REAL INTEGER!!! \n");
   return makePennies();
   }
   else if(Days < 28 || Days > 31)
   {
    printf("That number does not represent the days of any month.\n");
    return makePennies();

   }



 double PennyMultiplier = get_double("Multiply pennies by how much? \n"); //2
   if(PennyMultiplier < 0.0)
   {
   printf("PLEASE ENTER A REAL INTEGER!!! \n");
   return makePennies();
   }

 double PenniesStart = get_double("How many pennies do you start with? \n"); //1
   if(PenniesStart < 0.0)
   {
   printf("PLEASE ENTER A REAL INTEGER!!! \n");
   return makePennies();
   }

   else
   {
    while (DaysF > 0)
   {

    PenniesStart = PenniesStart * PennyMultiplier;
      DaysF--;

   }
    double Result = PenniesStart;
    double ConvertedUSDollars = (Result * 0.01);
    double ConvertedZimbabweDollars = ConvertedUSDollars * 361.9;
    printf("%.i days is %.f pennies... \n", Days, Result);
    printf("That is %.2f USD. \n", ConvertedUSDollars);
    printf("That is also %.2f Zimbabwe Dollars as of October 30th, 2018. \n", ConvertedZimbabweDollars);
    printf("$%.2f\n", ConvertedUSDollars);
   }



}




//1 × 2^30

//1 USD = 361.900 ZWD

//cs50/2017/ap/pennies

//:( 28 days, 1 penny on day one yields $2684354.55 did not find "$2684354.55\n" NO, ITS NOT
