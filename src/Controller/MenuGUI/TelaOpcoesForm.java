package src.Controller.MenuGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class TelaOpcoesForm extends JFrame {
    protected JPanel Opcoes;

    protected JButton btnNovoJogo;
    protected JButton btnAlterar;
    protected JButton btnSair;

    public TelaOpcoesForm(){
        this.inicializar();
        this.eventos();
    }
    
    public void inicializar(){
        this.setTitle("Menu Opções");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(getOpcoes(), BorderLayout.CENTER);
        this.pack();

    }

    protected abstract void btnNovoJogoClick(ActionEvent ev);
    protected abstract void btnAlterarClick(ActionEvent ev);
    protected abstract void btnSairClick(ActionEvent ev);

    private void eventos(){
        btnNovoJogo.addActionListener(this::btnNovoJogoClick);
        btnAlterar.addActionListener(this::btnAlterarClick);
        btnSair.addActionListener(this::btnSairClick);
    }

    public JPanel getOpcoes() {
        if(Opcoes == null){
            Opcoes = new JPanel(new GridLayout(3, 1));
            btnNovoJogo = new JButton("Novo Jogo");
            btnAlterar = new JButton("Alterar nickname");
            btnSair = new JButton("Sair");

            Opcoes.add(btnNovoJogo);
            Opcoes.add(btnAlterar);
            Opcoes.add(btnSair);
        }
        return Opcoes;
    }
}
