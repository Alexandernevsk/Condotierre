package map.terrain;

public class Mountain extends Terrain {


    public Mountain() {
        super(true, TerrainType.MOUNTAINOUS);
    }

    @Override
    public boolean checkCompatibility(Terrain terrain) {
        return terrain.getTerrainType() == TerrainType.MOUNTAINOUS
                || terrain.getTerrainType() == TerrainType.HILL
                || (terrain.getTerrainType() == TerrainType.WATER && !terrain.getClass().getSimpleName().equalsIgnoreCase("Sea"));
    }

    @Override
    public String toString() {
        return "\u001B[30m" + getClass().getSimpleName().charAt(0) + "\u001B[0m";
    }
}
