import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class beispiele extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("init");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start");
        Label label = new Label("Hello World!");
        Label nochEinLabel = new Label("Nochmals Hallo!");
        Label undNochEinLabel = new Label("Einmal geht noch: Hallo!");

        Pane pane = new Pane(label, nochEinLabel, undNochEinLabel);

        ArrayList<Node> labelList = new ArrayList<>();
        labelList.add(new Label("bla"));
        labelList.add(new Label("blub"));

        pane.getChildren().addAll(labelList);

        Scene scene = new Scene(pane, 200.0, 200.0);

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
