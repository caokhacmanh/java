package GUI_Swing;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel {
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("images/download.png");

        JLabel label = new JLabel();
        label.setText("Hello World!");
        label.setForeground(new Color(100,150,200));
        label.setIcon(icon);
        // label.setVerticalAlignment(JLabel.TOP);
        // label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 250);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null); // use no layout and we have to use label.setBounds();
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null); // use no layout and we have to use label.setBounds();
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null); // use no layout and we have to use label.setBounds();
        // greenPanel.setLayout(new BorderLayout()); // use default JFrame layout
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(1200,800);

        greenPanel.add(label);
        
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
