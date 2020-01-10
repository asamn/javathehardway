import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimpleWindow extends Application
{
    @Override
    public void start(Stage stage) //Stage stage creates the stage for the function
    {
        int length = 1200;
        int height = 400;
        length = 1 + (int) (2000*Math.random());
        height = 1 + (int) (1500*Math.random());
        System.out.println(length + " x " + height);
        
        Group root = new Group ();
        Scene windowScene = new Scene(root, length, height);
        
        stage.setTitle("Window");
        stage.setScene(windowScene);
        stage.show();
    }
    public static void main (String[] args)
    {
        launch();
    }
}


/*cvfe Window.jar SimpleWindow SimpleWindow.class
c - create
v - verbose (print on screen)
f - filename (after space)
e - entry point
*/