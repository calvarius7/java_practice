package css;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Events extends Application {

    private TextField textField;

    void doStuff(){
        System.out.println(textField.getText());
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();

        Button button = new Button("Clicky Me");
        button.setOnAction(click -> doStuff());

        textField = new TextField();

        TextField textField = this.textField;
        vBox.getChildren().add(textField);

        vBox.getChildren().add(button);
        Scene scene = new Scene(vBox, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
