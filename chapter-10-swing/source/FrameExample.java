import javax.swing.*;
import java.awt.*;

public class FrameExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Grid in BoxLayout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

            // Create a panel with GridLayout
            JPanel gridPanel = new JPanel(new GridLayout(2, 2));
            gridPanel.add(new JButton("Button 1"));
            gridPanel.add(new JButton("Button 2"));
            gridPanel.add(new JButton("Button 3"));
            gridPanel.add(new JButton("Button 4"));

            // Add the grid panel to the main panel
            mainPanel.add(gridPanel);

            // Add another component to the main panel (e.g., a label)
            mainPanel.add(new JLabel("This is a label below the grid."));

            frame.getContentPane().add(mainPanel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}