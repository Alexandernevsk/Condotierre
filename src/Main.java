import entity.map.Coordinate;
import entity.movement.Movement;

public class Main {
    public static void main(String[] args) {
        Movement movement = new Movement(9);
        Coordinate coordinate = new Coordinate(1,2);
        movement.handleMovement(coordinate);
    }

}



