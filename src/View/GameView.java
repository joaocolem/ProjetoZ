package src.View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Controller.Personagem;
import src.Controller.Worlds;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.Font;

public class GameView {
    public static Personagem personagem = new Personagem(2, 2);
    public static Worlds worlds = new Worlds();

    public static void main(String[] args) {

        if (worlds.getCurrentWorld() == 1) {
            displayWorld(worlds.getWorld1());
        } else if (worlds.getCurrentWorld() == 2) {
            displayWorld(worlds.getWorld2());
        } else if (worlds.getCurrentWorld() == 3) {
            displayWorld(worlds.getWorld3());
        }
    }

    public static void displayWorld(char[][] world) {
        // Criando instacia JFrame
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JPanel
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        //Adicionando Panel ao Frame
        frame.setContentPane(panel);

        //Tamanho da janela
        frame.setPreferredSize(new Dimension(200, 300));

        JLabel[][] labels = new JLabel[world.length][world[0].length];

        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                labels[i][j] = new JLabel(String.valueOf(world[i][j]));//setando valor da label(cada caracter)
                labels[i][j].setBorder(new EmptyBorder(0, 1, 0, 10));//coordenadas do caracter
                labels[i][j].setForeground(Color.WHITE); //cor da letra
                panel.add(labels[i][j]);//adicionando label ao panel
            }
        }
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
