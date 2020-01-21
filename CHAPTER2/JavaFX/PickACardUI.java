import java.io.File;
import java.net.URL;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;


class Card
{
    int value;
    String suit, name;
}

public class PickACardUI extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("PickACardUI.fxml"));
        
        Scene scene = new Scene(root, 1280, 600);

        stage.setTitle("Pick A Card FXML");
        stage.setScene(scene);
        stage.show();

    }
    public static void main (String[] args)
    {
        launch(args);
    }
}