package src.View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class GameView {
    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Set the background color of the frame
        frame.getContentPane().setBackground(Color.BLACK);

        // Create a JLabel instance
        JLabel label = new JLabel("Hello, Swing!");
        label.setBounds(50, 50, 200, 30);
        
        // Create a JButton instance
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 30);
        button.addActionListener(e -> {
            label.setText("Button clicked!");
        });
        
        // Add the label and button to the frame's content pane
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        
        // Set the layout manager to null for manual component positioning
        frame.getContentPane().setLayout(null);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
