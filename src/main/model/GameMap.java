package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import ui.main;

public class GameMap {
    private int[][] mapArray; // [x][y]
    private Rectangle[][] rectangles;

    public GameMap(Pane pane) {
        // initializes game board
        mapArray = new int[main.GAME_WIDTH][main.GAME_HEIGHT];
        rectangles = new Rectangle[main.GAME_WIDTH][main.GAME_HEIGHT];

        for (int i = 0; i < main.GAME_WIDTH; i++) {
            for (int j = 0; j < main.GAME_HEIGHT; j++) {
                rectangles[i][j] = initRectangle();
                rectangles[i][j].setTranslateX(main.PIXEL_SIZE * i);
                rectangles[i][j].setTranslateY(main.PIXEL_SIZE * j);
                rectangles[i][j].setVisible(true);
                pane.getChildren().add(rectangles[i][j]);
            }
        }
    }

    private Rectangle initRectangle() {
        Rectangle rectangle = new Rectangle(main.PIXEL_SIZE, main.PIXEL_SIZE);
        rectangle.setFill(Color.BURLYWOOD);
        rectangle.setStroke(Color.BLACK);
        rectangle.setVisible(false);
        return rectangle;
    }
}
