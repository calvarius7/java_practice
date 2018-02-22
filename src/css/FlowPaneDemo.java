package css;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class FlowPaneDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane fp = new FlowPane();

        fp.setOrientation(Orientation.VERTICAL);
        fp.setAlignment(Pos.CENTER);
        fp.setHgap(5);
        fp.setVgap(10);
        Button btn;
        for (int i = 1; i <= 10 ; i++) {
            btn = new Button("Button " +i);
            btn.setPrefWidth(100);
            btn.setPrefHeight(20+10);
            fp.getChildren().add(btn);
        }

        Scene scn = new Scene(fp, 250, 300);
        primaryStage.setScene(scn);
        primaryStage.show();

    }
}
