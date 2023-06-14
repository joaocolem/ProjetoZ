package src.Controller.MenuGUI;

import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;

public class TelaNickname extends TelaNicknameForm {

    @Override
    protected void btnContinuarClick(ActionEvent ev) {
        String nick = txtNickname.getText();
        SwingUtilities.invokeLater(() -> {
            TelaOpcoes tela2 = new TelaOpcoes();
            tela2.setVisible(true);
        });
        System.out.println(nick);
        this.setVisible(false);
    }
    
}
