package src.Controller.MenuGUI;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;

public class ImagemFundo extends JPanel{
    private Image imagemFundo;

    public ImagemFundo(){
        imagemFundo = new ImageIcon("/Users/joao/Desktop/ProjetoZ/src/Controller/MenuGUI").getImage()   ;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagemFundo, 0, 0, getWidth(), getHeight(), this);
    }
}
