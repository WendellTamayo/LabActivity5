package SimpleCalc;

import javax.swing.*;
import javax.swing.border.Border;

public class SimpleCalcGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JPanel tfNumber2;
    private JTextField lblResult;

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


