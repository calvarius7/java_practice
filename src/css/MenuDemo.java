package css;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Menu menu = new Menu("Menu 1");
        MenuItem menuItem1 = new MenuItem("MenuItem 1.1");
        MenuItem menuItem2 = new MenuItem("MenuItem 1.3");
        MenuItem menuItem3 = new MenuItem("MenuItem 1.3");
        menu.getItems().addAll(menuItem1,menuItem2,menuItem3);

        Menu menu2 = new Menu("Menu 2");
        MenuItem menuItem21 = new MenuItem("MenuItem 2.1");
        MenuItem menuItem22 = new MenuItem("MenuItem 2.3");
        Menu subMenu = new Menu("MenuItem 2.4");
        subMenu.getItems().addAll(new MenuItem("MenuItem2.4.1"), new MenuItem("MenuItem2.4.2"));
        menu2.getItems().addAll(menuItem21,menuItem22,subMenu);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(menu, menu2);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
