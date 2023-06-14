package src.Controller.MenuGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class TelaNicknameForm extends JFrame{
    protected JPanel pnlTela1;
    protected JPanel pnlCampoNick;

    protected JLabel lblNickname;
    protected JTextField txtNickname;

    protected JButton btnContinuar;
    protected JButton btnParar;


    public TelaNicknameForm(){
        this.inicializar();
        this.eventos();
    }
    
    private void inicializar(){
        this.setTitle("Adicionar Nickname");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(getPnlCampoNick(), BorderLayout.CENTER);
        this.getContentPane().add(getPnlTela1(), BorderLayout.PAGE_END);
        this.pack();
    }

    protected abstract void btnContinuarClick(ActionEvent ev);

    private void eventos(){
        btnContinuar.addActionListener(this::btnContinuarClick);
    }

    public JPanel getPnlCampoNick() {
        if(pnlCampoNick == null){
            pnlCampoNick = new JPanel(new GridLayout(1, 2));

            lblNickname = new JLabel("Nickname");
            txtNickname = new JTextField();

            pnlCampoNick.add(lblNickname);            
            pnlCampoNick.add(txtNickname);

        }
        return pnlCampoNick;
    }

    public JPanel getPnlTela1() {
        if(pnlTela1 == null){
            pnlTela1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            btnContinuar = new JButton("Continuar");            
            btnParar = new JButton("Parar música");

            pnlTela1.add(btnParar);
            pnlTela1.add(btnContinuar);

        }
        return pnlTela1;
    }
}
