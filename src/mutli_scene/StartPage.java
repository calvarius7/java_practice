package mutli_scene;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StartPage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Menu menu1 = new Menu("Menu 1");
        MenuItem menuItem1 = new MenuItem("Seite 1");
        MenuItem menuItem2 = new MenuItem("Seite 2");
        menu1.getItems().addAll(menuItem1,menuItem2);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(menu1);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Parent seite1 = new Seite1();
        Parent seite2 = new Seite2();

        borderPane.setCenter(seite1);

        menuItem1.setOnAction(click -> borderPane.setCenter(seite1));
        menuItem2.setOnAction(click -> borderPane.setCenter(seite2));

        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
