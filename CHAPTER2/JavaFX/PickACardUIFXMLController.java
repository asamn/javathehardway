import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class PickACardUIFXMLController {

    @FXML
    private Button drawButton;

    @FXML
    public Text drawOutput;

    @FXML
    void drawCard(ActionEvent event)
    {
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
        String[] names = {"ZERO", "ONE", "Two", "Three", "Four", "Five", "Six",
                        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        Card[] deck = new Card[52];
        Card chosen = new Card();

        int i = 0;
        for (String s: suits) //s is each suit, for each suit
        {
            for (int n = 2; n < names.length; n++) //n is for the value of the names array
            {
                Card a = new Card();
                a.suit = s;
                a.name = names[n]; //never uses 0 or 1 because there are no zero or one cards
                if (n == 14)
                {
                    a.value = 11;
                }
                else if (n > 10)
                {
                    a.value = 10;
                }
                else
                {
                    a.value = n;
                }
                deck[i] = a;
                i++;
            }
        }

        i = (int)(Math.random()*52); //52 possibilities, 0-51, not 0-52
        chosen = deck[i];
        String output = ("You draw a " + chosen.name + " of " + chosen.suit + " - worth " + chosen.value + " in Blackjack.");
        drawOutput.setText(output);
    }

}
