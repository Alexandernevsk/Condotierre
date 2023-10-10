package map.terrain;

public class Farmland extends Terrain {

    public Farmland() {
        super(false, TerrainType.FLATLAND);
    }

    @Override
    public boolean checkCompatibility(Terrain terrain) {
        return terrain.getTerrainType() == TerrainType.FLATLAND
                || terrain.getTerrainType() == TerrainType.HILL
                || terrain.getTerrainType() == TerrainType.COAST
                || terrain.getTerrainType() == TerrainType.WATER;
    }

    @Override
    public String toString() {
        return "\u001B[32m" + getClass().getSimpleName().charAt(0) + "\u001B[0m";
    }
}
