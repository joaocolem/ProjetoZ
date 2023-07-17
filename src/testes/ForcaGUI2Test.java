package src.testes;

import src.Controller.*;
import src.Controller.GamesGUI.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class ForcaGUI2Test {
    private ForcaGUI2 forcaGUI2;
    private JButton[] botoes;

    @BeforeEach
    void setUp() {
        forcaGUI2 = Mockito.spy(new ForcaGUI2());
        botoes = new JButton[26];
        for (int i = 0; i < 26; i++) {
            botoes[i] = Mockito.mock(JButton.class);
        }
        forcaGUI2.botoes = botoes;
    }

    @Test
    void iniciarJogo_shouldInitializeGame() {
        when(forcaGUI2.palavras).thenReturn(new String[]{"banana"});
        when(forcaGUI2.palavras.length).thenReturn(1);
        when(forcaGUI2.palavras[0]).thenReturn("banana");

        forcaGUI2.iniciarJogo();

        assertEquals("BANANA", forcaGUI2.palavraSecreta);
        assertEquals(6, forcaGUI2.tentativas);
        assertEquals("______", String.valueOf(forcaGUI2.palavraAtual));
    }

    @Test
    void atualizarInterface_shouldUpdateInterface() {
        forcaGUI2.palavraAtual = "B_N_N_".toCharArray();
        forcaGUI2.tentativas = 3;

        forcaGUI2.atualizarInterface();

        verify(forcaGUI2.palavraLabel).setText("B_N_N_");
        verify(forcaGUI2.tentativasLabel).setText("Tentativas restantes: 3");
        for (JButton botao : forcaGUI2.botoes) {
            verify(botao).setEnabled(true);
        }
    }

    @Test
    void verificarPalpite_shouldUpdateCurrentWordAndTentativas_whenLetterIsCorrect() {
        forcaGUI2.palavraSecreta = "BANANA";
        forcaGUI2.palavraAtual = "B_N_N_".toCharArray();
        forcaGUI2.tentativas = 3;

        forcaGUI2.verificarPalpite('A');

        assertEquals("BANANA", String.valueOf(forcaGUI2.palavraAtual));
        assertEquals(3, forcaGUI2.tentativas);
    }

    @Test
    void verificarPalpite_shouldIncrementTentativas_whenLetterIsIncorrect() {
        forcaGUI2.palavraSecreta = "BANANA";
        forcaGUI2.palavraAtual = "B_N_N_".toCharArray();
        forcaGUI2.tentativas = 3;

        forcaGUI2.verificarPalpite('T');

        assertEquals(4, forcaGUI2.tentativas);
    }

    @Test
    void verificarPalpite_shouldEndGameAndShowMessage_whenTentativasEquals6() {
        forcaGUI2.palavraSecreta = "BANANA";
        forcaGUI2.palavraAtual = "BAN_NA".toCharArray();
        forcaGUI2.tentativas = 5;

        JOptionPane mockOptionPane = Mockito.mock(JOptionPane.class);
        Mockito.when(forcaGUI2.showMessageDialog(Mockito.any(), Mockito.anyString())).thenReturn(mockOptionPane);

        forcaGUI2.verificarPalpite('T');

        verify(mockOptionPane).showMessageDialog(forcaGUI2, "Você perdeu. A palavra era: BANANA");
        verify(forcaGUI2).exit(0);
    }

    @Test
    void verificarPalpite_shouldEndGameAndShowMessage_whenPalavraAtualEqualsPalavraSecreta() {
        forcaGUI2.palavraSecreta = "BANANA";
        forcaGUI2.palavraAtual = "BANANA".toCharArray();
        forcaGUI2.tentativas = 3;

        JOptionPane mockOptionPane = Mockito.mock(JOptionPane.class);
        Mockito.when(forcaGUI2.showMessageDialog(Mockito.any(), Mockito.anyString())).thenReturn(mockOptionPane);

        forcaGUI2.verificarPalpite('T');

        verify(mockOptionPane).showMessageDialog(forcaGUI2, "Parabéns! Você acertou a palavra.");
        verify(forcaGUI2).exit(0);
    }
}