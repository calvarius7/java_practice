package css;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class CssDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label;

        Pane pane = new Pane();

        for (int i = 1; i<=20; i++) {
            label = new Label("Label" +i);
            label.relocate(20.0, 20.0*i);
            label.setStyle("-fx-text-fill: red");

            pane.getChildren().add(label);
        }

        label = new Label("TestLabel");
        label.relocate(100.0, 60.0);
        label.setId("extra");
        pane.getChildren().add(label);


        pane.getChildren().get(2).relocate(100, 100);
        pane.getChildren().remove(5);

        pane.getChildren().get(7).setId("helga");

        Button btn = new Button("Button");
        btn.relocate(10, 150);
        pane.getChildren().add(btn);


        Scene scene = new Scene(pane, 200, 400);
        scene.getStylesheets().add("css/styles.css");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
