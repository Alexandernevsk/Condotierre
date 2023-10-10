import map.CampaignMap;
import map.Coordinate;
import map.terrain.*;


public class Main {
    public static void main(String[] args) {
//        Coordinate coordinate = new Coordinate(1,2);
//        Movement movement = new Movement(9, coordinate);
//        CampaignMap map = new CampaignMap(10,10);
//        movement.setYLimit(map.getColumnSize());
//        movement.setXLimit(map.getRowSize());
//        movement.handleMovement();



        CampaignMap map = new CampaignMap(100, 100 );
        map.render();
        for (int i = 0; i < map.getColumnSize(); i++) {
            for (int j = 0; j < map.getRowSize(); j++) {
                System.out.print(map.getCampaignMap().get(new Coordinate(j,i)).toString() + "  ");
            }
            System.out.println();
        }
    }

}



