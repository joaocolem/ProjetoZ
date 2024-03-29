package src.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private static ArrayList<Character> collectedItems = new ArrayList<>();
    private static String inInventory = "";
    private int expectedASCIIChar = 88;


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

        if (!collectedItems.isEmpty()) {
            expectedASCIIChar = ((int) collectedItems.get(collectedItems.size() - 1)) - 1;
        }

        if (currentWorld[y][x] == '.') {
            return true;
        }

        if (currentWorld[y][x] == ' ') {
            return true;
        }

        if (currentWorld[y][x] == '?') {
            return true;
        }

         if (currentWorld[y][x] == '!') {
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
   /**
     * Adiciona uma letra ao inventário.
     *
     * @param letter letra a ser adicionada
     */
    public void addLetterToInventory (Character letter) {
        collectedItems.add(letter);
    }

    public static ArrayList<Character> getCollectedItems(){
        return collectedItems;
    }

    public static void setInInventory(String letter) {
        inInventory += letter;
    }

    public static boolean isInInventory(String letter) {
        return inInventory.contains(letter);
    }

    public static String getInInventory () {
        return inInventory;
    }
    



    /**
     * @return int return the expectedASCIIChar
     */
    public int getExpectedASCIIChar() {
        return expectedASCIIChar;
    }

    /**
     * @param expectedASCIIChar the expectedASCIIChar to set
     */
    public void setExpectedASCIIChar(int expectedASCIIChar) {
        this.expectedASCIIChar = expectedASCIIChar;
    }

}
