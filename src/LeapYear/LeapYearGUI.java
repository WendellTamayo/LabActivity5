package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI leapyear = new LeapYearGUI();
        leapyear.setContentPane(leapyear.pnlMain);
        leapyear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        leapyear.setSize(400, 400);
        leapyear.setVisible(true);
        leapyear.setTitle("Leap Year Checker");
    }
}
