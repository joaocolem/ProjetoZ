package src.Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Worlds {

    private static char[][] world1 = {
            { ' ', '#', '#', '#', '#', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '.', '.', '.', 'C', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '#', '#', '#', '#', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ' }
    };
    // 1 local de entrada e saída
    // local de surgimento pelo mundo 2: x=1, y=2;
    // local de saída: x=0, y=2;
    private static char[][] world2 = {
            { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
            { ' ', '#', '#', '#', '#', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '.', '.', '.', '.', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '.', '#', '.', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', 'B', '.', '.', '#', ' ' },
            { ' ', '#', '#', '#', '.', '#', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ' }
    };
    // 2 entradas e saídas
    // local de surgimento: pelo mundo 1: x=5, y=3;
    // local de surgimento pelo mundo 3:x=4, y=11;
    // locais de saída: saída para o mundo 1: x=6, y=3
    // local de saída pra o mundo2: x=4, y=12;
    private static char[][] world3 = {
            { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
            { ' ', '#', '#', '#', '.', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '.', '#', '#', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '#', '#', '.', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '.', '#', '#', '#', ' ' },
            { ' ', '#', '.', '.', '.', '#', ' ' },
            { ' ', '#', '#', '#', '.', '#', ' ' },
            { ' ', '#', 'A', '.', '.', '#', ' ' },
            { ' ', '#', '#', '#', '#', '#', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ' }

    };
    // 1 local de entrada e saída
    // locais de surgimento: pelo mundo 2: x=4, y=1;
    // local de saída:x=4, y=0;

    private static int currentWorld = 1;
//Alterado para evitar repetição de codigo
    private char[][] getWorld() {
        char[][] currentWorld = null;
        if (this.currentWorld == 1) {
            currentWorld = world1;
        } else if (this.currentWorld == 2) {
            currentWorld = world2;
        } else if (this.currentWorld == 3) {
            currentWorld = world3;
        }
        return currentWorld;
    }

    public boolean isValidMove(int x, int y) {
        char[][] currentWorld = getWorld();
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
//metodo criado para verificar de pode ou nao coletar a letra presente em cada mapa.
//a letra so podera ser coletada caso de acordo com a tabela ASCII o valor decimal seja 1 a mais que o ultimo 
//valor adicionado ao meu arryList.
    public boolean canCollect(int x, int y, ArrayList<Character> collectedItems) {
        char[][] world = getWorld();
        int expectedASCIIChar = 65;

        // verifica se meu arrayList nao esta vazio, se nao estiver pega o
        // caracter da ultima possição do vetor e converte para inteiro e soma mais 1
        // para atualizar o valor do proximo caracter a ser coletado
        if (!collectedItems.isEmpty()) {

            expectedASCIIChar = ((int) collectedItems.get(collectedItems.size() - 1)) + 1;

        }

        return (world[y][x] != ' ') && (world[y][x] != '#') && (world[y][x] != '.')
                && ((int) world[y][x] == expectedASCIIChar);

    }
// metodo acessor criado para retornar o valor referente a Posição X e Y do mundo.
    public char getWorldValue(int x, int y) {
        char[][] world = getWorld();
        return world[y][x];
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

    public static int getCurrentWorld() {
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
