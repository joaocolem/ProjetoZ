package src.testes;

import src.Controller.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonagemTest {

    private Personagem personagem;
    private World world;

    @BeforeEach
    public void setup() {
        personagem = new Personagem(0, 0);
        world = new World();
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
        World newWorld = personagem.movePlayer("w", world);
        Assertions.assertEquals(0, personagem.getPlayerX());
        Assertions.assertEquals(-1, personagem.getPlayerY());
        Assertions.assertEquals(world, newWorld);
    }

    @Test
    public void testMovePlayer_InvalidInput() {
        World newWorld = personagem.movePlayer("x", world);
        Assertions.assertEquals(0, personagem.getPlayerX());
        Assertions.assertEquals(0, personagem.getPlayerY());
        Assertions.assertEquals(world, newWorld);
    }


}
