package JFrameTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyWindow extends JFrame {

    public MyWindow() {
        super("My First Window");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        //create components
        JLabel label = new JLabel("Enter your name: ");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Say Hello");
        JLabel output = new JLabel("Waiting...");
        
        //align the to left
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        textField.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        output.setAlignmentX(Component.LEFT_ALIGNMENT);
        //add spacing
        panel.add(label);
        panel.add(Box.createVerticalStrut(8));  
        panel.add(textField);
        panel.add(Box.createVerticalStrut(8));
        panel.add(button);
        panel.add(Box.createVerticalStrut(12));
        panel.add(output);
        panel.add(new JLabel("testing"));
        add(panel);

                // Handle button click event
        button.addActionListener(e -> {
            String name = textField.getText();
            if (name.isEmpty()) {
                output.setText("Please enter a name.");
            } else {
                output.setText("Hello, " + name + "!");
            }
        });

        // Window settings
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
      }
}
public class JFrameTest {
      public static void main(String[] args) {
        // Launch Swing on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new MyWindow());
    }
}
