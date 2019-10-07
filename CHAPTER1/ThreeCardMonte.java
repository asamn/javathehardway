import java.util.Scanner;

public class ThreeCardMonte
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int RNG, jackpotRNG, choice, currency = 500, bet, maxBet = 1000;


        while(currency > 0)
        {
            System.out.println("Your current currency: " + currency);
            System.out.print("Please enter your bet, sir. 0-" + maxBet + ": ");
            bet = input.nextInt();

            while (bet > maxBet || bet < 0 || bet > currency) //if bet is greater than max bet then repeat
            {
                if (bet > maxBet || bet < 0)
                {
                    System.out.print("Sorry, please bet between 0-" + maxBet + "\nBet: ");
                }
                else if (bet > currency)
                {
                    System.out.print("You don't have " + bet + " currency!\nBet: ");
                }

                bet = input.nextInt();
            }

            String cardOneTile = " ## ", cardTwoTile = " ## ", cardThreeTile = " ## ", aceTile = " AA ", jokerTile = " JJ ";

            System.out.print("\nWhich one is the ace?\n");
            System.out.println("\t" + cardOneTile + cardTwoTile + cardThreeTile);// layer 1
            System.out.println("\t" + cardOneTile + cardTwoTile + cardThreeTile);// ## ## layer 2
            System.out.println("\t 1   2   3\t");

            choice = input.nextInt();
            while (choice <= 0 || choice >= 4)
            {
                System.out.println("Pick 1-3, dummy.");
                choice = input.nextInt();
            }

            RNG = 1 + (int)(3 * Math.random());
            jackpotRNG = 1 + (int)(20 * Math.random()); //1 in 20 chance for jackpot
            if ( jackpotRNG == 1)
            {
                RNG = 777;
                cardOneTile = jokerTile;
                cardTwoTile = jokerTile;
                cardThreeTile = jokerTile;
            }
            else
            {
                if (RNG == 1)
                {
                    cardOneTile = aceTile;
                }
                else if (RNG == 2)
                {
                    cardTwoTile = aceTile;
                }
                else if (RNG == 3)
                {
                    cardThreeTile = aceTile;
                }
                else
                {
                    //error
                }
            }


            System.out.println("\n\t" + cardOneTile + cardTwoTile + cardThreeTile);// layer 1
            System.out.println("\t" + cardOneTile + cardTwoTile + cardThreeTile);// ## ## layer 2
            System.out.println("\t 1   2   3\t");

            if (RNG == 777)
            {
                System.out.println("\nJACKPOT! 3X your betted amount!!!\n");
                currency = currency + (bet*3);
            }
            else if (choice == RNG)
            {
                currency = currency + bet;
                System.out.println("YOU WIN!\n");
            }
            else
            {
                currency = currency - bet;
                System.out.println("LOSER!!!\n");
            }
            if (currency >= maxBet - 500)
            {
                maxBet = maxBet + 500;
                System.out.println("Your max bet has been raised!!!");
            }


        }
        if (currency == 0)
        {
            System.out.println("Currency: 0");
        }
        else
        {
            System.out.println("Debt: " + currency);
        }
        System.out.println("Get out of here! You're a hot mess. ");

    }
}


