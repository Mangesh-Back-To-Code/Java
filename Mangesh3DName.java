import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Mangesh3DText extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create 2D text and simulate 3D using rotation
        Text text = new Text("MANGESH");
        text.setFont(Font.font("Arial", 80));
        text.setFill(Color.CYAN);
        
        // Apply 3D transformation
        text.setTranslateX(100);
        text.setTranslateY(200);
        text.setRotationAxis(Rotate.Y_AXIS);
        text.setRotate(30); // simulate 3D perspective

        Group root = new Group(text);
        Scene scene = new Scene(root, 600, 400, true);
        scene.setFill(Color.BLACK);

        // Camera for 3D effect
        PerspectiveCamera camera = new PerspectiveCamera();
        scene.setCamera(camera);

        primaryStage.setTitle("MANGESH in 3D Style");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
