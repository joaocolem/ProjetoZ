package src.Controller;
import java.util.List;

import src.Controller.World.Portal;


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
    private Inventory inventory = new Inventory();
    private char positionChar = '.'; 
    // variavel responsavel por armazenar o valor posição que o jogador ira assumir
    // para que caso nao for uma letra do alfabeto na sequencia da ultima armazenada no vetor 
    //apos sair desta posição ela retorna o valor original para a mesma posição.

    public Personagem(int playerX, int playerY) {
        this.playerX = playerX;
        this.playerY = playerY;
    }

    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

//     public ArrayList<Character> getCollectedItems() {
//         return collectedItems;
//     }
// //metodo reponsavel por mostrar os itens coletados.
//     public void printCollectedItems() {
//         if (collectedItems.isEmpty()) {
//             System.out.println("Nenhum item coletado.");
//         } else {
//             System.out.print("Itens coletados: ");
//             for (int i = 0; i < collectedItems.size(); i++) {
//                 System.out.print(collectedItems.get(i) + " ");
//             }
//             System.out.println();
//         }
//     }

    public void setPlayerX(int x) {
        playerX = x;
    }

    public void setPlayerY(int y) {
        playerY = y;
    }

    public World movePlayer(String input, World currentWorld) {
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

        if (currentWorld.isValidMove(newX, newY) && inventory.canCollect(newX, newY, currentWorld.getMap())) {
            currentWorld.updateWorld(playerX, playerY, '.');

            List<World.Portal> portals = currentWorld.getPortals();
            for (World.Portal portal : portals) {
                if (portal.getX() == newX && portal.getY() == newY) {
                    World destinationWorld = World.getWorldByIndex(portal.getDestinationWorld());

                    int destX = portal.getDestinationX();
                    int destY = portal.getDestinationY();

                    currentWorld = destinationWorld;
                    
                    newX = destX;
                    newY = destY;
                    break;
                }
            }

            playerX = newX;
            playerY = newY;
            

            //currentWorld.updateWorld(playerX, playerY, 'P');
        }
        return currentWorld;
    }
}
