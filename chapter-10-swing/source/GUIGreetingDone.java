import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIGreetingDone extends JFrame implements ActionListener {

    // Fields = widgets
    JTextField txtName;
    JButton btnSubmit;
    JLabel lblPrompt, lblResult;

    // Constructor: set up the GUI!
    public GUIGreetingDone() {
        // Set the frame's title!
        super("Greetings!");

        // Frame settings:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new FlowLayout());

        // Populate the GUI
        this.lblPrompt = new JLabel("Enter your name:");
        this.txtName = new JTextField("Your name here");
        this.txtName.setPreferredSize(new Dimension(250, 25));
        this.btnSubmit = new JButton("Submit");
        this.lblResult = new JLabel();
        this.lblResult.setPreferredSize(new Dimension(250, 25));

        this.add(lblPrompt);
        this.add(txtName);
        this.add(btnSubmit);
        this.add(lblResult);

        this.btnSubmit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "Hello, ";
        message += this.txtName.getText();
        this.lblResult.setText(message);

    }

    public static void main(String[] args) {
        GUIGreeting frame = new GUIGreeting();
        frame.setVisible(true);

    }

}
