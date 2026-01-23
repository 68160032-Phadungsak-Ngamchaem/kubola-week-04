import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lab04_6 {
    public static void main(String[] args) {

        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        int op = (int)(Math.random() * 2);
        int ans = 0;
        String symbol = "";

        if (op == 0) {
            symbol = "+";
            ans = n1 + n2;
        } else if(op == 1) {
            symbol = "-";
            ans = n1 - n2;
        } else {
            symbol = "*";
            ans = n1 * n2;
        }

        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 500, 300);

        JPanel subwin = new JPanel();
        subwin.setBackground(Color.pink);

        JLabel label1 = new JLabel("" + n1);
        label1.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label1);

        JLabel label3 = new JLabel(" " + symbol + " ");
        label3.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label3);

        JLabel label2 = new JLabel("" + n2);
        label2.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label2);

        JLabel label4 = new JLabel(" = ");
        label4.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label4);

        JTextField ansBox = new JTextField(2);
        ansBox.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(ansBox);

        JButton b1 = new JButton("Check");
        b1.setFont(new Font("Serif", Font.PLAIN, 20));
        subwin.add(b1);

        JLabel labelResult = new JLabel("");
        labelResult.setFont(new Font("Serif", Font.PLAIN, 30));
        subwin.add(labelResult);

        int correctAnswer = ans;

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userAns = Integer.parseInt(ansBox.getText());
                    if (userAns == correctAnswer) {
                        labelResult.setText("Excellent!");
                    } else {
                        labelResult.setText("Try again!");
                    }
                } catch (NumberFormatException ex) {
                    labelResult.setText("Enter number!");
                }
            }
        });

        win.add(subwin);
        win.setVisible(true);
    }
}



