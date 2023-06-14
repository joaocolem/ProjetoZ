
package src.Controller.GamesGUI;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JogoDaVelha extends javax.swing.JFrame {

    // o player que começa jogando é o "X"
    // valor "true" - X
    // valor "false" - O
    private boolean playerAtual = true;

    public JogoDaVelha() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button0x0 = new javax.swing.JButton();
        button0x1 = new javax.swing.JButton();
        button0x2 = new javax.swing.JButton();
        button1x0 = new javax.swing.JButton();
        button1x1 = new javax.swing.JButton();
        button1x2 = new javax.swing.JButton();
        button2x0 = new javax.swing.JButton();
        button2x1 = new javax.swing.JButton();
        button2x2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        button0x0.setBackground(new java.awt.Color(255, 255, 255));
        button0x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0x0ActionPerformed(evt);
            }
        });

        button0x1.setBackground(new java.awt.Color(255, 255, 255));
        button0x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0x1ActionPerformed(evt);
            }
        });

        button0x2.setBackground(new java.awt.Color(255, 255, 255));
        button0x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0x2ActionPerformed(evt);
            }
        });

        button1x0.setBackground(new java.awt.Color(255, 255, 255));
        button1x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1x0ActionPerformed(evt);
            }
        });

        button1x1.setBackground(new java.awt.Color(255, 255, 255));
        button1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1x1ActionPerformed(evt);
            }
        });

        button1x2.setBackground(new java.awt.Color(255, 255, 255));
        button1x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1x2ActionPerformed(evt);
            }
        });

        button2x0.setBackground(new java.awt.Color(255, 255, 255));
        button2x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2x0ActionPerformed(evt);
            }
        });

        button2x1.setBackground(new java.awt.Color(255, 255, 255));
        button2x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2x1ActionPerformed(evt);
            }
        });

        button2x2.setBackground(new java.awt.Color(255, 255, 255));
        button2x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2x2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button2x0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(button1x0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button0x0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2x1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1x2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2x2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button0x1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button0x2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button0x2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(button0x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button0x0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1x0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1x2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button2x0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button2x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button2x2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button0x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0x0ActionPerformed
    // define o tipo de fonte da letra para Sans Serif, em negrito e tamanho 60
        button0x0.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
        if (playerAtual) {
            button0x0.setText("X");
        } else {
            button0x0.setText("O");
        }
        // verifica se a jogada realizada garantiu a vitoria
        // caso seja falso, vai alterar para o outro jogador
        // caso seja verdadeiro, vai finalizar o jogo
        if (!validaVitoria()) {
            playerAtual = !playerAtual;
        } else {
            validaVitoria();
        }
        button0x0.setEnabled(false);
    }//GEN-LAST:event_button0x0ActionPerformed

    private void button0x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0x1ActionPerformed
    // define o tipo de fonte da letra para Sans Serif, em negrito e tamanho 60
        button0x1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
        if (playerAtual) {
            button0x1.setText("X");
        } else {
            button0x1.setText("O");
        }
        // verifica se a jogada realizada garantiu a vitoria
        // caso seja falso, vai alterar para o outro jogador
        // caso seja verdadeiro, vai finalizar o jogo
        if (!validaVitoria()) {
            playerAtual = !playerAtual;
        } else {
            validaVitoria();
        };
        button0x1.setEnabled(false);
    }//GEN-LAST:event_button0x1ActionPerformed

    private void button0x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0x2ActionPerformed
        // define o tipo de fonte da letra para Sans Serif, em negrito e tamanho 60
        button0x2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
        if (playerAtual) {
            button0x2.setText("X");
        } else {
            button0x2.setText("O");
        }
        // verifica se a jogada realizada garantiu a vitoria
        // caso seja falso, vai alterar para o outro jogador
        // caso seja verdadeiro, vai finalizar o jogo
        if (!validaVitoria()) {
            playerAtual = !playerAtual;
        } else {
            validaVitoria();
        }
        button0x2.setEnabled(false);
    }//GEN-LAST:event_button0x2ActionPerformed

    private void button1x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1x0ActionPerformed
        // define o tipo de fonte da letra para Sans Serif, em negrito e tamanho 60
        button1x0.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
        if (playerAtual) {
            button1x0.setText("X");
        } else {
            button1x0.setText("O");
        }
        // verifica se a jogada realizada garantiu a vitoria
        // caso seja falso, vai alterar para o outro jogador
        // caso seja verdadeiro, vai finalizar o jogo
        if (!validaVitoria()) {
            playerAtual = !playerAtual;
        } else {
            validaVitoria();
        }
        button1x0.setEnabled(false);
    }//GEN-LAST:event_button1x0ActionPerformed

    private void button1x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1x1ActionPerformed
        // define o tipo de fonte da letra para Sans Serif, em negrito e tamanho 60
        button1x1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
        if (playerAtual) {
            button1x1.setText("X");
        } else {
            button1x1.setText("O");
        }
        // verifica se a jogada realizada garantiu a vitoria
        // caso seja falso, vai alterar para o outro jogador
        // caso seja verdadeiro, vai finalizar o jogo
        if (!validaVitoria()) {
            playerAtual = !playerAtual;
        } else {
            validaVitoria();
        }
        button1x1.setEnabled(false);
    }//GEN-LAST:event_button1x1ActionPerformed

    private void button1x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1x2ActionPerformed
        // define o tipo de fonte da letra para Sans Serif, em negrito e tamanho 60
        button1x2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
        if (playerAtual) {
            button1x2.setText("X");
        } else {
            button1x2.setText("O");
        }
        // verifica se a jogada realizada garantiu a vitoria
        // caso seja falso, vai alterar para o outro jogador
        // caso seja verdadeiro, vai finalizar o jogo
        if (!validaVitoria()) {
            playerAtual = !playerAtual;
        } else {
            validaVitoria();
        }
        button1x2.setEnabled(false);
    }//GEN-LAST:event_button1x2ActionPerformed

    private void button2x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2x0ActionPerformed
        // define o tipo de fonte da letra para Sans Serif, em negrito e tamanho 60
        button2x0.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
        if (playerAtual) {
            button2x0.setText("X");
        } else {
            button2x0.setText("O");
        }
        // verifica se a jogada realizada garantiu a vitoria
        // caso seja falso, vai alterar para o outro jogador
        // caso seja verdadeiro, vai finalizar o jogo
        if (!validaVitoria()) {
            playerAtual = !playerAtual;
        } else {
            validaVitoria();
        }
        button2x0.setEnabled(false);
    }//GEN-LAST:event_button2x0ActionPerformed

    private void button2x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2x1ActionPerformed
        // define o tipo de fonte da letra para Sans Serif, em negrito e tamanho 60
        button2x1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
        if (playerAtual) {
            button2x1.setText("X");
        } else {
            button2x1.setText("O");
        }
        // verifica se a jogada realizada garantiu a vitoria
        // caso seja falso, vai alterar para o outro jogador
        // caso seja verdadeiro, vai finalizar o jogo
        if (!validaVitoria()) {
            playerAtual = !playerAtual;
        } else {
            validaVitoria();
        }
        button2x1.setEnabled(false);


    }//GEN-LAST:event_button2x1ActionPerformed

    private void button2x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2x2ActionPerformed
        // define o tipo de fonte da letra para Sans Serif, em negrito e tamanho 60
        button2x2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
        
        if (playerAtual) {
            button2x2.setText("X");
        } else {
            button2x2.setText("O");
        }
        // verifica se a jogada realizada garantiu a vitoria
        // caso seja falso, vai alterar para o outro jogador
        // caso seja verdadeiro, vai finalizar o jogo
        if (!validaVitoria()) {
            playerAtual = !playerAtual;
        } else {
            validaVitoria();
        }
        button2x2.setEnabled(false);
    }//GEN-LAST:event_button2x2ActionPerformed

    public boolean validaVitoria() {

        // verificar diagonais
        if (button0x0.getText() == "X" && button1x1.getText() == "X" && button2x2.getText() == "X"
                || button0x0.getText() == "O" && button1x1.getText() == "O" && button2x2.getText() == "O") {
            if (playerAtual) {
                JOptionPane.showMessageDialog(null, "PLAYER 1 GANHOU");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "PLAYER 2 GANHOU");
                dispose();
            }
            return true;
        }
        if (button0x2.getText() == "X" && button1x1.getText() == "X" && button2x0.getText() == "X"
                || button0x2.getText() == "O" && button1x1.getText() == "O" && button2x0.getText() == "O") {
            if (playerAtual) {
                JOptionPane.showMessageDialog(null, "PLAYER 1 GANHOU");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "PLAYER 2 GANHOU");
                dispose();
            }
            return true;
        }

        // verificar verticais 
        if (button0x0.getText() == "X" && button1x0.getText() == "X" && button2x0.getText() == "X"
                || button0x0.getText() == "O" && button1x0.getText() == "O" && button2x0.getText() == "O") {
            if (playerAtual) {
                JOptionPane.showMessageDialog(null, "PLAYER 1 GANHOU");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "PLAYER 2 GANHOU");
                dispose();
            }
            return true;
        }
        if (button0x1.getText() == "X" && button1x1.getText() == "X" && button2x1.getText() == "X"
                || button0x1.getText() == "O" && button1x1.getText() == "O" && button2x1.getText() == "O") {
            if (playerAtual) {
                JOptionPane.showMessageDialog(null, "PLAYER 1 GANHOU");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "PLAYER 2 GANHOU");
                dispose();
            }
            return true;
        }
        if (button0x2.getText() == "X" && button1x2.getText() == "X" && button2x2.getText() == "X"
                || button0x2.getText() == "O" && button1x2.getText() == "O" && button2x2.getText() == "O") {
            if (playerAtual) {
                JOptionPane.showMessageDialog(null, "PLAYER 1 GANHOU");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "PLAYER 2 GANHOU");
                dispose();
            }
            return true;
        }

        // verificar horizontais
        if (button0x0.getText() == "X" && button0x1.getText() == "X" && button0x2.getText() == "X"
                || button0x0.getText() == "O" && button0x1.getText() == "O" && button0x2.getText() == "O") {

            if (playerAtual) {
                JOptionPane.showMessageDialog(null, "PLAYER 1 GANHOU");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "PLAYER 2 GANHOU");
                dispose();
            }
            return true;
        }

        if (button1x0.getText() == "X" && button1x1.getText() == "X" && button1x2.getText() == "X"
                || button1x0.getText() == "O" && button1x1.getText() == "O" && button1x2.getText() == "O") {

            if (playerAtual) {
                JOptionPane.showMessageDialog(null, "PLAYER 1 GANHOU");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "PLAYER 2 GANHOU");
                dispose();
            }
            return true;
        }

        if (button2x0.getText() == "X" && button2x1.getText() == "X" && button2x2.getText() == "X"
                || button2x0.getText() == "O" && button2x1.getText() == "O" && button2x2.getText() == "O") {

            if (playerAtual) {
                JOptionPane.showMessageDialog(null, "PLAYER 1 GANHOU");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "PLAYER 2 GANHOU");
                dispose();
            }
            return true;
        }
        
        // verificar empate
        boolean empate = true;
        Component[] components = getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                if (button.getText().equals("")) {
                    empate = false;
                    break;
                }
            }
        }

        if (empate) {
            JOptionPane.showMessageDialog(null, "EMPATE");
            dispose();
        }

        return false;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0x0;
    private javax.swing.JButton button0x1;
    private javax.swing.JButton button0x2;
    private javax.swing.JButton button1x0;
    private javax.swing.JButton button1x1;
    private javax.swing.JButton button1x2;
    private javax.swing.JButton button2x0;
    private javax.swing.JButton button2x1;
    private javax.swing.JButton button2x2;
    // End of variables declaration//GEN-END:variables

}
