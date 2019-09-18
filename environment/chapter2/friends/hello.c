/**
 * hello.c
 *
 * CS50 AP
 * Old Friends
 *
 * Greets a user by their name.
 */

#include <cs50.h>
#include <stdio.h>

int main(int argc, string argv[])
{
    // collect a string from the user, then print their name



    string name = (argv[1]);


    if (argc != 2) //for check50
    {

        return 1;

    }
    else
    {
        printf("Hello, %s!\n", name);
        return 0;

    }

}
