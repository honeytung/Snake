package ui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class main extends Application {
    public static final int WINDOW_WIDTH = 1280;
    public static final int WINDOW_HEIGHT = 720;

    private Stage mainWindow;
    private Scene mainMenu;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainWindow = primaryStage;
        initMenuScene();
        mainWindow.setScene(mainMenu);
        mainWindow.show();
    }

    private void initMenuScene() {
        Group root = new Group();
        mainMenu = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

    }
}
