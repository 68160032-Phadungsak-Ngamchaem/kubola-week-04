import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab04_1 {
    public static void main (String[] args){
        JFrame f = new JFrame();
        f.setTitle("Hello Program 68160032 Phadungsak Ngamchaem n15 .");
        f.setSize(500,300);
        f.setLayout(new FlowLayout());
        JLabel label1 = new JLabel();
        label1.setText("Enter name : ");
        f.add(label1);
        JTextField nameBox = new JTextField(5);
        f.add(nameBox);

        JButton b1 =new JButton();
        b1.setText("Send");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameBox.getText();
                JOptionPane.showMessageDialog(null," Hello "  +  name);

            }
        });
        f.add(b1);


        f.setVisible(true);


    }
}

