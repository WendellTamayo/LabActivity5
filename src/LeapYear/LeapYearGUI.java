package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(e -> {
            try {
                int year = Integer.parseInt(tfYear.getText());
                if(year <= 0) {
                    throw new NegativeNumberException("Year cannot be zero or negative");
                }
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            JOptionPane.showMessageDialog(pnlMain, "Leap year");
                        } else {
                            JOptionPane.showMessageDialog(pnlMain, "Not a leap year");
                        }
                    } else {
                        JOptionPane.showMessageDialog(pnlMain, "Leap year");
                    }
                } else {
                    JOptionPane.showMessageDialog(pnlMain, "Not a leap year");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(pnlMain, "Invalid input");
            } catch (NegativeNumberException ex) {
                JOptionPane.showMessageDialog(pnlMain, ex.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(pnlMain, "Error! Please try again");
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

    private class NegativeNumberException extends Throwable {
        public NegativeNumberException(String s ) {
            super(s);
        }
    }
}

