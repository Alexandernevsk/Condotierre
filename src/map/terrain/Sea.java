package map.terrain;

public class Sea extends Terrain {

    public Sea() {
        super(false, TerrainType.WATER);
    }

    @Override
    public boolean checkCompatibility(Terrain terrain) {
       if(terrain instanceof Lake){
           return false;
       } else return terrain instanceof Sea
               || terrain.getTerrainType() == TerrainType.COAST
               || terrain.getTerrainType() == TerrainType.FLATLAND;
    }

    @Override
    public String toString() {
        return "\u001B[34m" + getClass().getSimpleName().charAt(0)+ "\u001B[0m";
    }
}
