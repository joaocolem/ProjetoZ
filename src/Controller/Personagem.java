package src.Controller;

import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao_
 */
public class Personagem {
    private int playerX;
    private int playerY;
    private ArrayList<Character> collectedItems = new ArrayList<Character>();
    private char positionChar = '.'; 
    // variavel responsavel por armazenar o valor posição que o jogador ira assumir
    // para que caso nao for uma letra do alfabeto na sequencia da ultima armazenada no vetor 
    //apos sair desta posição ela retorna o valor original para a mesma posição.

    public Personagem(int x, int y) {
        this.playerX = x;
        this.playerY = y;
    }

    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    public ArrayList<Character> getCollectedItems() {
        return collectedItems;
    }
//metodo reponsavel por mostrar os itens coletados.
    public void printCollectedItems() {
        if (collectedItems.isEmpty()) {
            System.out.println("Nenhum item coletado.");
        } else {
            System.out.print("Itens coletados: ");
            for (int i = 0; i < collectedItems.size(); i++) {
                System.out.print(collectedItems.get(i) + " ");
            }
            System.out.println();
        }
    }

    public void setPlayerX(int x) {
        playerX = x;
    }

    public void setPlayerY(int y) {
        playerY = y;
    }

    public void movePlayer(String input, Worlds worlds) {
        int newX = playerX;
        int newY = playerY;

        if (input.equals("w")) {
            newY = playerY - 1;
        } else if (input.equals("a")) {
            newX = playerX - 1;
        } else if (input.equals("s")) {
            newY = playerY + 1;
        } else if (input.equals("d")) {
            newX = playerX + 1;
        }

        if (worlds.isValidMove(newX, newY)) {

            worlds.updateWorld(playerX, playerY, positionChar);

            if (worlds.getCurrentWorld() == 1 && newX == 0 && newY == 2) {
                worlds.setCurrentWorld(2);
                playerX = 5;
                playerY = 3;
            } else if (worlds.getCurrentWorld() == 2 && newX == 6 && newY == 3) {
                worlds.setCurrentWorld(1);
                playerX = 1;
                playerY = 2;
            } else if (worlds.getCurrentWorld() == 2 && newX == 4 && newY == 12) {
                worlds.setCurrentWorld(3);
                playerX = 4;
                playerY = 1;
            } else if (worlds.getCurrentWorld() == 3 && newX == 4 && newY == 0) {
                worlds.setCurrentWorld(2);
                playerX = 4;
                playerY = 11;
            } else {
                playerX = newX;
                playerY = newY;
            }
            // Checar se tem algo p coletar
            // coleta e armazena no vetor collectedItens
            if (worlds.canCollect(playerX, playerY, collectedItems)) {
                collectedItems.add(worlds.getWorldValue(playerX, playerY));
                positionChar = '.';
            } else {
                positionChar = worlds.getWorldValue(playerX, playerY);
            }

            worlds.updateWorld(playerX, playerY, '\u2620');
        }

    }
}