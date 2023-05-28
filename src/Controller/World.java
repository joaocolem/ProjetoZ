package src.Controller;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class World {
    private static final char[] BARRIERS = { '#', '&' };
    private char[][] map;
    private List<Portal> portals;
    private static List<World> WORLDS = new ArrayList<>();

    public World() {

    }

    public World(char[][] map) {
        this.map = map;
        this.portals = new ArrayList<>();
    }

    public World(char[][] map, List<Portal> portals /* Outros argumentos */) {
        this.map = map;
        this.portals = portals;
        // Inicialize os outros atributos com os argumentos fornecidos
    }

    // le o arquivo txt e tranforma em objetos WORLDS
    private static void initializeWorldsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            List<char[]> tempMap = new ArrayList<>();
            List<World.Portal> portals = null;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Map")) {
                    if (tempMap.size() > 0 && portals != null) {
                        char[][] map = new char[tempMap.size()][];
                        tempMap.toArray(map);
                        World world = new World(map, portals);
                        WORLDS.add(world);
                    }

                    tempMap.clear();
                    portals = new ArrayList<>();
                } else if (line.startsWith("Portal")) {
                    String[] portalValues = line.split(" ");
                    int x = Integer.parseInt(portalValues[1]);
                    int y = Integer.parseInt(portalValues[2]);
                    int destX = Integer.parseInt(portalValues[3]);
                    int destY = Integer.parseInt(portalValues[4]);
                    int destinationWorldIndex = Integer.parseInt(portalValues[5]);

                    World.Portal portal = new World.Portal(x, y, destX, destY, destinationWorldIndex);
                    portals.add(portal);
                } else {
                    tempMap.add(line.toCharArray());
                }
            }

            if (tempMap.size() > 0 && portals != null) {
                char[][] map = new char[tempMap.size()][];
                tempMap.toArray(map);
                World world = new World(map, portals);
                WORLDS.add(world);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static World getWorldByIndex(int index) {
        if (index >= 0 && index < WORLDS.size()) {
            return WORLDS.get(index);
        } else {
            return null;
        }
    }

    public static World getFirstWorld() {
        initializeWorldsFromFile("src/View/layouts/world/mapas.txt");
        return WORLDS.get(0);
    }

    public char[][] getMap() {
        return map;
    }

    public List<Portal> getPortals() {
        return portals;
    }

    public void addPortal(Portal portal) {
        portals.add(portal);
    }

    public static char[] getBarriers() {
        return BARRIERS;
    }

    public boolean isValidMove(int x, int y) {
        char[] barriers = getBarriers();

        return x >= 0
                && x < map[0].length
                && y >= 0
                && y < map.length
                && !isBarrier(map[y][x], barriers);
    }

    public void updateWorld(int x, int y, char newChar) {
        map[y][x] = newChar;
    }

    private boolean isBarrier(char c, char[] barriers) {
        for (char barrier : barriers) {
            if (c == barrier) {
                return true;
            }
        }
        return false;
    }

    public static class Portal {
        private int x;
        private int y;
        private int destX;
        private int destY;
        private int destinationWorld;

        public Portal(int x, int y, int destX, int destY, int destinationWorld) {
            this.x = x;
            this.y = y;
            this.destX = destX;
            this.destY = destY;
            this.destinationWorld = destinationWorld;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDestinationX() {
            return destX;
        }

        public int getDestinationY() {
            return destY;
        }

        public int getDestinationWorld() {
            return destinationWorld;
        }
    }
}