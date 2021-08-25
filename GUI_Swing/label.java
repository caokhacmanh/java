package GUI_Swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class label {
    public static void main(String[] args) {
        

        ImageIcon image = new ImageIcon("images/download.png");
        Border border = BorderFactory.createLineBorder(Color.CYAN, 3); // (<color>, <width>)

        JLabel label = new JLabel();
        label.setText("Hello world"); // set text of label to "Hello world"
        label.setIcon(image); // put an image to the program
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER or RIGHT of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text to the TOP, CENTER or BOTTOM of imageIcon
        label.setForeground(new Color(120,201,12)); // change the label color
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // set the font of the label: (<font>, Font.<style>, size)
        label.setIconTextGap(-15); // set the gap between the label and the icon, can put in negative or positive value
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        // label.setBounds(0, 0, 400, 400);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        // frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("label.java");
        frame.add(label);
        frame.pack(); // automatic set size of the frame, must use after add all the componets
        // frame.setLayout(null); // display nothing, want to display? - use label.setBounds(x, y, width, height)
        // frame.getContentPane().setBackground(new Color(120,201,12));



    }
}
