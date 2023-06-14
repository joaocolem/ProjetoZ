package src.Controller.MenuGUI;

import java.awt.event.ActionEvent;

import javax.swing.SwingUtilities;

import src.Controller.GamesGUI.ForcaGUI;



public class TelaOpcoes extends TelaOpcoesForm{

    @Override
    protected void btnNovoJogoClick(ActionEvent ev) {
        ForcaGUI jogo = new ForcaGUI();
        jogo.setVisible(true);
        this.setVisible(false);
    }

    @Override
    protected void btnAlterarClick(ActionEvent ev) {
        SwingUtilities.invokeLater(() -> {
            TelaNickname tela1 = new TelaNickname();
            tela1.setVisible(true);
        });
        this.setVisible(false);
    }

    @Override
    protected void btnSairClick(ActionEvent ev) {
        System.exit(0);
    }
    
}
