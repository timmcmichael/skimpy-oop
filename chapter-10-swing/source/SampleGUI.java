import javax.swing.*;
import java.awt.*;
import java.security.cert.LDAPCertStoreParameters;

public class SampleGUI {

    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("A Super Amazing GUI!");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel mainPanel

        // Grids
        GridLayout topGrid = new GridLayout(2, 2);
        GridLayout bottomGrid = new GridLayout(1, 2);

        JPanel pricePane = new JPanel();

        JLabel lblPrice = new JLabel("Enter the price:");
        JTextField txtPrice = new JTextField(12);
        txtPrice.setText("11.99");

        // txtPrice.setMaximumSize(new Dimension(25, 10));
        JLabel lblTip = new JLabel("Select tip amount:");

        String[] tips = { "1", "2", "3", "4", "5" };

        JComboBox tipChoice = new JComboBox(tips);

        JCheckBox takeOut = new JCheckBox("Take-out fee $1.00", true);
        JCheckBox delivery = new JCheckBox("Delivery Fee $5.00", false);

        JButton btnCalc = new JButton("Calculate");
        btnCalc.setPreferredSize(new Dimension(100, 50));
        JLabel lblTotalText = new JLabel("Total Price:");
        JLabel lblTotal = new JLabel("$14.99");

        frame.setLayout(new FlowLayout());
        frame.add(lblPrice, BorderLayout.NORTH);
        frame.add(txtPrice, BorderLayout.SOUTH);
        frame.add(lblTip, BorderLayout.NORTH);
        frame.add(tipChoice, BorderLayout.NORTH);
        frame.add(takeOut, BorderLayout.NORTH);
        frame.add(delivery, BorderLayout.NORTH);
        frame.add(btnCalc, BorderLayout.NORTH);
        frame.add(lblTotalText, BorderLayout.NORTH);
        frame.add(lblTotal, BorderLayout.NORTH);
        frame.setVisible(true);

    }

}
