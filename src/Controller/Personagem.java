package src.Controller;
import java.util.List;

import src.Controller.Games.Forca;
import src.Controller.Games.JogoDaMemoria;
import src.Controller.Games.JogoDaVelha;

public class Personagem {
    private int playerX;
    private int playerY;
    private Inventory inventory = new Inventory();

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

         
        }
        if (currentWorld.getMap()[newY][newX] == '?') {
            // Chamar o jogo da forca
            
            Forca.forca(Forca.nivelFacil());
        }
        

        if (currentWorld.getMap()[newY][newX] == '!') {
            // Chamar o jogo da forca
            JogoDaVelha velha = new JogoDaVelha();  
            velha.jogar();
        }


        return currentWorld;
    }

    
}