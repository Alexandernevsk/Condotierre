package structures.town;

import auxillary.Alignment;
import auxillary.Gold;
import auxillary.Tier;
import structures.building.BuildingCost;
import structures.building.BuildingType;

public class TownBuilding {
    private String buildingName;
    private Tier buildingTier;
    private Gold goldCost;
    private BuildingCost buildingCost;
    private BuildingType buildingType;

    public TownBuilding(String buildingName, Tier buildingTier, Gold goldCost, BuildingCost buildingCost, BuildingType buildingType) {
        this.buildingName = buildingName;
        this.buildingTier = buildingTier;
        this.goldCost = goldCost;
        this.buildingCost = buildingCost;
        this.buildingType = buildingType;
    }
}
