package src.View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Controller.Personagem;
import src.Controller.World;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameView {
    public static Personagem personagem = new Personagem(2, 2);
    public static World world = new World();
    public static World currentWorld = World.getFirstWorld();

    public static JPanel panel = new JPanel();
    public static JFrame frame = new JFrame("Swing Example");
    public static int playerX, playerY;

    public static void main(String[] args) {
        displayMundo();
    }

    public static void displayMundo() {
        // Criando instacia JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel
        panel.setBackground(Color.BLACK); // cor de fundo do Jpanel
        panel.setFocusable(true);
        panel.requestFocusInWindow();

        // move o personagem
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    currentWorld = personagem.movePlayer("w", currentWorld);
                    mountDisplay(currentWorld.getMap());
                } else if (e.getKeyCode() == KeyEvent.VK_A) {
                    currentWorld = personagem.movePlayer("a", currentWorld);
                    mountDisplay(currentWorld.getMap());
                } else if (e.getKeyCode() == KeyEvent.VK_S) {
                    currentWorld = personagem.movePlayer("s", currentWorld);
                    mountDisplay(currentWorld.getMap());
                } else if (e.getKeyCode() == KeyEvent.VK_D) {
                    currentWorld = personagem.movePlayer("d", currentWorld);
                    mountDisplay(currentWorld.getMap());
                } else if (e.getKeyCode() == KeyEvent.VK_I) {
                    // atualizaMundo();
                }
            }
        });

        mountDisplay(currentWorld.getMap());// cria o mundo pela primeira vez

        // Adicionando Panel ao Frame
        frame.setContentPane(panel);

        // Tamanho da janel
        frame.setLayout(new GridLayout(8, 28));
        frame.setPreferredSize(new Dimension(800, 300));

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void mountDisplay(char[][] world) {
        String caracter;

        JLabel[][] gameLabels = new JLabel[world.length][world[0].length];

        panel.removeAll();

        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {

                caracter = i == personagem.getPlayerY() && j == personagem.getPlayerX() ? "P"
                        : String.valueOf(world[i][j]); // Posiciona o personagem

                gameLabels[i][j] = new JLabel(caracter);// setando valor da label(cada caracter)

                if (caracter.equals(".")) {
                    gameLabels[i][j].setBorder(new EmptyBorder(0, 6, 0, 10)); // o '.' ocupa menos espaco que '#', por
                                                                              // isso e necessario aumentar a sua
                                                                              // largura
                } else {
                    gameLabels[i][j].setBorder(new EmptyBorder(0, 1, 0, 10));// coordenadas do caracter
                }

                gameLabels[i][j].setForeground(Color.WHITE); // cor da letra
                panel.add(gameLabels[i][j]);// adicionando label ao panel
            }
        }

        panel.revalidate();
        panel.repaint();
    }
}
