
import java.util.Scanner;

public class Worlds {
    private static char[][] world1 = {
        {' ', '#', '#', '#', '#', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '.', '.', '.', '.', '#', ' '},
        {' ', '#', '.', '.', '.', '#', ' '},
        {' ', '#', '#', '#', '#', '#', ' '},
        {' ', ' ', ' ', ' ', ' ', ' '}
    };

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
        {' ', '#', 'C', '.', '.', '#', ' '},
        {' ', '#', '#', '#', '#', '#', ' '},
        {' ', ' ', ' ', ' ', ' ', ' '}
    };

    private static int currentWorld = 1;



    public boolean isValidMove(int x, int y) {
        char[][] currentWorld = (this.currentWorld == 1) ? world1 : world2;

        return x >= 0 && x < currentWorld[0].length && y >= 0 && y < currentWorld.length && currentWorld[y][x] != '#';
    }

    public void displayWorld(char[][] world, Personagem personagem) {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                if (i == personagem.getPlayerY() && j == personagem.getPlayerX()) {
                    System.out.print("\u001B[34mP \u001B[0m");
                }else if(world[i][j] == '#'){
                    System.out.print("\u001B[42m  \u001B[0m");
                }else if(world[i][j] == '.'){
                    System.out.print("  ");    
                }else {
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
    }
}

    

    public static char[][] getWorld1() {
        return world1;
    }

    public static char[][] getWorld2() {
        return world2;
    }

    public static int getCurrentWorld() {
        return currentWorld;
    }

    public static void setWorld1(char[][] world1) {
        Worlds.world1 = world1;
    }

    public static void setWorld2(char[][] world2) {
        Worlds.world2 = world2;
    }

    public static void setCurrentWorld(int currentWorld) {
        Worlds.currentWorld = currentWorld;
    }
    
}

