package com.structures.town;

import auxillary.Alignment;
import auxillary.Gold;
import auxillary.Tier;
import com.structures.building.BuildingCost;
import com.structures.building.BuildingType;

public class TownBuilding {
    private String name;
    private Tier buildingTier;
    private Gold goldCost;
    private BuildingCost buildingCost;
    private Alignment townType;
    private BuildingType buildingType;
}
