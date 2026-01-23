import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Lab04_5 {
    public static void main(String[] args) {
        int n1 = (int)(Math.random() * 10);
        System.out.println(n1);
        int n2 = (int)(Math.random() * 10);
        System.out.println(n2);
        int ans = n1+n2;

        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 500, 300);

        JPanel subwin = new JPanel();
        subwin.setBackground(Color.pink);

        JLabel label1 = new JLabel(""+n1);
        label1.setSize(30, 40);
        label1.setBackground(Color.white);

        label1.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label1);

        JLabel label3 = new JLabel(" + ");
        label3.setSize(30, 40);
        label3.setBackground(Color.gray);

        label3.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label3);

        JLabel label2 = new JLabel(""+n2);
        label2.setSize(30, 40);
        label2.setBackground(Color.gray);

        label2.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label2);

        JLabel label4 = new JLabel(" = ");
        label4.setSize(30, 40);
        label4.setBackground(Color.gray);

        label4.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label4);

        JTextField ansBox = new JTextField(2);
        ansBox.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(ansBox);

        JButton b1 = new JButton("Check");
        b1.setFont(new Font("Serif", Font.PLAIN, 20));

        subwin.add(b1);

        JLabel labelResult = new JLabel();
        labelResult.setSize(30, 40);
        labelResult.setBackground(Color.gray);

        labelResult.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(labelResult);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = ansBox.getText();
                int userAns = Integer.parseInt(str);
                if (ans == userAns) {
                    labelResult.setText("Excellent!");
                }
                else {
                    labelResult.setText("Try again!");
                }
            }

        });


        win.add(subwin);

        win.setVisible(true);
    }
}


