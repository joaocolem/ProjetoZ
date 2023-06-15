package src.Controller.MenuGUI;

import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class TelaOpcoesForm extends JFrame {
    protected JPanel Opcoes;

    protected JButton btnNovoJogo;
    protected JButton btnAlterar;
    protected JButton btnSair;
    protected JLabel imagemLabel;
    

    public TelaOpcoesForm(){
        this.inicializar();
        this.eventos();
    }
    
    public void inicializar(){
        this.setTitle("Menu Opções");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(null);

        imagemLabel = new JLabel();
        imagemLabel.setBounds(0, 0, getWidth(), getHeight());
        ImageIcon imagemFundo = new ImageIcon("/Users/joao/floresta_zelda.jpeg"); // Coloque o caminho correto da imagem aqui
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        imagemFundo = new ImageIcon(imagemRedimensionada);
        imagemLabel.setIcon(imagemFundo);
        
        btnNovoJogo = new JButton("Novo Jogo");
        btnNovoJogo.setBounds(315, 150, 200, 75);
        add(btnNovoJogo);

        btnAlterar = new JButton("Alterar Nickame");
        btnAlterar.setBounds(315, 250, 200, 75);
        add(btnAlterar);

        btnSair = new JButton("Sair");
        btnSair.setBounds(315, 350, 200, 75);
        add(btnSair);
        
        add(imagemLabel);
        

    }

    

    protected abstract void btnNovoJogoClick(ActionEvent ev);
    protected abstract void btnAlterarClick(ActionEvent ev);
    protected abstract void btnSairClick(ActionEvent ev);

    private void eventos(){
        btnNovoJogo.addActionListener(this::btnNovoJogoClick);
        btnAlterar.addActionListener(this::btnAlterarClick);
        btnSair.addActionListener(this::btnSairClick);
    }

}
