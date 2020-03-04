package model;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<Position> snakePosiiton;

    Snake(int posX, int posY) {
        snakePosiiton = new ArrayList<>();
        snakePosiiton.add(new Position(posX, posY));
    }

    public List<Position> getSnakePosiiton() {
        return snakePosiiton;
    }

    public void moveSnake(ArrowKey key) {
        int currentX = snakePosiiton.get(snakePosiiton.size() - 1).getX();
        int currentY = snakePosiiton.get(snakePosiiton.size() - 1).getY();

        if(key == ArrowKey.UP) {
            snakePosiiton.add(new Position(currentX, currentY - 1));
            snakePosiiton.remove(0);
        }
        else if(key == ArrowKey.DOWN) {
            snakePosiiton.add(new Position(currentX, currentY + 1));
            snakePosiiton.remove(0);
        }
        else if(key == ArrowKey.LEFT) {
            snakePosiiton.add(new Position(currentX - 1, currentY));
            snakePosiiton.remove(0);
        }
        else if(key == ArrowKey.RIGHT) {
            snakePosiiton.add(new Position(currentX + 1, currentY));
            snakePosiiton.remove(0);
        }
    }

}
