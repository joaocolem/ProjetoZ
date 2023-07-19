package src.testes;

import src.Controller.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonagemTest {

    private Personagem personagem, personagem2;
    private World world, world2;
    private char[][] tempMap;

    @BeforeEach
    public void setup() {
        personagem = new Personagem(0, 0);
        

        tempMap = new char[][]{
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}
        };
        world = new World(tempMap);
        
        tempMap = new char[][]{
                {'.', '.', '.'},
                {'.', 'A', '.'},
                {'.', '.', '.'}
            };

        world2 = new World(tempMap);
    }

    @Test
    public void testGetPlayerX() {
        Assertions.assertEquals(0, personagem.getPlayerX());
    }

    @Test
    public void testGetPlayerY() {
        Assertions.assertEquals(0, personagem.getPlayerY());
    }

    @Test
    public void testSetPlayerX() {
        personagem.setPlayerX(3);
        Assertions.assertEquals(3, personagem.getPlayerX());
    }

    @Test
    public void testSetPlayerY() {
        personagem.setPlayerY(5);
        Assertions.assertEquals(5, personagem.getPlayerY());
    }

    @Test
    public void testMovePlayer_ValidInput() {
        World newWorld = personagem.movePlayer("d", world);
        Assertions.assertEquals(1, personagem.getPlayerX());
        Assertions.assertEquals(0, personagem.getPlayerY());
        Assertions.assertEquals(world, newWorld);
    }

    @Test
    public void testMovePlayer_InvalidInput() {
        World newWorld = personagem.movePlayer("t", world);
        Assertions.assertEquals(0, personagem.getPlayerX());
        Assertions.assertEquals(0, personagem.getPlayerY());
        Assertions.assertEquals(world, newWorld);
    }

    @Test
    public void testMovePlayerEndGame() {
        personagem.setTargetCaractere(66);
        World endWorld = personagem.movePlayer("d", world2);
        char[][] endLayout = endWorld.getMap();
        Assertions.assertEquals('A', endLayout[personagem2.getPlayerX()][personagem2.getPlayerY()]);
    }


}
    



