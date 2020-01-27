import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class CanvasBasics extends Application
{
    @Override
    public void start(Stage stage) 
    {
        Group root = new Group();
        Scene scene = new Scene(root);

        Canvas canvas = new Canvas(800,600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setStroke(Color.GREEN);//(x,y,l,w) upper left hand corner, size
        gc.setFill(Color.GREEN);
        gc.strokeRect(0,0,100,200);// starts at 50,20... 100x200 size
        
        gc.fillOval(0,0,100,200);
        for (int i = 170; i < 1000; i++)
        {   
            gc.setStroke(Color.BLACK);
            gc.strokeRect(i,i,i^4,i^4);
            
        }
        gc.setFill(Color.YELLOW);
        gc.fillOval(250,5,200,200);
        gc.setFill(Color.BLACK);
        gc.fillOval(300,70,5,5);
        gc.fillOval(400,70,5,5);
        gc.strokeArc(275,5,150,150, -180, 180, ArcType.OPEN);

        double x = canvas.getWidth()/1.5;
        double y = canvas.getHeight()/3;

        gc.strokeText("Coordinates: (" + x + "," + y + ")",x,y);

        root.getChildren().add(canvas); //shows canvas

        stage.setTitle("Canvas");
        stage.setScene(scene);
        stage.show();

    }
    public static void main (String[] args)
    {
        launch(args);
    }


}