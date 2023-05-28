package src.Controller;

import java.util.ArrayList;

public class Inventory {
    private static ArrayList<Character> collectedItems = new ArrayList<>();

    public Inventory(){

    }

    /**
    Metodo criado para verificar de pode ou nao coletar a letra presente em cada mapa. A letra so podera ser coletada caso de acordo com a tabela ASCII o valor decimal seja 1 a mais que o ultimo 
    valor adicionado ao meu arryList.
    @param x posicao x do personagem
    @param y posicao y do personagem
    @param currentWorld mundo atual
    @return se pode ou nao coletar a letra
    */
    
    public boolean canCollect(int x, int y, char[][] currentWorld) {
        int expectedASCIIChar = 65;

        if (!collectedItems.isEmpty()) {
            expectedASCIIChar = ((int) collectedItems.get(collectedItems.size() - 1)) + 1;
        }

        if (currentWorld[y][x] == '.') {
            return true;
        }

        if (currentWorld[y][x] == ' ') {
            return true;
        }

        else if ((int) currentWorld[y][x] == expectedASCIIChar)
        {
            addLetterToInventory(currentWorld[y][x]);
            return true;
        }

        else {
            return false;
        }

    }

    private void addLetterToInventory (Character letter) {
        collectedItems.add(letter);
    }

    public static ArrayList<Character> getCollectedItems(){
        return collectedItems;
    }
}
