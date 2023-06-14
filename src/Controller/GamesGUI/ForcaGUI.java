/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.Controller.GamesGUI;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class ForcaGUI extends javax.swing.JFrame {

    private String[] palavras = {"banana", "maca", "uva", "melancia", "abacaxi",
            "laranja", "morango", "kiwi", "mamao", "pessego",
            "manga", "pera", "cereja", "limao", "abacate",
            "ameixa", "goiaba", "caqui", "figo", "tangerina"};
    private String palavraSecreta;
    private char[] palavraAtual;
    private int tentativas;
    
    
    private JLabel palavraLabel;
    private JLabel tentativasLabel;
    private JButton[] botoes;

    public ForcaGUI() {
        setTitle("Jogo da Forca");
        setSize(1500, 725);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.setBorder(BorderFactory.createEmptyBorder());

        palavraLabel = new JLabel();
        palavraLabel.setFont(new Font("Arial", Font.BOLD, 30));
        palavraLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(palavraLabel);

        tentativasLabel = new JLabel();
        tentativasLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        tentativasLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(tentativasLabel);
        
        

        JPanel botoesPanel = new JPanel(new GridLayout(2, 13));
        botoesPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        botoes = new JButton[26];
        for (int i = 0; i < 26; i++) {
            botoes[i] = new JButton(String.valueOf((char) ('A' + i)));
            botoes[i].setFont(new Font("Arial", Font.BOLD, 20));
            botoes[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton botao = (JButton) e.getSource();
                    char letra = botao.getText().charAt(0);
                    botao.setEnabled(false);
                    verificarPalpite(letra);
                }
            });
            botoesPanel.add(botoes[i]);
        }
        panel.add(botoesPanel);

        add(panel);

        iniciarJogo();
    }

    public void iniciarJogo() {
        Random rand = new Random();
        int index = rand.nextInt(palavras.length);
        palavraSecreta = palavras[index].toUpperCase();
        palavraAtual = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraAtual[i] = '_';
        }
        tentativas = 0;

        atualizarInterface();
    }

    private void atualizarInterface() {
        palavraLabel.setText(String.valueOf(palavraAtual));
        tentativasLabel.setText("Tentativas restantes: " + (6 - tentativas));
        //numCaracteres.setText("Numero de letras: " + palavraAtual.length);
        for (JButton botao : botoes) {
            botao.setEnabled(true);
        }
    }

    private void verificarPalpite(char letra) {
        boolean acertou = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                palavraAtual[i] = letra;
                acertou = true;
            }
        }

        if (!acertou) {
            tentativas++;
        }

        if (tentativas == 6 || String.valueOf(palavraAtual).equals(palavraSecreta)) {
            String mensagem;
            if (String.valueOf(palavraAtual).equals(palavraSecreta)) {
                mensagem = "Parabéns! Você acertou a palavra.";
            } else {
                mensagem = "Você perdeu. A palavra era: " + palavraSecreta;
            }
            JOptionPane.showMessageDialog(this, mensagem);
            //f (option == JOptionPane.YES_OPTION) {
              //  iniciarJogo();
            //} else {
                dispose();
            //}
        } else {
            atualizarInterface();
        }
    }

    public void actionPerformed(ActionEvent e) {
        JButton botao = (JButton) e.getSource();
        char letra = botao.getText().charAt(0);
        botao.setEnabled(false);
        verificarPalpite(letra);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ForcaGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
