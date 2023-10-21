import javax.swing.*;
import java.awt.event.*;

public class currencyConverter extends JFrame implements ActionListener {


    String[] currency = {"US Dollar","Indian Rupee","Canadian Dollar","British Pound","Euro","Chinese Yuan","Emirati Driham"};
    JLabel label1 = new JLabel("Currency Converter");
    JLabel label2_input = new JLabel("Select the Input Currency :");
    JLabel label3_amount = new JLabel("Enter Amount :");
    JLabel label4_output = new JLabel("Select the Output Currency :");
    JLabel label5_converted = new JLabel("Converted Amount :");
    JButton convert = new JButton("Convert");
    JButton clear = new JButton("Clear");
    JTextField tf_input= new JTextField();
    JTextField tf_output = new JTextField();
    JComboBox<String> c1 = new JComboBox<String>(currency);
    JComboBox<String> c2 = new JComboBox<String>(currency);


    currencyConverter()
    {
        setTitle("Currency Converter");
        setVisible(true);
        setLayout(null);
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Bounds();
        add_to_jframe();
        Action();
        components();

    }
    void components()
    {
        c1.setSelectedIndex(0);
        c2.setSelectedIndex(1);

    }
    void Action()
    {
        convert.addActionListener(this);
        clear.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        tf_input.addActionListener(this);
        tf_output.addActionListener(this);
    }

    void Bounds()
    {
        label1.setBounds(140,20,120,20);
        label2_input.setBounds(70,60,150,20);
        c1.setBounds(235,60,100,20);
        label3_amount.setBounds(70,100,100,20);
        tf_input.setBounds(180,100,140,20);
        label4_output.setBounds(70,140,180,20);
        c2.setBounds(235,140,100,20);
        convert.setBounds(150,190,100,20);
        label5_converted.setBounds(70,230,150,20);
        tf_output.setBounds(200,230,140,20);
        clear.setBounds(150,270,100,20);
    }

    void add_to_jframe()
    {
        add(label1);
        add(label2_input);
        add(label3_amount);
        add(label4_output);
        add(label5_converted);
        add(convert);
        add(clear);
        add(tf_input);
        add(tf_output);
        add(c1);
        add(c2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double a,c = 0;
        a = Double.valueOf(tf_input.getText());
        try {
            if (e.getSource() == clear) {
                tf_input.setText("");
                tf_output.setText("");
            }
            if (e.getSource() == convert) {
                if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 0) {
                    c = a ;
                }
                if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 1) {
                    c = a * 82.29;
                }
                if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 2) {
                    c = a * 1.32;
                }
                if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 3) {
                    c = a * 0.78;
                }
                if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 4) {
                    c = a * 0.91;
                }
                if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 5) {
                    c = a * 7.12;
                }
                if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 6) {
                    c = a * 3.67;
                }
                if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 0) {
                    c = a * 0.012;
                }
                if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 1) {
                    c = a ;
                }
                if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 2) {
                    c = a * 0.016;
                }
                if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 3) {
                    c = a * 0.0095;
                }
                if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 4) {
                    c = a * 0.011;
                }
                if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 5) {
                    c = a * 0.087;
                }
                if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 6) {
                    c = a * 0.045;
                }
                if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 0) {
                    c = a * 0.76;
                }
                if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 1) {
                    c = a * 62.25;
                }
                if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 2) {
                    c = a ;
                }
                if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 3) {
                    c = a * 0.59;
                }
                if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 4) {
                    c = a * 0.69;
                }
                if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 5) {
                    c = a * 5.39;
                }
                if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 6) {
                    c = a * 2.78;
                }
                if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 0) {
                    c = a * 1.28;
                }
                if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 1) {
                    c = a * 105.53;
                }
                if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 2) {
                    c = a * 1.70;
                }
                if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 3) {
                    c = a ;
                }
                if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 4) {
                    c = a * 1.17;
                }
                if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 5) {
                    c = a * 9.13;
                }
                if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 6) {
                    c = a * 4.71;
                }
                if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 0) {
                    c = a * 1.10;
                }
                if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 1) {
                    c = a * 90.42;
                }
                if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 2) {
                    c = a * 1.45;
                }
                if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 3) {
                    c = a * 0.86;
                }
                if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 4) {
                    c = a ;
                }
                if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 5) {
                    c = a * 7.82;
                }
                if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 6) {
                    c = a * 4.03;
                }
                if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 0) {
                    c = a * 0.14;
                }
                if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 1) {
                    c = a * 11.55;
                }
                if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 2) {
                    c = a * 0.19;
                }
                if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 3) {
                    c = a * 0.11;
                }
                if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 4) {
                    c= a * 0.13;
                }
                if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 5) {
                    c = a ;
                }
                if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 6) {
                    c = a * 0.52;
                }
                if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 0) {
                    c = a * 0.27;
                }
                if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 1) {
                    c = a * 22.41;
                }
                if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 2) {
                    c = a * 0.36;
                }
                if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 3) {
                    c = a * 0.21;
                }
                if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 4) {
                    c = a * 0.25;
                }
                if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 5) {
                    c = a * 1.94;
                }
                if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 6) {
                    c = a ;
                }
                String.format("%.2f",c);
                tf_output.setText(String.valueOf(c));
            }
        }
        catch(Exception ef){
            System.out.println("");
        }
    }

    public static void main(String[] args) {
    	new currencyConverter();
    }
}