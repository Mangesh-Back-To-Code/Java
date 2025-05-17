import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class Mangesh3DBoxes extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        String name = "MANGESH";
        double startX = -250;

        for (int i = 0; i < name.length(); i++) {
            Box letterBox = new Box(50, 100, 20); // width, height, depth
            letterBox.setTranslateX(startX + i * 60);
            letterBox.setTranslateY(0);
            letterBox.setTranslateZ(0);

            PhongMaterial mat = new PhongMaterial();
            mat.setDiffuseColor(Color.hsb(i * 50, 1.0, 1.0)); // rainbow color
            letterBox.setMaterial(mat);

            root.getChildren().add(letterBox);
        }

        // Camera
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-600);
        camera.setTranslateY(-50);
        camera.setNearClip(0.1);
        camera.setFarClip(1000.0);

        // Scene
        Scene scene = new Scene(root, 800, 600, true);
        scene.setCamera(camera);
        scene.setFill(Color.BLACK);

        primaryStage.setTitle("MANGESH in 3D (Boxes)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

