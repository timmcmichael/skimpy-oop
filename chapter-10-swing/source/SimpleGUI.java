import javax.swing.*;
import java.awt.*;

public class SimpleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JLabel lblHello = new JLabel("Hello World!");
        frame.add(lblHello);

        JLabel lblGreeting = new JLabel("Welcome to my amazing GUI that takes up a lot of space!");
        frame.add(lblGreeting);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
