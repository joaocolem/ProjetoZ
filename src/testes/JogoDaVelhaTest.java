package src.testes;

import src.Controller.*;
import src.Controller.GamesGUI.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogoDaVelhaTest {

    @Test
    public void testValidaVitoriaDiagonal() {
        JogoDaVelha jogo = new JogoDaVelha();

        jogo.button0x0.setText("X");
        jogo.button1x1.setText("X");
        jogo.button2x2.setText("X");

        assertTrue(jogo.validaVitoria());

        jogo = new JogoDaVelha();

        jogo.button0x2.setText("O");
        jogo.button1x1.setText("O");
        jogo.button2x0.setText("O");

        assertTrue(jogo.validaVitoria());
    }

    @Test
    public void testValidaVitoriaVertical() {
        JogoDaVelha jogo = new JogoDaVelha();

        jogo.button0x0.setText("X");
        jogo.button1x0.setText("X");
        jogo.button2x0.setText("X");

        assertTrue(jogo.validaVitoria());

        jogo = new JogoDaVelha();

        jogo.button0x1.setText("O");
        jogo.button1x1.setText("O");
        jogo.button2x1.setText("O");

        assertTrue(jogo.validaVitoria());
    }

    @Test
    public void testValidaVitoriaHorizontal() {
        JogoDaVelha jogo = new JogoDaVelha();

        jogo.button0x0.setText("X");
        jogo.button0x1.setText("X");
        jogo.button0x2.setText("X");

        assertTrue(jogo.validaVitoria());

        jogo = new JogoDaVelha();

        jogo.button1x0.setText("O");
        jogo.button1x1.setText("O");
        jogo.button1x2.setText("O");

        assertTrue(jogo.validaVitoria());
    }

    @Test
    public void testValidaVitoriaEmpate() {
        JogoDaVelha jogo = new JogoDaVelha();

        jogo.button0x0.setText("X");
        jogo.button0x1.setText("O");
        jogo.button0x2.setText("X");
        jogo.button1x0.setText("O");
        jogo.button1x1.setText("X");
        jogo.button1x2.setText("O");
        jogo.button2x0.setText("O");
        jogo.button2x1.setText("X");
        jogo.button2x2.setText("O");

        assertTrue(jogo.validaVitoria());
    }

}