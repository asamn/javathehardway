import java.util.Scanner;
import static java.lang.System.*;

//Blackjack is played with 52 cards. The values of the cards correspond to their numerical value from 2-10. All face cards (Jack, Queen, King) count 10 and the Ace either 1 or 11, as the holders desires. A score with an ace valued as 11 is named soft-hand.

//1 - ace, 11 - jack, 12 queen, 13, king, joker

// int aceCards, twoCards, threeCards, fourCards, fiveCards, sixCards, sevenCards, eightCards, nineCards, tenCards, jackCards, queenCards, kingCards;

public class Blackjack
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        int card, total = 0, cardValue = 0, cardDealer, currency = 500, draws = 0, dealerTotal = 0, bet = 0, maxBet = 1000;
        int[] cardsInDeck = {4,4,4,4,4,4,4,4,4,4,4,4,4}; //it is possible to get four 2's, or 4 ace's, there are four cards of each type in a 52 card deck
        int[] storeItems = {0,0,0};
        int[] activatedItems = {0,0,0};
        int[] storeCosts = {100, 500, 40};//joker card, plat, reverse
        String[] storeStrings = {"Lucky Joker Card ", "Platimum Chips ", "Uno Reverse Card "}, storeDescriptions = {"Play this card to increase your odds of getting 21! Cannot double down with it. ", "Platimum chips double the amount you earn, but not what you lose! One time purchase only! ", "Play this card to prevent you from losing currency! "};
        String cardString = "", answer = "", firstDealerCard = "";
        boolean stand = false, dealerStand = true, dealerRevealCard = false;//standing ends turn


        while (currency > 0)
        {
            //resets everything for new game
            draws = 0;
            total = 0;
            dealerTotal = 0;
            cardValue = 0;
            for (int i = 0; i < activatedItems.length; i++)
            {
                activatedItems[i] = 0;
            }
            if (storeItems[1] == 1) //if have plat chip, items that are one purchase only
            {
                activatedItems[1] = 1;//always active
            }
            stand = false;
            dealerStand = true;
            dealerRevealCard = false;
            for (int i = 0; i < cardsInDeck.length; i++) //puts cards back in deck
            {
                cardsInDeck[i] = 4;
                //out.println(cardsInDeck[i]);
            }
            do
            {
                if (storeItems[1] == 1) //if have plat chip, items that are one purchase only
                {
                    activatedItems[1] = 1;//always active
                }
                out.println("\nCurrency: " + currency);
                out.print("Press 'B' to bet, press 'S' to enter shop, press 'I' to view your inventory. ");
                answer = enterChoice(answer, input);

                if (answer.equalsIgnoreCase("s") || answer.equalsIgnoreCase("shop"))
                {
                    currency = enterShop(currency, storeItems, storeCosts, storeStrings, storeDescriptions, input);
                }
                if (answer.equalsIgnoreCase("i") || answer.equalsIgnoreCase("inventory"))
                {
                    activatedItems = viewItems(storeItems, activatedItems, storeStrings, input);
                }
            }
            while (!answer.equalsIgnoreCase("b") && !answer.equalsIgnoreCase("bet"));

            bet = enterBet(bet,maxBet,currency, input);

            while (stand == false)
            {
                //DRAW CARD
                card = 1 + (int)(13 * Math.random()); //1-13, 13 card variations

                if (activatedItems[0] == 1 && draws >= 2) //if lucky card activated
                {
                    if (total == 21)
                    {
                        card = 1;
                        out.println("DUMMY!");
                    }
                    else if (21 - total < 10) //if difference is less than ten 21-19 =
                    {
                       card = 21 - total;
                    }
                    else
                    {
                        card = 10; //draws ten card
                    }
                    out.println("LUCKY JOKER CARD ACTIVATED!");
                }

                while (cardsInDeck[card - 1] == 0) //card minus one to match array, if there are no cards left, redraw!
                {
                    out.println("No " + card + " cards left.. ");
                    card = 1 + (int)(13 * Math.random()) ; //1-13, 13 card variations
                    countDeckCards(card, cardsInDeck);
                }

                countDeckCards(card, cardsInDeck);//removes card from deck after drawing, check if cards are left before removing
                cardValue = findValue(card, cardValue, total, dealerTotal, dealerRevealCard, stand); //to add to total
                cardString = setCardString(card, cardString);//initializes variables, cardstring has to be set to his, parentheses are parameters that initialize

                draws = draws + 1; //number of draws + 1;

                printCard(cardString);

                total = total + cardValue; //add value

                if (draws > 1)//does not print this on first two card draws
                {
                    out.println("\nYour total: " + total);
                }

                if (draws >= 2)
                {
                    if (draws == 2)// after drawing first cards, dealer shows his first one
                    {
                        dealerRevealCard = true;
                        card = 1 + (int)(13 * Math.random());
                        while (cardsInDeck[card - 1] == 0)
                        {
                            out.println("No " + card + " cards left.. ");
                            card = 1 + (int)(13 * Math.random()) ; //1-13, 13 card variations
                            countDeckCards(card, cardsInDeck);
                        }

                        countDeckCards(card, cardsInDeck);//removes card from deck after drawing, check if cards are left before removing
                        cardValue = findValue(card, cardValue, total, dealerTotal, dealerRevealCard, stand);//sets value for dealer
                        firstDealerCard = setCardString(card, cardString);
                        dealerTotal = dealerTotal + cardValue;

                        out.println("Dealer's first card: " + firstDealerCard);
                        dealerRevealCard = false;
                    }

                    if (total > 21)
                    {
                        out.println("BUST! ");
                        stand = true;
                        total = 0;
                        dealerTotal = 1;//if you bust, dealer doesnt have to draw
                    }
                    else
                    {
                        if (total == 21)
                        {
                            out.println("Blackjack!");// still chance for push
                        }
                        out.print("\nHit or stand? ");
                        if (draws == 2)//on first play only
                        {
                            out.print("Double down? ");
                        }
                        answer = input.next();
                        while (!answer.equalsIgnoreCase("hit") && !answer.equalsIgnoreCase("stand") && !answer.equalsIgnoreCase("h") && !answer.equalsIgnoreCase("s")) //use and because any of the answers will break
                        {
                            if (draws == 2)//on first play only
                            {
                                if (answer.equalsIgnoreCase("d") || answer.equalsIgnoreCase("double"))
                                {
                                    out.println("Double down! ");
                                    break;
                                }
                            }
                            else
                            {
                                out.print("\nHit or stand? ");
                                answer = input.next();
                            }

                        }
                        if (answer.equalsIgnoreCase("hit") || answer.equalsIgnoreCase("h"))
                        {
                            stand = false;
                        }
                        else if (answer.equalsIgnoreCase("d") || answer.equalsIgnoreCase("double"))
                        {
                            bet = bet * 2;
                            card = 1 + (int)(13 * Math.random()) ; //1-13, 13 card variations

                            while (cardsInDeck[card - 1] == 0) //card minus one to match array, if there are no cards left, redraw!
                            {
                                out.println("No " + card + " cards left.. ");
                                card = 1 + (int)(13 * Math.random()); //1-13, 13 card variations
                                countDeckCards(card, cardsInDeck);
                            }
                            countDeckCards(card, cardsInDeck);//removes card from deck after drawing, check if cards are left before removing
                            cardValue = findValue(card, cardValue, total, dealerTotal, dealerRevealCard, stand); //to add to total
                            cardString = setCardString(card, cardString);//initializes variables, cardstring has to be set to his, parentheses are parameters that initialize
                            printCard(cardString);
                            total = total + cardValue; //add value
                            out.println("\nYour total: " + total);
                            if (total > 21)
                            {
                                out.println("BUST! ");
                                total = 0;
                                dealerTotal = 1;
                            }
                            else if (total == 21)
                            {
                                out.println("Blackjack!");
                            }
                            stand = true;
                        }
                        else
                        {
                            stand = true;
                        }
                    }
                }
            }

            draws = 0;
            stand = true;
            dealerStand = false;

            //dealers turn

            while (dealerStand == false && total != 0) //!0 means not busted
            {
                if (draws == 0)//on first turn
                {
                    out.println("\n\nDealer's turn");
                    out.println("Dealers current cards: ");
                    cardString = firstDealerCard;//sets to thos for the print function
                    printCard(cardString);
                }
                //DRAW CARD
                card = 1 + (int)(13 * Math.random());
                countDeckCards(card, cardsInDeck);//removes card from deck after drawing, check if cards are left before removing

                while (cardsInDeck[card - 1] == 0) //card minus one to match array, if there are no cards left, redraw!
                {
                    out.println("No " + card + " cards left.. ");
                    card = 1 + (int)(13 * Math.random()) ; //1-13, 13 card variations
                    countDeckCards(card, cardsInDeck);
                }

                cardValue = findValue(card, cardValue, total, dealerTotal, dealerRevealCard, stand);
                cardString = setCardString(card, cardString);
                printCard(cardString);

                dealerTotal = dealerTotal + cardValue; //add value
                out.println("Dealer's total: " + dealerTotal + "\tYour total: " + total);

                if (dealerTotal == 21)
                {
                    out.println("Dealer gets blackjack! ");
                    dealerStand = true;
                }

                else if (dealerTotal > 21)
                {
                    out.println("Dealer busts!");
                    dealerTotal = 0;
                    dealerStand = true;
                }

                else if (dealerTotal >= 17 )
                {
                    out.println("Dealer stands. ");
                    dealerStand = true;
                }

                else
                {
                    out.println("Dealer draws... ");
                }

                draws++;
            }

            if (total > dealerTotal)
            {
                out.println("You win!");
                if (activatedItems[1] == 1)//if plat chip enable
                {
                    bet = bet * 2;
                    out.println("Platimum chips double your win! ");
                }
                currency = currency + bet;
            }
            else if (total == dealerTotal)
            {
                out.println("Push! ");
            }
            else
            {
                out.println("You lose!");
                if (activatedItems[2] == 1) //if uno card active
                {
                    bet = 0;
                    out.println("Uno reverse card saved you from losing currency! ");
                }
                currency = currency - bet;
            }
            if (currency >= maxBet - 300)
            {
                maxBet = maxBet + 1000;
                out.println("Your max bet has increased, ");
            }

        }
        if (currency == 0) //if out of currency
        {
            System.out.println("Currency: 0");
        }
        else
        {
            System.out.println("Debt: " + currency);
        }
        System.out.println("Get out of here! You're a hot mess. ");

    }


    public static String setCardString(int card, String cardString) //void means it returns nothing so theres no void, int card initializes card from main, string cardstring initializes cardstring
    {
        switch(card) //checks card int, sets value and string to display
        {
            case(1):
                cardString = "A";
                break;

            case(2):
                cardString = "2";
                break;

            case(3):
                cardString = "3";
                break;

            case(4):
                cardString = "4";
                break;

            case(5):
                cardString = "5";
                break;

            case(6):
                cardString = "6";
                break;

            case(7):
                cardString = "7";
                break;

            case(8):
                cardString = "8";
                break;

            case(9):
                cardString = "9";
                break;

            case(10):
                cardString = "10";
                break;

            case(11):
                cardString = "J";
                break;

            case(12):
                cardString = "Q";
                break;

            case(13):
                cardString = "K";
                break;

            default:
                cardString = "error";
                break;
            }
        return cardString; //this sets the value of this function, but the value in main has to be set to the function
    }



    public static int findValue(int card, int cardValue, int total, int dealerTotal, boolean dealerRevealCard, boolean stand)//returns int, so void is int
    {
        if (card == 1)
            {
                if (stand == false && dealerRevealCard == false)//if your turn, uses your total, and if its not drawing dealers first card
                {
                    cardValue = 11;

                    if (total >= 11)
                    {
                        out.println("Ace turned to one value. ");
                        cardValue = 1;
                    }
                }
                else//if dealers turn, uses dealers total, prevents dealer's ace from turning into one based on players total, also if dealers drawing first card
                {
                    cardValue = 11;

                    if (dealerTotal >= 11)
                    {
                        out.println("Ace turned to one value. ");
                        cardValue = 1;
                    }
                }
            }
            else if ( card == 11 || card == 12 || card == 13) //11J 12Q 13K
            {
                cardValue = 10;
            }
            else
            {
                cardValue = card;
            }

        return cardValue;//sets value of function
    }



    public static void countDeckCards(int card, int[] cardsInDeck)//does not need a return
    {

        switch(card) //checks card int, sets value and string to display
        {
            case(1):
                cardsInDeck[0]--;
                break;

            case(2):
                cardsInDeck[1]--;
                break;

            case(3):
                cardsInDeck[2]--;
                break;

            case(4):
                cardsInDeck[3]--;
                break;

            case(5):
                cardsInDeck[4]--;
                break;

            case(6):
                cardsInDeck[5]--;
                break;

            case(7):
                cardsInDeck[6]--;
                break;

            case(8):
                cardsInDeck[7]--;
                break;

            case(9):
                cardsInDeck[8]--;
                break;

            case(10):
                cardsInDeck[9]--;
                break;

            case(11):
                cardsInDeck[10]--;
                break;

            case(12):
                cardsInDeck[11]--;
                break;

            case(13):
                cardsInDeck[12]--;
                break;

            default:
                out.println("ERROR");
                break;
            }
            //out.print("cards left of" + card + " ");
            //out.println(cardsInDeck[card - 1]); //minus one to match the array
    }



    public static void printCard(String cardString)
    {
        if (cardString.length() == 2)// if double digits
        {
            out.println("------------");
            out.println("|" + cardString + "        |");
            out.println("|          |");
            out.println("|          |");
            out.println("|          |");
            out.println("|        " + cardString +"|");
            out.println("------------");
        }
        else
        {
            out.println("------------");
            out.println("|" + cardString + "         |");
            out.println("|          |");
            out.println("|          |");
            out.println("|          |");
            out.println("|         " + cardString +"|");
            out.println("------------");
        }

    }

    public static int enterBet(int bet, int maxBet, int currency, Scanner input)
    {
        out.println("\n\nYour current currency: " + currency);
        out.println("Please enter your bet, sir. 0-" + maxBet);
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

        return bet;
    }



    public static String enterChoice (String answer, Scanner input)
    {
        answer = input.next();

        while (!answer.equalsIgnoreCase("b") && !answer.equalsIgnoreCase("bet") && !answer.equalsIgnoreCase("s") && !answer.equalsIgnoreCase("shop") && !answer.equalsIgnoreCase("i") && !answer.equalsIgnoreCase("inventory"))
        {
            out.print("Press 'B' to bet, press 'S' to enter shop. Press 'I' to view your inventory. ");
            answer = input.next();
        }

        return answer;
    }



    public static int enterShop(int currency, int[] storeItems, int[] storeCosts, String[] storeStrings, String[] storeDescriptions, Scanner input)
    {
        /*
        0
        1
        2
        */
        int storeChoice = 0;
        do
        {
            out.println("\nHere's what's for sale... ");
            out.println("(0) Exit Store ");
            for (int i = 0; i < storeItems.length; i++)
            {
                if (i == 1 && storeItems[1] == 1) //if owns one purchase item
                {

                  //do nothing, dont list it
                }
                else
                {
                    out.println("\t(" +  (i + 1) + ") " + storeCosts[i] + "C " + storeStrings[i] + "- " + storeDescriptions[i]);
                }
            }
            out.println("Your current currency: " + currency);
            for (int i = 0; i < storeItems.length; i++)
            {
                if (storeItems[i] > 0)
                {
                    out.println(storeStrings[i] + " x" + storeItems[i]);
                }
            }
            out.print("\nWhat will you buy? ");

            storeChoice = input.nextInt();
            storeChoice = storeChoice - 1;//to match array

            while (storeChoice < -1 && storeChoice > 3)
            {
                out.print("\nWhat will you buy? ");
                storeChoice = input.nextInt();
                storeChoice = storeChoice - 1;//to match array
            }

            if (storeChoice == -1)
            {
                break;
            }

            else
            {
                out.println("You picked " + storeStrings[storeChoice]);
                if (storeChoice == 1 && storeItems[1] == 1) //if owns one purchase item
                {
                  out.println("You already own this item! ");
                }
                else
                {
                    if (currency < storeCosts[storeChoice])
                    {
                        out.println("You don't have enough!");
                    }
                    else
                    {
                        out.println("Purchase complete ");
                        currency = currency - storeCosts[storeChoice];
                        storeItems[storeChoice]++;
                    }
                }
            }
        }
        while (storeChoice !=-1);
        out.println("Make sure to activate your items in your inventory! ");
        return currency;
    }



    public static int[] viewItems (int[] storeItems, int[] activatedItems, String[] storeStrings, Scanner input)
    {
        int invChoice = 0, itemCount = 0, activeCount = 0;

        do
        {
            out.print("\nActivated Items: ");
            for (int i = 0; i < activatedItems.length; i++)
                {
                    if (activatedItems[i] == 1)
                    {
                        out.print(storeStrings[i] + " ");
                        activeCount++;
                    }

                }
            if (activeCount <= 0)
            {
                out.print("You don't have anything activated. ");
            }
            out.println("\nYour Inventory: ");
            out.print("(0) Exit ");
            for (int i = 0; i < storeItems.length; i++)
                {
                    if (storeItems[i] > 0)
                    {
                        out.print("\n\t(" + (i + 1) + ") " + storeStrings[i]);
                        out.print(" x" + storeItems[i]);
                        itemCount++;
                    }
                }
            if (itemCount <= 0)
            {
                out.println("\b\b\b\b\b\b\b\b\bYou don't own anything!");
            }
            out.print("\nChoose an item to activate, press '0' to exit: ");
            invChoice = input.nextInt();
            invChoice = invChoice - 1;
            if (invChoice == -1) //if enters zero, but turns to -1
            {
                break;
            }
            else
            {
                if (invChoice == 1)// cannot disable
                {
                    out.println("Cannot disable that! ");
                }
                else
                {
                    if (storeItems[invChoice] <= 0 )//if does not have item
                    {
                        //do nothing
                        out.println("You don't have that! ");
                    }
                    else
                    {
                        if (activatedItems[invChoice] == 1)//toggle
                        {
                            activatedItems[invChoice] = 0;
                            storeItems[invChoice]++;
                            out.println(storeStrings[invChoice] + "deactivated! ");
                        }
                        else
                        {
                            activatedItems[invChoice] = 1;
                            storeItems[invChoice]--;
                            out.println(storeStrings[invChoice] + "activated! ");
                        }

                    }
                }
            }
        }
        while (invChoice != -1);

        return activatedItems;
    }

}