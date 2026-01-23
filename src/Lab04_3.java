import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab04_3 {
    public static void main (String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Hello Program 68160032 Phadungsak Ngamchaem n15 .");
        f.setSize(500, 300);
        //f.setLayout(new FlowLayout());
        JPanel p1 = new JPanel();
        p1.setBackground(Color.yellow);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.gray);

        JLabel label1 = new JLabel();
        label1.setText("Enter name : ");
        p1.add(label1);
        JTextField nameBox = new JTextField(5);
        p1.add(nameBox);


        JLabel label2 = new JLabel();

        JButton b1 = new JButton();
        b1.setText("Send");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameBox.getText();
                label2.setText("Hello " + name);
                //JOptionPane.showMessageDialog(null," Hello "  +  name);

            }
        });
        p1.add(b1);
        p2.add(label2);
        f.add(p1, BorderLayout.CENTER);
        f.add(p2, BorderLayout.SOUTH);
        f.setVisible(true);
    }}
