package entity.movement;

import map.Coordinate;

import java.util.Scanner;

public class Movement {
    private int movePoints;
    private Scanner scanner;
    private Coordinate coordinate;
    private int xLimit;
    private int yLimit;

    public int getXLimit() {
        return xLimit;
    }

    public int getYLimit() {
        return yLimit;
    }

    public void setYLimit(int yLimit) {
        this.yLimit = yLimit;
    }


    public void setXLimit(int xLimit) {
        this.xLimit = xLimit;
    }

    public int getMovePoints() {
        return movePoints;
    }

    public void setMovePoints(int movePoints) {
        this.movePoints = movePoints;
    }

    public void handleMovement() {
        scanner = new Scanner(System.in);
        while (movePoints > 0) {
            String input = scanner.nextLine();
            if (!input.matches("[WwAaSsDd]")) {
                System.out.println("not valid input: ony WASD or wasd");
            } else {
                setDirection(input.toLowerCase());
            }
            System.out.println(movePoints);
            System.out.println(coordinate);
        }
    }

    public void setDirection(String direction) {
        System.out.println("Where do you want to move?");
        System.out.println("You are now: ");
        System.out.println(coordinate);
        switch (direction) {
            case "w" -> {
                if (coordinate.getY() + 1 > xLimit) {
                    System.out.println("Out of bounds!");
                } else {
                    coordinate.setY(coordinate.getY() + 1);
                    movePoints--;
                }
            }
            case "s" -> {
                if (coordinate.getY() - 1 < 0) {
                    System.out.println("Out of bounds");
                } else {
                    coordinate.setY(coordinate.getY() - 1);
                    movePoints--;
                }
            }
            case "d" -> {
                if (coordinate.getX() + 1 > yLimit) {
                    System.out.println("Out of bounds");
                } else {
                    coordinate.setX(coordinate.getX() + 1);
                    movePoints--;
                }
            }
            case "a" -> {
                if (coordinate.getX() - 1 < 0) {
                    System.out.println("Out of bounds");
                } else {
                    coordinate.setX(coordinate.getX() - 1);
                    movePoints--;
                }
            }
        }
    }


    public Movement(int movePoints, Coordinate coordinate) {
        this.movePoints = movePoints;
        this.coordinate = coordinate;
    }
}
