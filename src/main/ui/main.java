package ui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class main extends Application {
    // Set Game Properties
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final int GAME_WIDTH = WINDOW_WIDTH / 10;
    public static final int GAME_HEIGHT = WINDOW_HEIGHT / 10;

    // Arrow Position
    public static final int ARROW_UP = 1;


    private Stage mainWindow;
    private Scene mainMenu;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainWindow = primaryStage;
        initMenuScene();
        mainWindow.setTitle("Snake Game");
        mainWindow.setScene(mainMenu);
        mainWindow.show();
    }

    private void initMenuScene() {
        VBox titleScreen = new VBox();
        VBox titleArea = new VBox();
        VBox buttonArea = new VBox();
        HBox optionsArea = new HBox();
        Button SinglePlayer = new Button("Play Game");

        // Label Properties
        Label titleLabel = new Label("Snake Game");
        titleLabel.setFont(new Font(40));
        titleLabel.setAlignment(Pos.CENTER);

        // VBox for titleArea
        titleArea.getChildren().add(titleLabel);
        titleArea.setPrefSize(WINDOW_WIDTH, WINDOW_HEIGHT / 2);
        titleArea.setAlignment(Pos.CENTER);

        // HBox for buttons
        optionsArea.setSpacing(10);
        optionsArea.getChildren().add(SinglePlayer);
        optionsArea.setAlignment(Pos.CENTER);

        // Set entire scene
        buttonArea.getChildren().add(optionsArea);
        titleScreen.getChildren().addAll(titleArea, buttonArea);
        titleScreen.setPadding(new Insets(10));

        mainMenu = new Scene(titleScreen, WINDOW_WIDTH, WINDOW_HEIGHT);
    }
}
