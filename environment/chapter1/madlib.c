//this script has strings, chars, floats, ints

#include <stdio.h>
#include <cs50.h>
#include <math.h>

int main(void)
{
void getInputs(void);
getInputs();
}

void getInputs(void)
{
    void getRating(void);

    string Name1 = get_string("Enter Name\n");

    string Gender = ("undefined");
    string GenderPossessive = ("undefined");
    printf("Is that a boy's name or a girl's name?\nM/F\n");
    char choice;
    scanf("%c", &choice);
    if(choice == 'm' || choice == 'M')
    {
        Gender = ("he");
        GenderPossessive = ("his");
    }
    else if(choice == 'f' || choice == 'F')
    {
        Gender = ("she");
        GenderPossessive = ("her");
    }
    else
    {
        printf("ERROR!!! THERE ARE TWO GENDERS!\n");
        Gender = ("it");
        GenderPossessive = ("their");
    }
    string Cushion = get_string(""); //prevents skipping an input caused by enter key after scanning

    string Adj1 = get_string("Enter an Adjective\n");

    string Place1 = get_string("Enter a Location\n");

    string Place2 = get_string("Enter a Second Location\n");

    string Verb1 = get_string("Enter a Verb\n");

    string Adj2 = get_string("Enter a Second Adjective\n");

    string Adj3 = get_string("Enter a Third Adjective\n");

    string NameFemale = get_string("Enter a Female Name\n");

    string Drink = get_string("Enter Something you Drink\n");

    string Adj4 = get_string("Enter a Fourth Adjective\n");



 printf("Ohhhhhhhhh, there once was a hero named %s the %s who came riding to %s from ole %s. \nAnd the braggart did swagger and %s %s blade, as %s told of %s battles and gold %s had made! \nBut then %s went %s, did %s the %s, when %s met the shieldmaiden, %s, who said: \n\"Oh you talk, and you lie, and you drink all our %s, now I think it's high time that you lie down and bleed!\" \nAnd so then came clashing and slashing of steel as the brave lass %s charged in full of zeal. \nAnd the braggart named %s was boastful no more, as %s %s %s head rolled around on the floor.", Name1, Adj1, Place1, Place2, Verb1, GenderPossessive, Gender, Adj2, Gender, Gender, Adj3, Name1, Adj1, Gender, NameFemale, Drink, NameFemale, Name1, GenderPossessive, Adj4, Adj2);

 getRating();
}









void getRating(void)
{
 void survey(void);

 float rating = get_float("\n\nPlease enter a rating with decimals on a scale of 1 to 10.\n");
 if(rating > 10)
 {

     printf("\nI'm flattered.");
 }
 else if(rating < 5 && rating >= 0)
 {
     printf("\nThanks.........................");
 }
 else if(rating >= 5 && rating >= 10)
 {
     printf("\nThank you!!!");
 }
 else if(rating < 0)
 {
     printf("\nERROR! DELETING SYS32!!!");
 }
 survey();
}

 void survey(void)
 {
 printf("\nWould you be interested in taking a short survey? Y/N\n");
 char choice2;
 scanf("%c", &choice2);
 if(choice2 == 'Y' || choice2 == 'y')
 {
    printf("\nWhat is your yearly income?\n");
    printf("");
    int yearlyIncome = get_int("");

    if(yearlyIncome >= 60000)
    {
        printf("\nERROR! CREDITCARDSTEALER.EXE HAS STOPPED RESPONDING!");
    }
    else
    {
        printf("\nThank you!");
    }
 }
 else if(choice2 == 'N' || choice2 == 'n')
 {
     printf("\nOK");
 }
 else
 {
     survey();
 }
 }


/*Oh, there once was a hero named Ragnar the Red Who came riding to Whiterun from ole Rorikstead

And the braggart did swagger and brandish his blade As he told of bold battles and gold he had made

But then he went quiet, did Ragnar the Red When he met the shieldmaiden, Matilda, who said:

"Oh you talk, and you lie, and you drink all our mead Now I think it's high time that you lie down and bleed"

And so then came clashing and slashing of steel As the brave lass Matilda charged in full of zeal

And the braggart named Ragnar was boastful no more When his ugly red head rolled around on the floor
/*/