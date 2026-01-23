import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class lab04_8 {

    public static void main(String[] args) {

        JFrame win = new JFrame("BMI Calculator");
        win.setSize(400, 350);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.PINK);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        Font customFont = new Font("Serif", Font.PLAIN, 16);

        JLabel lbWeight = new JLabel("Weight (kg):");
        lbWeight.setFont(customFont);
        lbWeight.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JTextField txtWeight = new JTextField(10);
        txtWeight.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        JLabel lbHeight = new JLabel("Height (cm):");
        lbHeight.setFont(customFont);
        lbHeight.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JTextField txtHeight = new JTextField(10);
        txtHeight.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        JButton btnCalc = new JButton("Calculate BMI");
        btnCalc.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btnCalc.setBackground(new Color(255, 105, 180));
        btnCalc.setForeground(Color.WHITE);

        JLabel lbResultBmi = new JLabel("BMI = ");
        lbResultBmi.setFont(new Font("Serif", Font.BOLD, 18));
        lbResultBmi.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JLabel lbResultText = new JLabel("Result: ");
        lbResultText.setFont(customFont);
        lbResultText.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(txtWeight.getText());
                    double height = Double.parseDouble(txtHeight.getText()) / 100;
                    double bmi = weight / (height * height);

                    lbResultBmi.setText(String.format("BMI = %.2f", bmi));

                    String result;
                    if (bmi < 18.5) result = "Underweight";
                    else if (bmi < 25) result = "Normal";
                    else if (bmi < 30) result = "Overweight";
                    else result = "Obese";

                    lbResultText.setText("Result: " + result);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(win, "Please enter valid numbers");
                }
            }
        });

        panel.add(lbWeight);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(txtWeight);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(lbHeight);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(txtHeight);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(btnCalc);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(lbResultBmi);
        panel.add(lbResultText);

        win.add(panel);
        win.setVisible(true);
    }
}
