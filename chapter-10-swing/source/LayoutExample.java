import javax.swing.*;
import java.awt.*;

public class LayoutExample {
    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("A Super Amazing GUI!");
        frame.setSize(700, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Top Grid (price and tip)
        JLabel lblPrice = new JLabel("Enter the price: ");
        lblPrice.setHorizontalAlignment(JLabel.RIGHT);
        JTextField txtPrice = new JTextField(8);
        JPanel textWrapper = new JPanel(new FlowLayout(FlowLayout.LEFT));
        textWrapper.add(txtPrice);
        txtPrice.setText("11.99");

        JLabel lblTip = new JLabel("Select tip amount: ");
        lblTip.setHorizontalAlignment(JLabel.RIGHT);
        String[] tips = { "1", "2", "3", "4", "5" };

        JComboBox tipChoice = new JComboBox(tips);
        // tipChoice.setPreferredSize(new Dimension(5, 5));
        JPanel comboWrapper = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Or BorderLayout
        comboWrapper.add(tipChoice);

        JPanel topGrid = new JPanel(new GridLayout(2, 2));
        topGrid.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        topGrid.add(lblPrice);
        topGrid.add(textWrapper);
        topGrid.add(lblTip);
        topGrid.add(comboWrapper);

        // Middle grid (checkboxes)
        JCheckBox takeOut = new JCheckBox("Take-out fee $1.00", true);
        JCheckBox delivery = new JCheckBox("Delivery Fee $5.00", false);
        takeOut.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        delivery.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));

        JPanel midGrid = new JPanel(new GridLayout(2, 1));
        // midGrid.setSize(200, 20);
        midGrid.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 100));
        midGrid.setAlignmentX(Component.CENTER_ALIGNMENT);
        midGrid.add(takeOut);
        midGrid.add(delivery);

        // Add top panel, middle panel, and button to BoxLayout
        JButton btnCalc = new JButton("Calculate");
        btnCalc.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnCalc.setPreferredSize(new Dimension(100, 50));
        mainPanel.add(topGrid);
        mainPanel.add(midGrid);
        mainPanel.add(btnCalc);

        // Bottom Grid (total)
        JLabel lblTotalText = new JLabel("Total Price: ");
        lblTotalText.setHorizontalAlignment(JLabel.RIGHT);
        JLabel lblTotal = new JLabel("$14.99");
        JPanel bottomGrid = new JPanel(new GridLayout(1, 2));
        bottomGrid.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));
        bottomGrid.add(lblTotalText);
        bottomGrid.add(lblTotal);

        // Add bottom grid to Boxlayout
        mainPanel.add(bottomGrid);

        // Display the main panel
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);

    }
}
