package src.View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Controller.Personagem;
import src.Controller.Worlds;

import java.awt.Color;
import java.awt.Dimension;

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
        String caracter;

        // Criando instacia JFrame
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JPanel
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        //Adicionando Panel ao Frame
        frame.setContentPane(panel);

        //Tamanho da janela
        frame.setPreferredSize(new Dimension(190, 300));

        JLabel[][] labels = new JLabel[world.length][world[0].length];

        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                
                caracter = i == personagem.getPlayerY() && j == personagem.getPlayerX() ? "P" : String.valueOf(world[i][j]); // Posiciona o personagem

                labels[i][j] = new JLabel(caracter);//setando valor da label(cada caracter)

                if (caracter.equals(".")) {
                    labels[i][j].setBorder(new EmptyBorder(0, 6, 0, 10)); // o '.' ocupa menos espaco que '#', por isso e necessario aumentar a sua largura
                } else {
                    labels[i][j].setBorder(new EmptyBorder(0, 1, 0, 10));//coordenadas do caracter
                }

                labels[i][j].setForeground(Color.WHITE); //cor da letra
                panel.add(labels[i][j]);//adicionando label ao panel
            }
        }
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
