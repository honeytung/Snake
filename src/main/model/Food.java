package model;

import ui.main;

public class Food {
    private Position foodPosition;

    Food() {
        foodPosition = new Position((int)Math.random() * main.GAME_WIDTH, (int)Math.random() * main.GAME_HEIGHT);
    }

    public Position getFoodPosition() {
        return foodPosition;
    }

    public void updateFoodPosition() {
        foodPosition = new Position((int)Math.random() * main.GAME_WIDTH, (int)Math.random() * main.GAME_HEIGHT);
    }
}
