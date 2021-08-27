package GUI_Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
    public static void main(String[] args) {

        new GUIFrame();
        
    }
}

class GUIFrame extends JFrame{

    GUIFrame(){

        GUIPanel GUI1 = new GUIPanel("Panel1", 0, 0);
        GUIPanel GUI2 = new GUIPanel("Panel2", 210, 0);
        GUIPanel GUI3 = new GUIPanel("Panel3", 0, 210);
        GUIPanel GUI4 = new GUIPanel("Panel4", 210, 210);
    
        this.setSize(800,600);
        this.setTitle("Programed by H1A4C3K");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.add(GUI1.panel);
        this.add(GUI2.panel);
        this.add(GUI3.panel);
        this.add(GUI4.panel);
    }

}

class GUIPanel extends JPanel implements ActionListener{

    JButton button;
    JPanel panel;

    GUIPanel(String name, int x, int y){
        ImageIcon icon1 = new ImageIcon("images/download.png");

        button = new JButton();
        button.setText(name);
        button.setBounds(0, 100, 200, 100);
        button.setFocusable(false);
        button.setLayout(null);
        button.setFont(new Font("Comic sans ms", Font.ITALIC, 25));
        button.setBackground(Color.LIGHT_GRAY);
        button.addActionListener(this);

        JLabel label = new JLabel();
        label.setBounds(0, 0, 200, 100);
        label.setIcon(icon1);

        panel = new JPanel();
        panel.setBackground(Color.MAGENTA);
        panel.setLayout(null);
        panel.setBounds(x, y, 200, 200);
        panel.setBorder(BorderFactory.createEtchedBorder());
        panel.add(label);
        panel.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            button.setEnabled(false);
            button.setText("Disabled");
        }
        
    }
}
