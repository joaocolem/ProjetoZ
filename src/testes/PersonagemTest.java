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


}