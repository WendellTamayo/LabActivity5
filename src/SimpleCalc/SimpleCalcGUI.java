package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JPanel JPanel;
    private JTextField lblResult;
    private JTextField tfNumber2;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                String operation = cbOperations.getSelectedItem().toString();
                int result = 0;
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                lblResult.setText(String.valueOf(result));
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.pnlMain);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setSize(500, 400);
        calc.setLocationRelativeTo(null);
        calc.setVisible(true);
        calc.setTitle("Simple Calculator");
    }
}


