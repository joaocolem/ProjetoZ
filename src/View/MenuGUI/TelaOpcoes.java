package src.View.MenuGUI;

import java.awt.event.ActionEvent;

import javax.swing.SwingUtilities;


import src.View.GameView;



public class TelaOpcoes extends TelaOpcoesForm{

    @Override
    protected void btnNovoJogoClick(ActionEvent ev) {
        
        GameView jogo = new GameView();
        jogo.frame.setVisible(true);
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
