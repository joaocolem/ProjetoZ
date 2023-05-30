package src.View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Controller.Inventory;
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

    public static JPanel worldPanel = new JPanel();
    public static JPanel inventoryPanel = new JPanel();

    public static JFrame frame = new JFrame("Swing Example");
    public static int playerX, playerY;

    public static void main(String[] args) {
        displayWorld();
    }

    /**
    Esse metodo atribue caracteristicas ao JFrame e atualiza o mundo a cada movimento do personagem
    */
    public static void displayWorld() {
        // Criando instacia JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel
        worldPanel.setBackground(Color.BLACK); // cor de fundo do Jpanel
        worldPanel.setFocusable(true);
        worldPanel.requestFocusInWindow();

        // move o personagem
        worldPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    currentWorld = personagem.movePlayer("w", currentWorld);
                    mountDisplay(currentWorld.getMap(), "world");
                } else if (e.getKeyCode() == KeyEvent.VK_A) {
                    currentWorld = personagem.movePlayer("a", currentWorld);
                    mountDisplay(currentWorld.getMap(), "world");
                } else if (e.getKeyCode() == KeyEvent.VK_S) {
                    currentWorld = personagem.movePlayer("s", currentWorld);
                    mountDisplay(currentWorld.getMap(), "world");
                } else if (e.getKeyCode() == KeyEvent.VK_D) {
                    currentWorld = personagem.movePlayer("d", currentWorld);
                    mountDisplay(currentWorld.getMap(), "world");
                } else if (e.getKeyCode() == KeyEvent.VK_I) {
                    System.out.println("\n\nCollected letters: ");
                    for (int i = 0; i < Inventory.getCollectedItems().size(); i++) {
                        System.out.print(" " + Inventory.getCollectedItems().get(i));
                    }
                    // mountDisplay(Inventory.getLayout(), "inventory");
                } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    mountDisplay(currentWorld.getMap(), "world");
                }
            }
        });

        mountDisplay(currentWorld.getMap(), "world");// cria o mundo pela primeira vez

        // Adicionando Panel ao Frame
        frame.setContentPane(worldPanel);

        // Tamanho da janel
        frame.setLayout(new GridLayout(8, 28));
        frame.setPreferredSize(new Dimension(800, 300));

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    /**
    Esse metodo limpa o JPanel e depois monta no JPanel layout inserido
    @param layout recebe o conteudo de um arquivo.txt padrao
    @param layoutType recebe o tipo do layout desjado
    */
    
    public static void mountDisplay(char[][] layout, String layoutType) {
        String caracter;
        JLabel[][] gameLabels = new JLabel[layout.length][layout[0].length];

        worldPanel.removeAll();

        for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < layout[0].length; j++) {

                caracter = i == personagem.getPlayerY()
                    && j == personagem.getPlayerX()
                    && !layoutType.equals("inventory")
                    ? "P"
                    : String.valueOf(layout[i][j]); // Posiciona o personagem
                
                gameLabels[i][j] = new JLabel(caracter);// setando valor da label(cada caracter)

                if (caracter.equals(".")) {
                    gameLabels[i][j].setBorder(new EmptyBorder(0, 6, 0, 10)); // o '.' ocupa menos espaco que '#', por
                                                                                // isso e necessario aumentar a sua
                                                                                // largura
                } else {
                    gameLabels[i][j].setBorder(new EmptyBorder(0, 1, 0, 10));// coordenadas do caracter
                }

                gameLabels[i][j].setForeground(Color.WHITE); // cor da letra

                worldPanel.add(gameLabels[i][j]);// adicionando label ao worldPanel
            }
        }

        worldPanel.revalidate();
        worldPanel.repaint();
    }
}
