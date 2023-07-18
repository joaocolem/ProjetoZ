package src.View.MenuGUI;

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

    public TelaOpcoesForm() {
        this.inicializar();
        this.eventos();
    }

    public void inicializar() {
        this.setTitle("Menu Opções");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(null);

        imagemLabel = new JLabel();
        imagemLabel.setBounds(0, 0, getWidth(), getHeight());
        ImageIcon imagemFundo = new ImageIcon(getClass().getResource("resources/menu.jpg")); // Use the correct path of the image here
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(getWidth(), getHeight(),
                Image.SCALE_SMOOTH);
        imagemFundo = new ImageIcon(imagemRedimensionada);
        imagemLabel.setIcon(imagemFundo);

        btnNovoJogo = new JButton("Novo Jogo");
        btnNovoJogo.setBounds(275, 390, 200, 30);
        btnNovoJogo.setBackground(Color.BLACK);
        btnNovoJogo.setForeground(Color.WHITE);
        add(btnNovoJogo);

        btnAlterar = new JButton("Alterar Nickame");
        btnAlterar.setBounds(275, 420, 200, 30);
        add(btnAlterar);
        btnAlterar.setBackground(Color.BLACK);
        btnAlterar.setForeground(Color.WHITE);

        btnSair = new JButton("Sair");
        btnSair.setBounds(275, 450, 200, 30);
        btnSair.setBackground(Color.BLACK);
        btnSair.setForeground(Color.WHITE);
        add(btnSair);

        add(imagemLabel);
    }

    protected abstract void btnNovoJogoClick(ActionEvent ev);

    protected abstract void btnAlterarClick(ActionEvent ev);

    protected abstract void btnSairClick(ActionEvent ev);

    private void eventos() {
        btnNovoJogo.addActionListener(this::btnNovoJogoClick);
        btnAlterar.addActionListener(this::btnAlterarClick);
        btnSair.addActionListener(this::btnSairClick);
    }
}
