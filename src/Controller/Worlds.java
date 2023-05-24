package src.Controller;

import java.util.Scanner;
import java.util.concurrent.ConcurrentNavigableMap;

public class Worlds {

    private static char[][] world1 = {
        {' ', '#', '#', '#', '#', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '.', '.', '.', '.', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '#', '#', '#', '#', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' '}
    };
//1 local de entrada e saída
//local de surgimento pelo mundo 2: x=1, y=2;     
//local de saída: x=0, y=2;
    private static char[][] world2 = {
        {' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', '#', '#', '#', '#', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '.', '.', '.', '.', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '.', '#', '.', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', 'Y', '.', '.', '#', ' '},
        {' ', '#', '#', '#', '.', '#', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' '}
    };
//2 entradas e saídas
//local de surgimento: pelo mundo 1: x=5, y=3; 
//local de surgimento pelo mundo 3:x=4, y=11;
//locais de saída: saída para o mundo 1: x=6, y=3 
//local de saída pra o mundo2: x=4, y=12; 
    private static char[][] world3 = {
        {' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', '#', '#', '#', '.', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '.', '#', '#', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '#', '#', '.', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '.', '#', '#', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '#', '#', '.', '#', ' '},
        {' ', '#', 'A', '.', '.', '#', ' '},
        {' ', '#', '#', '#', '#', '#', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' '}

    };
//1 local de entrada e saída
//locais de surgimento: pelo mundo 2: x=4, y=1;
//local de saída:x=4, y=0;

    private static int currentWorld = 1;

    public boolean isValidMove(int x, int y) {
        char[][] currentWorld = null;

        if (this.currentWorld == 1) {
            currentWorld = world1;
        } else if (this.currentWorld == 2) {
            currentWorld = world2;
        } else if (this.currentWorld == 3) {
            currentWorld = world3;
        }

        return x >= 0 && x < currentWorld[0].length && y >= 0 && y < currentWorld.length && currentWorld[y][x] != '#';
    }

    public void displayWorld(char[][] world, Personagem personagem) {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                if (i == personagem.getPlayerY() && j == personagem.getPlayerX()) {
                    System.out.print("\u001B[34mZ \u001B[0m");
                } else if (world[i][j] == '#') {
                    System.out.print("\u001B[42m  \u001B[0m");
                } else if (world[i][j] == '.') {
                    System.out.print("  ");
                } else {
                    System.out.print(world[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void updateWorld(int x, int y, char newChar) {
        if (currentWorld == 1) {
            world1[y][x] = newChar;
        } else if (currentWorld == 2) {
            world2[y][x] = newChar;
        } else if (currentWorld == 3) {
            world3[y][x] = newChar;
        }

    }

    public static char[][] getWorld1() {
        return world1;
    }

    public static char[][] getWorld2() {
        return world2;
    }

    public static char[][] getWorld3() {
        return world3;
    }

    public char [][] getCurrentWorld() {
        if (currentWorld == 1) {
            return world1;
        } else if (currentWorld == 2) {
            return world2;
        } else if (currentWorld == 3) {
            return world3;
        }
        return null;
    }

    public static int getCurrentWorldIndex() {
        return currentWorld;
    }

    public static void setWorld1(char[][] world1) {
        Worlds.world1 = world1;
    }

    public static void setWorld2(char[][] world2) {
        Worlds.world2 = world2;
    }

    public static void setWorld3(char[][] world3) {
        Worlds.world3 = world3;
    }

    public static void setCurrentWorld(int currentWorld) {
        Worlds.currentWorld = currentWorld;
    }

}

