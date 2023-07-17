package src.Controller.MenuGUI;

import javax.swing.SwingUtilities;

public class Menu {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaNickname tela1 = new TelaNickname();
            tela1.setVisible(true);
        });
        
    }
}
