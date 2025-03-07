import javax.swing.*;
import java.awt.*;

public class JLabelExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Label Example");
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JLabel lblHello = new JLabel("Hello World!");
        frame.add(lblHello);

        JLabel lblWelcome = new JLabel("Welcome to my amazing GUI with all this text!");
        frame.add(lblWelcome);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
