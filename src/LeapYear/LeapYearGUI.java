package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
            btnCheckYear.addActionListener(e -> {
                int year = Integer.parseInt(tfYear.getText());
                if (year % 4 == 0) {
                    JOptionPane.showMessageDialog(pnlMain, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(pnlMain, "Not a leap year");
                }
            });
    }

    public static void main(String[] args) {
        LeapYearGUI leapyear = new LeapYearGUI();
        leapyear.setContentPane(leapyear.pnlMain);
        leapyear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        leapyear.setSize(400, 400);
        leapyear.setLocationRelativeTo(null);
        leapyear.setVisible(true);
        leapyear.setTitle("Leap Year Checker");
    }
}
