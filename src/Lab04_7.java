import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Lab04_7 {

    static int n1, n2, ans;
    static int count = 1;
    static int score = 0;
    static String symbol;

    public static void main(String[] args) {

        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 500, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel subwin = new JPanel();
        subwin.setBackground(Color.pink);

        JLabel labelCount = new JLabel("Question 1 / 10");
        labelCount.setFont(new Font("Serif", Font.PLAIN, 20));
        subwin.add(labelCount);

        JLabel label1 = new JLabel();
        label1.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label1);

        JLabel labelOp = new JLabel();
        labelOp.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(labelOp);

        JLabel label2 = new JLabel();
        label2.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label2);

        JLabel labelEq = new JLabel(" = ");
        labelEq.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(labelEq);

        JTextField ansBox = new JTextField(2);
        ansBox.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(ansBox);

        JButton btn = new JButton("Check");
        btn.setFont(new Font("Serif", Font.PLAIN, 20));
        subwin.add(btn);

        JLabel resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        subwin.add(resultLabel);

        generateQuestion(label1, label2, labelOp);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userAns = Integer.parseInt(ansBox.getText());

                    if (userAns == ans) {
                        score++;
                        resultLabel.setText("Correct!");
                    } else {
                        resultLabel.setText("Wrong!");
                    }

                    if (count == 10) {
                        JOptionPane.showMessageDialog(
                                win,
                                "Final Score: " + score + " / 10"
                        );
                        System.exit(0);
                    }

                    count++;
                    labelCount.setText("Question " + count + " / 10");
                    ansBox.setText("");
                    resultLabel.setText("");

                    generateQuestion(label1, label2, labelOp);

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Enter a number");
                }
            }
        });

        win.add(subwin);
        win.setVisible(true);
    }

    static void generateQuestion(JLabel l1, JLabel l2, JLabel lop) {
        n1 = (int)(Math.random() * 10);
        n2 = (int)(Math.random() * 10);
        int op = (int)(Math.random() * 2);

        if (op == 0) {
            symbol = "+";
            ans = n1 + n2;
        } else {
            symbol = "-";
            ans = n1 - n2;
        }

        l1.setText("" + n1);
        l2.setText("" + n2);
        lop.setText(" " + symbol + " ");
    }
}



