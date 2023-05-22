package src.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    private static List<World> WORLDS = new ArrayList<>();



    public static void main(String[] args) {
        initializeWorldsFromFile("mapas.txt");
        Scanner scanner = new Scanner(System.in);
        Personagem personagem = new Personagem(2, 2);

        World currentWorld = WORLDS.get(0);
        currentWorld.displayWorld(personagem);

        // Loop principal do jogo
        while (true) {
            // Ler a entrada do usuário
            System.out.print("Enter your move (w/a/s/d): ");
            String input = scanner.nextLine();

            // Mover o personagem de acordo com a entrada
            currentWorld = personagem.movePlayer(input, currentWorld);

            // Atualizar e exibir o mundo atualizado
            currentWorld.displayWorld(personagem);
        }
    }

    
    
    //le o arquivo txt e tranforma em objetos WORLDS
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
}



