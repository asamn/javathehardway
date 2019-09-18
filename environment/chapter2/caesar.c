#include <stdio.h>
#include <cs50.h>
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

        int key = atoi(argv[1]);
        string name = get_string("plaintext: ");
        printf("ciphertext: ");
        for (int i = 0; i < strlen(name); i++) //each letter has its own value
        {
            if (isupper(name[i]))//isupper checks if letter is uppercase
            {
                printf("%c", (name[i] - 'A' + key) % 26 + 'A');
                //adding to a char changes its letter, % rolls back, adding a 'character' adds the the value of the character, 'A' = 65
            }
            else
            {
                printf("%c", (name[i] - 'a' + key) % 26 + 'a'); //'a' and 'A' have different values
            }

        }
        printf("\n"); //for check50
        return 0;
    }

}
