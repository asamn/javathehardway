import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class MouseDemo extends Application
{
    private Color mouseColor;
    private String mouseString;

    @Override
    public void start(final Stage stage)
    {
        final Group root = new Group();
        final Scene scene = new Scene(root);
        
        mouseColor = Color.VIOLET;
        mouseString = "The square is violet."; 
        //System.out.println(mouseString);s
        final Canvas canvas = new Canvas(800,400);
        final GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFont(Font.font(23));
        canvas.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>()
        {
            int x = 0;
            public void handle(MouseEvent t)
            {
                System.out.println(x + "X");
                if (x >= 7)
                {
                    x=0;
                }
                String colorString = "indigo";
                switch (x)
                {
                    case 0:
                    mouseColor = Color.RED;
                    colorString = "red";
                    break;
                    case 1:
                    mouseColor = Color.ORANGE;
                    colorString = "orange";
                    break;
                    case 2:
                    mouseColor = Color.YELLOW;
                    colorString = "yellow";
                    break;
                    case 3:
                    mouseColor = Color.GREEN;
                    colorString = "green";
                    break;
                    case 4:
                    mouseColor = Color.BLUE;
                    colorString = "blue";
                    break;
                    case 5:
                    mouseColor = Color.INDIGO;
                    colorString = "indigo";
                    break;
                    case 6:
                    mouseColor = Color.VIOLET;
                    colorString = "violet";
                    default:
                    break;
                }
                x++;
                             
                //mouseString = "The square is indigo.";
                mouseString = "The square is " + colorString + ". ";
                
            }
        });
        
        root.getChildren().add(canvas);
        stage.setTitle("Mouse Demo");
        stage.setScene(scene);
        stage.show();

        new AnimationTimer()
        {
            @Override
            public void handle(long now) //forever
            {
                gc.setFill(mouseColor);
                gc.fillRect(150,100,100,100);
                gc.setFill(Color.WHITE);
                gc.fillRect(295,78,250,30);//clears the text
                gc.setFill(Color.BLACK);
                gc.fillText(mouseString, 300, 100);
            }
        }
        .start();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}