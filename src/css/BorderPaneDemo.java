package css;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        HBox hBox = new HBox();

        for (int i = 1; i <= 10 ; i++) {
            hBox.getChildren().add(new Button("Button "+ i));
        }
        borderPane.setTop(hBox);

        VBox vBox = new VBox();
        for (int i = 1; i <= 10 ; i++) {
            vBox.getChildren().add(new Label("Label "+ i));
        }
        borderPane.setLeft(vBox);

        ImageView imageView = new ImageView("images/usa-states-map-max.jpg");
        ScrollPane scrollPane = new ScrollPane(imageView);
        borderPane.setCenter(scrollPane);

        Scene scn = new Scene(borderPane, 800, 600);
        primaryStage.setScene(scn);

//        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds(); //Die Screen-Größe.. passt nur nicht ganz
//        primaryStage.setX(primaryScreenBounds.getMinX());
//        primaryStage.setY(primaryScreenBounds.getMinY());
//        primaryStage.setWidth(primaryScreenBounds.getWidth());
//        primaryStage.setHeight(primaryScreenBounds.getHeight());

        primaryStage.show();
    }
}
