package GUI_Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class button {
    public static void main(String[] args) {
        new myFrame(); // setup the frame

    }
}

class myFrame extends JFrame implements ActionListener {
    JButton button; // declare before myFrame constructor
    JLabel label;
    myFrame(){

        
        ImageIcon icon = new ImageIcon("images/download.png");
        ImageIcon icon2 = new ImageIcon("images/ima1.jpg");
        
        label = new JLabel();
        label.setIcon(icon2);
        label.setText("YOU CLICKED!!!");
        label.setBounds(0, 0, 1500, 1000);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 600, 400);
        button.addActionListener(this); // add the ActionListener 'this' (idk what's happening here)
        button.setText("Click here!");
        button.setFocusable(false); // get rid of the anoying square in the button's text area
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);// make the text to the center of the button
        button.setVerticalTextPosition(JButton.BOTTOM); // make the text to the bottom of the button
        button.setFont(new Font("Comic sans", Font.BOLD, 50));
        button.setIconTextGap(-10);
        button.setForeground(new Color(120,201,12));
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder()); // add the border
        // button.setEnabled(false);// to disable the button
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,1000);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    
    // listen to events
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){ // listen to the click event
            System.out.println("Clicked");
            label.setVisible(true);
            button.setEnabled(false);// to disable the button after click, so it can only click once
            button.setVisible(false);
        }
    }
}
