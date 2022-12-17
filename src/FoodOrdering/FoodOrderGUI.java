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
        rbNone.setSelected(true);

        btnOrder.addActionListener(e -> {
            double total = 0;
            double result = 0;
            try {
                boolean foodSelected = false;
                for(JCheckBox food : bgFood) {
                    if (food.isSelected()) {
                        foodSelected = true;
                        switch (food.getText()) {
                            case "Pizza":
                                total += 100;
                                break;
                            case "Burger":
                                total += 80;
                                break;
                            case "Fries":
                                total += 65;
                                break;
                            case "Soft Drinks":
                                total += 55;
                                break;
                            case "Tea":
                                total += 50;
                                break;
                            case "Sundae":
                                total += 40;
                                break;
                            default:
//                                throw new NoFoodSelectedException("No food was selected");
                                break;
                        }
                    }
                }
                if (!foodSelected) {
                    throw new NoFoodSelectedException("No food was selected");
                }
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
                            break;
                    }
                }
                JOptionPane.showMessageDialog(pnlMain, "The total price is Php " + String.format("%.2f",result));
            } catch (NoFoodSelectedException e1) {
                JOptionPane.showMessageDialog(pnlMain, e1.getMessage());
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(pnlMain, "Error! Please try again");
            }
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

    private class NoFoodSelectedException extends Exception {
        public NoFoodSelectedException(String s) {
            super(s);
        }
    }
}
