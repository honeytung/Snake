package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import ui.main;

import java.util.Random;

public class Food {
    private Rectangle food;
    private int[] foodLocation;             // foodLocation has two elements, index 0 for x and index 1 for y
    private Random random = new Random();

    public Food() {
        food = new Rectangle(main.PIXEL_SIZE, main.PIXEL_SIZE);
        foodLocation = new int[2];

        // Set initial randomized position
        food.setFill(Color.RED);
        food.setStroke(Color.RED);
        food.setVisible(true);
        foodLocation[0] = random.nextInt(main.WINDOW_WIDTH);
        foodLocation[1] = random.nextInt(main.WINDOW_HEIGHT);

        food.setTranslateX(foodLocation[0]);
        food.setTranslateY(foodLocation[1]);
    }

    public void generateNewFood() {
        foodLocation[0] = random.nextInt(main.WINDOW_WIDTH);
        foodLocation[1] = random.nextInt(main.WINDOW_HEIGHT);

        food.setTranslateX(foodLocation[0]);
        food.setTranslateY(foodLocation[1]);
    }

    public Rectangle getFood() {
        return food;
    }

    public int[] getFoodLocation() {
        return foodLocation;
    }
}
