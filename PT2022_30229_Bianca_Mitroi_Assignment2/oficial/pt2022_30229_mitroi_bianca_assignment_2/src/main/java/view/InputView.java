package view;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import javax.swing.JButton;

public class InputView {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JButton btnNewButton;

    public InputView() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 335);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        lblNewLabel = new JLabel("Number of queues");
        lblNewLabel.setBounds(10, 11, 150, 14);
        frame.getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(170, 8, 256, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(170, 39, 256, 20);
        frame.getContentPane().add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(170, 70, 256, 20);
        frame.getContentPane().add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(170, 101, 256, 20);
        frame.getContentPane().add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(170, 132, 256, 20);
        frame.getContentPane().add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(170, 163, 256, 20);
        frame.getContentPane().add(textField_5);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(170, 194, 256, 20);
        frame.getContentPane().add(textField_6);

        lblNewLabel_1 = new JLabel("Number of clients");
        lblNewLabel_1.setBounds(10, 42, 150, 14);
        frame.getContentPane().add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("Simulation time");
        lblNewLabel_2.setBounds(10, 73, 150, 14);
        frame.getContentPane().add(lblNewLabel_2);

        lblNewLabel_3 = new JLabel("Smallest arrival time");
        lblNewLabel_3.setBounds(10, 104, 150, 14);
        frame.getContentPane().add(lblNewLabel_3);

        lblNewLabel_4 = new JLabel("Largest arrival time");
        lblNewLabel_4.setBounds(10, 135, 150, 14);
        frame.getContentPane().add(lblNewLabel_4);

        lblNewLabel_5 = new JLabel("Smallest service time");
        lblNewLabel_5.setBounds(10, 166, 150, 14);
        frame.getContentPane().add(lblNewLabel_5);

        lblNewLabel_6 = new JLabel("Largest service time");
        lblNewLabel_6.setBounds(10, 197, 150, 14);
        frame.getContentPane().add(lblNewLabel_6);

        btnNewButton = new JButton("Continue");
        btnNewButton.setBounds(173, 244, 89, 23);
        frame.getContentPane().add(btnNewButton);

        frame.setVisible(true);
    }

    public JFrame getFrame()
    {
        return this.frame;
    }

    public void addButtonListener(ActionListener a) {
        btnNewButton.addActionListener(a);
    }

    public String getTextFieldText()
    {
        return textField.getText();
    }

    public String getTextField_1Text()
    {
        return textField_1.getText();
    }

    public String getTextField_2Text()
    {
        return textField_2.getText();
    }

    public String getTextField_3Text()
    {
        return textField_3.getText();
    }

    public String getTextField_4Text()
    {
        return textField_4.getText();
    }

    public String getTextField_5Text()
    {
        return textField_5.getText();
    }

    public String getTextField_6Text()
    {
        return textField_6.getText();
    }

}
