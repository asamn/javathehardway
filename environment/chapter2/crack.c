#include <stdio.h>
#include <cs50.h>
#include <string.h> //for strlen
#include <ctype.h> //for toupper
#define _XOPEN_SOURCE//for crypt
#include <unistd.h>

//strlen = string length
//http://www.asciitable.com/
/*
  CRYPT(3)                                                                                                                                                       Linux Programmer's Manual                                                                                                                                                      CRYPT(3)

NAME
       crypt, crypt_r - password and data encryption
   crypt() is the password encryption function.  It is based on the Data Encryption Standard algorithm with variations intended (among other things) to discourage use of hardware implementations of a key search.

       key is a user's typed password.

       salt is a two-character string chosen from the set [a–zA–Z0–9./].  This string is used to perturb the algorithm in one of 4096 different ways.

       By  taking the lowest 7 bits of each of the first eight characters of the key, a 56-bit key is obtained.  This 56-bit key is used to encrypt repeatedly a constant string (usually a string consisting of all zeros).  The returned value points to the encrypted password, a series of 13 printable ASCII characters (the first two characters
 Manual page crypt(3) line 23/91 31% (press h for help or q to quit)

Glibc notes
       The glibc2 version of this function supports additional encryption algorithms.

       If salt is a character string starting with the characters "$id$" followed by a string terminated by "$":

   $id$salt$encrypted

       then instead of using the DES machine, id identifies the encryption method used and this then determines how the rest of the password string is interpreted.  The following values of id are supported:
 Manual page crypt(3) line 56/91 71% (press h for help or q to quit)


 1   | MD5
              2a  | Blowfish (not in mainline glibc; added in some
                  | Linux distributions)
              5   | SHA-256 (since glibc 2.7)
              6   | SHA-512 (since glibc 2.7)
 Manual page crypt(3) line 65/91 78% (press h for
     "salt" stands for the up to 16 characters following "$id$" in the salt.  The encrypted part of the password string is the actual computed password.  The size of this string is fixed:
            MD5     | 22 characters
       SHA-256 | 43 characters
       SHA-512 | 86 characters

SEE ALSO
       login(1), passwd(1), encrypt(3), getpass(3), passwd(5)

/*/
int main(int argc, string argv[])
{
    if (argc != 2) //if more than one input
    {
        printf("ERROR! PLEASE INPUT A KEY!\n");
        return 1;
    }f
    else
    {
    string hash = argv[1];
    for (int i = 0; i < 5; i++)
    {
        printf("%c", 'a' + (hash[i] - 'a') % 26);


    }

    }
}