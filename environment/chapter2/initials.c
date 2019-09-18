#include <stdio.h>
#include <cs50.h>
#include <math.h>
#include <string.h> //for strlen
#include <ctype.h> //for toupper

//strlen = string length

int main(void)
{

    bool firstLetter = true;
    string name = get_string();

    for (int i = 0; i < strlen(name); i++) //i keeps track of current letter of string, i < strleng i++ ends when i reaches length
    {

        char character = name[i]; //[] is array. i is number in array
        if (character == ' ') //prevents double space
        {
            firstLetter = false;
        }
        if (firstLetter == true)
        {
            printf("%c", toupper(character)); //%c is a character, toupper converts to uppercase
            firstLetter = false;
        }
        if (character == ' ')
        {
            firstLetter = true;//spaces mark the next name of a full name
        }
    }

    printf("\n"); //for check50

}
