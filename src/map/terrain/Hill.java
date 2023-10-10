package map.terrain;

public class Hill extends Terrain {

    public Hill() {
        super(true, TerrainType.HILL);
    }


    @Override
    public boolean checkCompatibility(Terrain terrain) {
        return terrain.getTerrainType() == TerrainType.HILL
                || terrain.getTerrainType() == TerrainType.FLATLAND
                || terrain.getTerrainType() == TerrainType.MOUNTAINOUS
                || (terrain.getTerrainType() == TerrainType.WATER && !terrain.getClass().getSimpleName().equalsIgnoreCase("Sea"));
    }

    @Override
    public String toString() {
        return "\u001B[35m" + getClass().getSimpleName().charAt(0)+ "\u001B[0m";
    }
}
