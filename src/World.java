/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoz;

/**
 *
 * @author 0066824
 */
import java.util.ArrayList;
import java.util.List;

public class World {
    private static final char[] BARRIERS = { '#', '&' };
    private static int currentWorld = 1;
    private char[][] map;
    private List<Portal> portals;

    public World(char[][] map) {
        this.map = map;
        this.portals = new ArrayList<>();
    }

    public World(char[][] map, List<Portal> portals /* Outros argumentos */) {
    this.map = map;
    this.portals = portals;
    // Inicialize os outros atributos com os argumentos fornecidos
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

    public void displayWorld(Personagem personagem) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == personagem.getPlayerY() && j == personagem.getPlayerX()) {
                    System.out.print("\u001B[34mP \u001B[0m");
                } else if (map[i][j] == '#') {
                    System.out.print("\u001B[42m  \u001B[0m");
                } else if (map[i][j] == '.') {
                    System.out.print("  ");
                } else if (map[i][j] == '&') {
                    System.out.print("\u001B[44m  \u001B[0m");
                } else {
                    System.out.print(map[i][j] + " ");
                }
            }
            System.out.println();
        }
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

    public static int getCurrentWorld() {
        return currentWorld;
    }

    public static void setCurrentWorld(int currentWorld) {
        World.currentWorld = currentWorld;
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
