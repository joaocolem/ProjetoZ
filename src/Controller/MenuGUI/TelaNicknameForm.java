package src.Controller.MenuGUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class TelaNicknameForm extends JFrame {
    protected JLabel lblNickname;
    protected JTextField txtNickname;
    protected JLabel imagemLabel;

    protected JButton btnContinuar;
    protected JButton btnParar;

    protected Clip clip;
    protected boolean isPaused;

    public TelaNicknameForm() {
        this.inicializar();
        this.eventos();
        this.tocarMusica();
    }

    private void inicializar() {
        this.setTitle("Adicionar Nickname");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLayout(null);

        imagemLabel = new JLabel();
        imagemLabel.setBounds(0, 0, getWidth(), getHeight());
        ImageIcon imagemFundo = new ImageIcon(getClass().getResource("resources/menu.jpg")); // Use the correct path of the image here
        Image imagemRedimensionada = imagemFundo.getImage().getScaledInstance(getWidth(), getHeight(),
                Image.SCALE_SMOOTH);
        imagemFundo = new ImageIcon(imagemRedimensionada);
        imagemLabel.setIcon(imagemFundo);

        txtNickname = new JTextField();
        txtNickname.setBounds(300, 300, 200, 30);
        add(txtNickname);

        lblNickname = new JLabel("Nickname:");
        lblNickname.setBounds(300, 190, 200, 200);
        Font fonteAtual = lblNickname.getFont();
        int tamanhoFonte = fonteAtual.getSize();
        Font novaFonte = new Font(fonteAtual.getFontName(), fonteAtual.getStyle(), tamanhoFonte + 6);
        lblNickname.setFont(novaFonte);
        Color novaCor = Color.WHITE;
        lblNickname.setForeground(novaCor);
        add(lblNickname);

        btnContinuar = new JButton("Continuar");
        btnContinuar.setBounds(350, 330, 100, 30);
        add(btnContinuar);

        btnParar = new JButton("Pausar Música");
        btnParar.setBounds(20, 20, 100, 30);
        add(btnParar);
        add(imagemLabel);
    }

    protected void tocarMusica() {
        try {
            if (clip == null) {
                File arquivoMusica = new File(getClass().getResource("resources/zelda.wav").toURI()); // Use the correct path of the audio file here
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(arquivoMusica));
                clip.start();
            } else if (isPaused) {
                clip.start();
                isPaused = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void pausarMusica() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            isPaused = true;
        }
    }

    protected abstract void btnContinuarClick(ActionEvent ev);

    protected abstract void btnPararClick(ActionEvent ev);

    private void eventos() {
        btnContinuar.addActionListener(this::btnContinuarClick);
        btnParar.addActionListener(this::btnPararClick);
    }
}
