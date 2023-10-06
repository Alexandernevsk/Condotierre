package structures.town;

import auxillary.Alignment;

import java.util.List;

public class Town {

       private Alignment townType;
       private String townName;
       private List<TownBuilding> buildings;

       public Town(Alignment townType, String townName, List<TownBuilding> buildings) {
              this.townType = townType;
              this.townName = townName;
              this.buildings = buildings;
       }
}
