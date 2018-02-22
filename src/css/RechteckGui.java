package css;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RechteckGui extends Application {

    private TextField textFieldA;
    private TextField textFieldB;
    private Label umfang;
    private Label flaeche;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gp = new GridPane();
        gp.setHgap(15);
        gp.setVgap(15);
        gp.setPadding(new Insets(15));

        Label label;
        label = new Label("a: ");
        gp.add(label, 0, 0);
        textFieldA = new TextField();
        gp.add(textFieldA, 1, 0);

        label = new Label("b: ");
        gp.add(label, 0, 1);
        textFieldB = new TextField();
        gp.add(textFieldB, 1, 1);

        label = new Label("Umfang  = ");
        gp.add(label, 0, 2);
        umfang = new Label();
        gp.add(umfang, 1, 2);

        label = new Label("Fläche = ");
        gp.add(label, 0, 3);
        flaeche = new Label();
        gp.add(flaeche, 1, 3);

        Button btn = new Button("Brechnen");
        gp.add(btn, 0, 4);


        Scene scene = new Scene(gp, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
