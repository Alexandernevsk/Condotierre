package map.terrain;

import map.Coordinate;

public class Coast extends Terrain {

    public Coast() {
        super(false, TerrainType.COAST);
    }

    @Override
    public boolean checkCompatibility(Terrain terrain) {
        return terrain instanceof Sea;

    }

    @Override
    public String toString() {
        return "\u001B[33m" + getClass().getSimpleName().charAt(0)+ "\u001B[0m";
    }
}
