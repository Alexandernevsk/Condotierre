package map.terrain;

public class Lake extends Terrain {

    public Lake() {
        super(false, TerrainType.WATER);
    }

    @Override
    public boolean checkCompatibility(Terrain terrain) {
        if (terrain.getClass().getSimpleName().equalsIgnoreCase("Sea")){
            return false;
        } else return terrain.getTerrainType() != TerrainType.COAST && !terrain.equals(this);
    }

    @Override
    public String toString() {
        return "\u001B[36m" + getClass().getSimpleName().charAt(0) + "\u001B[0m";
    }
}
