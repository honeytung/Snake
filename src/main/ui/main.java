package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Food;

public class main extends Application {
    // Set Game Properties
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final int PIXEL_SIZE = 10;
    public static final int GAME_WIDTH = WINDOW_WIDTH / PIXEL_SIZE;
    public static final int GAME_HEIGHT = WINDOW_HEIGHT / PIXEL_SIZE;

    // Game Map
    private int[] xCoord = new int[GAME_WIDTH];
    private int[] yCoord = new int[GAME_HEIGHT];

    // Scene
    private Stage mainWindow;
    private Scene mainMenu;
    private Scene mainGame;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainWindow = primaryStage;
        initMenuScene();
        initGameScene();
        mainWindow.setTitle("Snake Game");
        mainWindow.setScene(mainMenu);
        mainWindow.show();
    }

    private void initMenuScene() {
        VBox titleScreen = new VBox();
        VBox titleArea = new VBox();
        VBox buttonArea = new VBox();
        HBox optionsArea = new HBox();
        Button singlePlayer = new Button("Play Game");

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
        optionsArea.getChildren().add(singlePlayer);
        optionsArea.setAlignment(Pos.CENTER);

        // Actions for button
        singlePlayer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainWindow.setScene(mainGame);
                mainWindow.show();
            }
        });

        // Set entire scene
        buttonArea.getChildren().add(optionsArea);
        titleScreen.getChildren().addAll(titleArea, buttonArea);
        titleScreen.setPadding(new Insets(10));

        mainMenu = new Scene(titleScreen, WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    private void initGameScene() {
        Pane gameScreen = new Pane();
        // Initialize game counter
        Thread game;

        Food food = new Food();
        gameScreen.getChildren().add(food.getFood());

        mainGame = new Scene(gameScreen, WINDOW_WIDTH, WINDOW_HEIGHT);
    }
}
