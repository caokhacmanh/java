package GUI_Swing;

import java.awt.Color;

import javax.swing.JFrame;

public class frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // create a frame

        frame.setTitle("The JFrame title"); // set it's title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // really need to close the program when we press the close button
        frame.setResizable(false); // prevent resizing the program
        frame.setLayout(null); // necessary
        frame.setSize(420,420); // set the size of the frame, frame.setSize(x, y)
        frame.setVisible(true); // make the frame visible

        // frame.getContentPane().setBackground(Color.ORANGE); // change the color of the background
        frame.getContentPane().setBackground(new Color(120,235,234)); // change the color of the background to the RGB color
        
    }
}
