package GUI_Swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\caokh\\OneDrive\\Attachments\\Pictures\\Camera Roll\\WIN_20210826_14_12_12_Pro.jpg");

        JLabel label = new JLabel();
        label.setText("Cao Khac Trong");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(100, 150, 200));
        label.setFont(new Font("Times", Font.ITALIC, 50));
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // frame.setSize(800, 600);  
        frame.getContentPane().setBackground(Color.WHITE);
        frame.add(label);
        frame.pack();      
    }
}
