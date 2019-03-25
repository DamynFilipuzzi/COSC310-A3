package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class Interface extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        Circle circ = new Circle(40, 40, 30);
        Group root = new Group(circ);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }
}
