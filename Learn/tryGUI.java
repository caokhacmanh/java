package Learn;

import javax.swing.JOptionPane;

public class tryGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter name:"); // Input to var name
        JOptionPane.showMessageDialog(null, "Hi " + name); // Show the message

        int age;
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Input age:"));
        JOptionPane.showMessageDialog(null, "Ur " + age);

        double height;
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Input height:"));
        JOptionPane.showMessageDialog(null, "Ur " + height);
    }       
}
