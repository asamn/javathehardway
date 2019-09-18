# :( input of 23 yields output of 92, cs50 does not take in account half dollar coins
# include <stdio.h>
# include <cs50.h>
# include <math.h>

import cs50
import math


def main():
    print("THIS PROGRAM DOES NOT COUNT HALF DOLLAR COINS BECASUE CS50 IS MEGALOMANIAC TRASH\n\n")

    print("Enter Amount\n")  # prevents output repitition from pressing enter key
    amount = cs50.get_float("")  # prevents output repitition
    changedAmount = round(amount * 100)  # double is too precise
    coins = (0)
    HalfDollars = (0)  # nonexistent
    Quarters = (0)
    Dimes = (0)
    Nickels = (0)
    Pennies = (0)
    DollarCoins = (0)

    if amount <= 0:
        # asks again
        main()
    else:

        while changedAmount == 25 or changedAmount > 25:
            #
            changedAmount = changedAmount - 25
            coins = coins + 1
            Quarters = Quarters + 1

        while changedAmount == 10 or changedAmount > 10:
            #
            changedAmount = changedAmount - 10
            coins = coins + 1
            Dimes = Dimes + 1

        while changedAmount == 5 or changedAmount > 5:
            #
            changedAmount = changedAmount - 5
            coins = coins + 1
            Nickels = Nickels + 1

        while changedAmount > 0 and changedAmount < 5:  # its zero becasue > 1 is two
            #
            changedAmount = changedAmount - 1
            coins = coins + 1
            Pennies = Pennies + 1

    if changedAmount > 0.1 and changedAmount < 1:  # prevents missing cent from decimals between 1 and 0, 0.1 because it could take -0.000000015, 0.999999 is the cause of missing cents
        #
        changedAmount = changedAmount - 1
        coins = coins + 1
        Pennies = Pennies + 1

    if (changedAmount < -0.1):  # prevents extra cent, -0.1 because it could take in something like -0.00000015
        #
        changedAmount = changedAmount + 1
        coins = coins - 1
        Pennies = Pennies - 1

    print(coins)


main()  # runs the function