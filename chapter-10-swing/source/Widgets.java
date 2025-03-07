import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Widgets {

    public static void main(String[] args) {

        JFrame frame = new JFrame("All these layers!");
        frame.setSize(500, 500);

        // JButton btnClick = new JButton("Click me!");
        // btnClick.setBounds(50, 50, 150, 50);

        // JLabel lblHello = new JLabel("Hello World!");
        // lblHello.setBounds(50, 50, 200, 50);

        // JTextField txtInput = new JTextField();
        // txtInput.setBounds(50, 50, 200, 50);

        // frame.add(btnClick);
        // frame.add(lblHello);
        // frame.add(txtInput);

        // String[] colors = { "Red", "Green", "Blue", "Yellow" };
        // JComboBox cboColors = new JComboBox(colors);
        // cboColors.setBounds(50, 50, 175, 50);
        // frame.add(cboColors);

        // JComboBox cboColors2 = new JComboBox(colors);
        // cboColors2.setBounds(50, 100, 175, 50);
        // frame.add(cboColors2);

        JMenuBar menu = new JMenuBar();
        menu.setOpaque(true);
        menu.setBackground(Color.red);
        menu.setPreferredSize(new Dimension(175, 50));

        frame.setJMenuBar(menu);

        // frame.pack();
        frame.setVisible(true);

    }

}
