# include <stdio.h>
# include <cs50.h>
# include <string.h> //for strlen
# include <ctype.h> //for toupper

# strlen = string length
# http://www.asciitable.com/
# python caeser.py 4
import cs50
import sys  # command prompts for python, len(sys.argv) !=2 is (argc != 2)


def main():

    if len(sys.argv) != 2:
        #
        print("ERROR! PLEASE INPUT A KEY!\n")
        exit(1)

    key = int(sys.argv[1])
    name = cs50.get_string("plaintext: ")
    print("ciphertext: ", end="")  # end="" prevents new lines because new lines are printed automatically
    output = []  # text will be "appended" here
    for symbol in name:  # each letter has its own value, for SYMBOL in NAME, means for each symbol in the string
        #
        if symbol.isalpha():  # isalpha checks if letter is uppercase
            # python - strings cannot be minused from ints, they need to be converted first
            symbolASCII = ord(symbol)
            if symbol.isupper():
                # chr(int) sets an int to a character, ord(char) converts it to its ASCII number
                convertedSymbolASCII = ((symbolASCII - 65 + key) % 26) + 65
                convertedSymbol = chr(convertedSymbolASCII)
                output.append(convertedSymbol)
            else:
                #
                convertedSymbolASCII = ((symbolASCII - 97 + key) % 26) + 97
                convertedSymbol = chr(convertedSymbolASCII)
                output.append(convertedSymbol)
        else:
            # no need to convert spaces
            output.append(symbol)

    print("".join(output))
    exit(0)


main()  # runs the code