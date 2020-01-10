import javafx.application.Application;
import javafx.event.*; //* means entire package
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class MessengerWindow extends Application
{
    @Override
    public void start(Stage stage) 
    {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 500, 400);

        TextField text = new TextField("Graphics the Hard Way");
        Button button = new Button("Print");

        Text messageText = new Text();
        //TextField centerLeftText = new TextField(message);
        
        

        button.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {// TODO Auto-generated method stub
                System.out.println(text.getText());
                String message = text.getText();
                messageText.setText(message);
            }
        });

        root.setAlignment(Pos.CENTER); // position cetner of gridpane
        root.setVgap(20);
        root.add(text, 0, 0);
        root.add(messageText, 0, 5);
        root.add(button, 0, 1);
        root.setHalignment(button, HPos.CENTER);
        root.setHalignment(messageText, HPos.CENTER);


        stage.setTitle("Messenger");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }

 
}