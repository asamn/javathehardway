#include <stdio.h>
#include <cs50.h>//FVEK ZQU WKGFPESG
#include <string.h> //for strlen
#include <ctype.h> //for toupper

//strlen = string length
//http://www.asciitable.com/
int main(int argc, string argv[])
{
    if (argc != 2) //if more than one input
    {
        printf("ERROR! PLEASE INPUT A KEY!\n");
        return 1;
    }
    else
    {
        for (int i = 0; i < strlen(argv[1]); i++)//checks eachs letter for non-alphabet
        {
            if (isalpha(argv[1][i]))
            {

            }
            else
            {
                printf("ERROR! PLEASE INPUT LETTERS!\n");

                return 1;
            }
        }
    }
    string inputKey = argv[1];
    int stringLength = strlen(inputKey); //length of arg, for wrapping
    string name = get_string("plaintext: ");
    printf("ciphertext: ");
    for (int i = 0, x = 0; i < strlen(name); i++) //i for tracking name, x is for tracking and wrapping the arg
    {
        int currentKey = tolower(inputKey[x % stringLength]) - 'a'; //caps do not matter when getting arg

        if (isupper(name[i]))
        {
            printf("%c", 'A' + (name[i] - 'A' + currentKey) % 26);
            x++;
        }
        else if (islower(name[i]))
        {
            printf("%c", 'a' + (name[i] - 'a' + currentKey) % 26);
            x++;
        }
        else
        {
            printf("%c", name[i]);//do not change x, skip over sped characters
        }
    }
    printf("\n");//for check50
    return 0;
}