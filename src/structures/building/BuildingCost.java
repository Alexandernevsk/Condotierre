package structures.building;

import java.util.List;

public record BuildingCost(BuildingMaterials materials, int amount) {

    public static List<BuildingCost> IronHeavy() {
        return List.of(new BuildingCost(BuildingMaterials.LUMBER, 5), new BuildingCost(BuildingMaterials.IRON, 20));
    }

    public static List<BuildingCost> Balanced() {
        return List.of(new BuildingCost(BuildingMaterials.LUMBER, 10), new BuildingCost(BuildingMaterials.IRON, 5), new BuildingCost(BuildingMaterials.STONE, 10));
    }

}
