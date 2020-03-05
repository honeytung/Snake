package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import ui.main;

import java.util.Random;

public class Food {
    private Rectangle food;
    private int[] foodLocation;
    private Random random = new Random();

    public Food() {
        food = new Rectangle(main.PIXEL_SIZE, main.PIXEL_SIZE);
        food.setFill(Color.RED);
        food.setStroke(Color.RED);
        food.setVisible(true);
        food.setTranslateX(random.nextInt() * main.PIXEL_SIZE);
        food.setTranslateY(random.nextInt() * main.PIXEL_SIZE);

        foodLocation = new int[2];
    }

    public Rectangle getFood() {
        return food;
    }

    public int[] getFoodLocation() {
        return foodLocation;
    }
}
