package map;

import map.terrain.*;

import java.util.*;


public class CampaignMap extends Grid {
    private final int rowSize;
    private final int columnSize;

    private final Map<Coordinate, Terrain> campaignMap = new HashMap<>();

    public CampaignMap(int rowSize, int columnSize) {
        this.rowSize = rowSize;
        this.columnSize = columnSize;
    }

    public int getRowSize() {
        return rowSize;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public void addRandomTile(Coordinate coordinate) {
        var random = new Random();
        ArrayList<Terrain> terrains = new ArrayList<>(List.of(new Coast(), new Mountain(), new Farmland(), new Sea(), new Hill(), new Lake()));
        int counter = 0;

        if (campaignMap.isEmpty()) {
            campaignMap.put(coordinate, new Sea());
        } else {
            Terrain terrain;
            do {
                counter++;
                terrain = terrains.get(random.nextInt(terrains.size()));
                System.out.println(counter);
            } while (!checkCompatibility(coordinate, terrain));
            campaignMap.put(coordinate, terrain);
        }

    }


    public Map<Coordinate, Terrain> getCampaignMap() {
        return campaignMap;
    }

    @Override
    public void render() {
        for (int x = 0; x < getRowSize(); x++) {
            for (int y = 0; y < getColumnSize(); y++) {
                addRandomTile(new Coordinate(x, y));
            }
        }
    }

    public boolean checkCompatibility(Coordinate coordinate, Terrain terrain) {
        if (coordinate.getY() - 1 < 0 && coordinate.getX() - 1 < 0) {
            return terrain.checkCompatibility(campaignMap.get(new Coordinate(coordinate.getX(), coordinate.getY())));
        } else if (coordinate.getX() - 1 < 0) {
            return terrain.checkCompatibility(campaignMap.get(new Coordinate(coordinate.getX(), coordinate.getY() - 1)));
        } else if (coordinate.getY() - 1 < 0) {
            return terrain.checkCompatibility(campaignMap.get(new Coordinate(coordinate.getX() - 1, coordinate.getY())));
        }

        Terrain north = campaignMap.get(new Coordinate(coordinate.getX(), coordinate.getY() - 1));
        Terrain west = campaignMap.get(new Coordinate(coordinate.getX() - 1, coordinate.getY()));

        return terrain.checkCompatibility(north) && terrain.checkCompatibility(west);
    }


}