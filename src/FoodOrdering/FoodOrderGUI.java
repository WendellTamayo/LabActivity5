package FoodOrdering;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderGUI extends  JFrame{
    private JPanel pnlMain;
    private JCheckBox cPizza;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    private List<JRadioButton> bgDiscounts;
    private List<JCheckBox> bgFood;

    public FoodOrderGUI() {
        bgDiscounts = new ArrayList<>();
        bgDiscounts.add(rbNone);
        bgDiscounts.add(rb5);
        bgDiscounts.add(rb10);
        bgDiscounts.add(rb15);

        bgFood = new ArrayList<>();
        bgFood.add(cPizza);
        bgFood.add(cBurger);
        bgFood.add(cFries);
        bgFood.add(cSoftDrinks);
        bgFood.add(cTea);
        bgFood.add(cSundae);
        btnOrder.addActionListener(e -> {
            double total = 0;
            for(JCheckBox food : bgFood) {
                switch (food.getText()) {
                    case "Pizza":
                        if (food.isSelected()) {
                            total += 100;
                        }
                        break;
                    case "Burger":
                        if (food.isSelected()) {
                            total += 80;
                        }
                        break;
                    case "Fries":
                        if (food.isSelected()) {
                            total += 65;
                        }
                        break;
                    case "Soft Drinks":
                        if (food.isSelected()) {
                            total += 55;
                        }
                        break;
                    case "Tea":
                        if (food.isSelected()) {
                            total += 50;
                        }
                        break;
                    case "Sundae":
                        if (food.isSelected()) {
                            total += 40;
                        }
                        break;
                }
            }
            double result = 0;
            for(JRadioButton discount : bgDiscounts) {
                switch (discount.getText()) {
                    case "None":
                        if(discount.isSelected()) {
                            result = total;
                        }
                        break;
                    case "5% Off":
                        if(discount.isSelected()) {
                            result = total - (total * 0.05);
                        }
                        break;
                    case "10% Off":
                        if(discount.isSelected()) {
                            result = total - (total * 0.10);
                        }
                        break;
                    case "15% Off":
                        if(discount.isSelected()) {
                            result = total - (total * 0.15);
                        }
                        break;
                    default:
                        result = total;
                        break;
                }
            }
            JOptionPane.showMessageDialog(pnlMain, "The total price is Php " + String.format("%.2f",result));
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();
        order.setContentPane(order.pnlMain);
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setSize(500, 600);
        order.setLocationRelativeTo(null);
        order.setVisible(true);
        order.setTitle("Food Ordering System");
    }
}
