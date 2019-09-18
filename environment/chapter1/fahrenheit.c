/* //THE REAL CODE APPARARTLY NOT ACCEPTABLE
//This program converts celsius to farrenheit and more

//((C * 9) / 5) + 32

//((°F) - 32) / 1.8





#include <stdio.h>
#include <cs50.h>

int main(void)
{
    void Ask();
    Ask();
}


void Ask(void)
{
    void Convert(void);
    void ConvertF(void);
    printf("Convert Celcius to Fahrenheit,\nor Fahrenheit to Celsius?\n F/C\n");
    char choice;
    scanf("%c",&choice);

    if(choice == 'c' || choice =='C')
    {
    Convert();
    }
    else if(choice == 'f' || choice =='F')
    {
    ConvertF();
    }
    else
    {
    printf("ERROR\n");
    return Ask();
    }

}





void Convert(void)
{
    float Celsius =  get_float("Enter Celsius: \n"); //IGNORE THE OUTPUT REPITITION PLEASE
    float Fahrenheit = ( ((Celsius * 9) / 5) + 32 );
    printf("%.1f degrees Celsius is %.1f degrees Fahrenheit.\n", Celsius, Fahrenheit);
    printf("%.1f\n", Fahrenheit);



}
void ConvertF(void)
{
    float Fahrenheit =  get_float("Enter Fahrenheit: \n"); //IGNORE THE OUTPUT REPITITION!!!
    float Celsius = ((Fahrenheit - 32) /1.8 );
    printf("%.1f degrees Fahrenheit is %.1f degrees Celsius.\n", Fahrenheit, Celsius);
    printf("%.1f\n", Celsius);



}

//((C * 9) / 5) + 32

//((°F) - 32) / 1.8
*/

//simplified version

#include <stdio.h>
#include <cs50.h>


int main(void)
{
float Celsius =  get_float("Enter Celsius: \n"); //get celsius
float Fahrenheit = ( ((Celsius * 9) / 5) + 32 ); //converts celsius
printf("%.1f\n", Fahrenheit); //prints celsius converted to fahrenheit
}
*/