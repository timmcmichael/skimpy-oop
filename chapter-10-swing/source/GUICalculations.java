import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICalculations extends JFrame implements ActionListener {

    // Widgets
    JLabel lblFood, lblDrink, lblResult;
    JTextField txtFood, txtDrink;
    JCheckBox chkTip;
    JButton btnCalc;

    public GUICalculations() {
        super("Meal Price");
        this.lblFood = new JLabel("Enter the price of food:");
        this.txtFood = new JTextField("0.00");
        this.lblDrink = new JLabel("Enter the price of drinks:");
        this.txtDrink = new JTextField("0.00");
        this.chkTip = new JCheckBox("Add a 20% tip");
        this.btnCalc = new JButton("Calculate Total Price of Meal");
        this.lblResult = new JLabel("Total Price: $");

        this.setSize(300, 200);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(lblFood);
        this.add(txtFood);
        this.add(lblDrink);
        this.add(txtDrink);
        this.add(chkTip);
        this.add(btnCalc);
        this.add(lblResult);

        this.btnCalc.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = this.txtFood.getText();
        double foodPrice = Double.parseDouble(input);
        // System.out.println("food = " + foodPrice);

        double drinkPrice = Double.parseDouble(this.txtDrink.getText());
        // System.out.println("drink = " + drinkPrice);

        double total = foodPrice + drinkPrice;

        boolean addTip = this.chkTip.isSelected();

        if (addTip) {
            total *= 1.2;
        }

        this.lblResult.setText("Total Price: $" + total);

    }

    public static void main(String[] args) {
        GUICalculations frame = new GUICalculations();
        frame.setVisible(true);
    }

}
