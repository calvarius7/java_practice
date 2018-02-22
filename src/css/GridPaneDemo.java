package css;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class GridPaneDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gp = new GridPane();
        gp.setGridLinesVisible(true);
        Button btn;
        for (int i = 1; i <= 10 ; i++) {
            btn = new Button("" +i);
            btn.setPrefWidth(100);
            gp.add(btn, i, i);
        }

        Scene scn = new Scene(gp, 250, 300);
        primaryStage.setScene(scn);
        primaryStage.show();

    }
}
