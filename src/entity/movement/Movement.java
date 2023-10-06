package entity.movement;

import entity.map.Coordinate;

import java.util.Scanner;

public class Movement {
    private int movePoints;
    private Scanner scanner;

    public void handleMovement(Coordinate coordinate) {
        scanner = new Scanner(System.in);
        while (movePoints > 0) {
            String input = scanner.nextLine();
            if (!input.matches("[WwAaSsDd]")) {
                System.out.println("not valid");
            } else {
                coordinate.setDirection(input.toLowerCase());
                System.out.println(movePoints);
                movePoints--;
                System.out.println(coordinate);
            }
        }
    }
    public Movement(int movePoints) {
        this.movePoints = movePoints;
    }
}
