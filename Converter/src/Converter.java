import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor
    /*
     *
     * @ author GROUP 3
     */
    public class Assignment extends JFrame implements  ActionListener{
        static String from = "USD"; //default value
        static String to = "USD"; //default value
        static double amount;
        static JPanel panel;
        static JPanel screen;
        static JLabel label;
        static JLabel text;
        static JLabel text2;
        static JComboBox combobox1;
        static JComboBox combobox2;
        static JTextField textfield;
        static JButton button;
        static JFrame frame;

        /*
         * @param args the command line arguments
         */

        public static void main(String[] args) {
            // creating base panel where all other panel would be placed
            panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.WHITE);

            //creating screen panel where results would be displayed
            screen = new JPanel();
            screen.setLayout(null);
            screen.setBackground(Color.LIGHT_GRAY);
            screen.setForeground(Color.BLACK);
            screen.setBounds(50, 30, 400, 100);
            panel.add(screen);
            //adding screen panel to base panel

            label = new JLabel();
            label.setForeground(Color.black);
            label.setFont(new Font("arial",Font.BOLD,30));
            label.setBounds(20,0,290,80);
            screen.add(label);

            //creating a label to add text to
            text = new JLabel();
            text.setForeground(Color.BLACK);
            text.setFont(new Font("monospace",Font.BOLD,15));
            text.setBounds(50, 250, 50, 20);
            text.setText("FROM");
            panel.add(text);

            //creating a label to add text to
            text2 = new JLabel();
            text2.setForeground(Color.BLACK);
            text2.setFont(new Font("monospace",Font.BOLD,15));
            text2.setBounds(300, 250, 50, 20);
            text2.setText("TO");
            panel.add(text2);

            //storing all available currencies in an array
            String[] currencies = {"USD", "NGN", "JPY", "EUR"};

            //creating combo boxes based on currencies array
            //allowing users to select which currencies to convert
            combobox1 = new JComboBox(currencies);
            combobox1.setBounds(50, 280, 150, 50);
            panel.add(combobox1);

            combobox2 = new JComboBox(currencies);
            combobox2.setBounds(300, 280, 150, 50);
            panel.add(combobox2);

            //adding a text field where amount is going to be entered
            textfield = new JTextField();
            textfield.setBounds(50, 160, 400, 50);
            panel.add(textfield);

            //adding button to convert
            button = new JButton();
            button.setText("Convert");
            button.setBackground(Color.blue);
            button.setForeground(Color.WHITE);
            button.setBounds(50, 370, 400, 50);
            button.addActionListener(new Assignment());
            panel.add(button);

            frame = new JFrame();
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setResizable(false);
            frame.setVisible(true);
            frame.add(panel);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //clearing the value of the label
            label.setText("");
            //creating a label for result
            if (e.getActionCommand().equals("Convert")){
                double value;

                from = combobox1.getSelectedItem().toString();
                to = combobox2.getSelectedItem().toString();

                amount = Double.parseDouble(textfield.getText());

                //same currency conversion
                if (from.equals(to))
                {
                    label.setText(Double.toString(amount));
                }

                //conversion for usd to ngn
                if (from.equals("USD") && to.equals("NGN")) {
                    value = amount * 460;
                    label.setText(Double.toString(value));
                }
                //converting from usd to jpy
                if (from.equals("USD") && to.equals("JPY")) {
                    value = amount * 136;
                    label.setText(Double.toString(value));
                }
                //converting from usd to eur
                if (from.equals("USD") && to.equals("EUR")) {
                    value = amount * 0.94;
                    label.setText(Double.toString(value));
                }

                //conversion for ngn to usd
                if (from.equals("NGN") && to.equals("USD")) {
                    value = amount * 0.0022;
                    label.setText(Double.toString(value));
                }
                //converting from ngn to jpy
                if (from.equals("NGN") && to.equals("JPY")) {
                    value = amount * 0.3;
                    label.setText(Double.toString(value));
                }
                //converting from ngn to eur
                if (from.equals("NGN") && to.equals("EUR")) {
                    value = amount * 0.0021;
                    label.setText(Double.toString(value));
                }

                //conversion for jpy to usd
                if (from.equals("JPY") && to.equals("USD")) {
                    value = amount * 0.0073;
                    label.setText(Double.toString(value));
                }
                //converting from jpy to ngn
                if (from.equals("JPY") && to.equals("NGN")) {
                    value = amount * 3.38;
                    label.setText(Double.toString(value));
                }
                //converting from jpy to eur
                if (from.equals("JPY") && to.equals("EUR")) {
                    value = amount * 0.0069;
                    label.setText(Double.toString(value));
                }

                //conversion for eur to usd
                if (from.equals("EUR") && to.equals("USD")) {
                    value = amount * 1.06;
                    label.setText(Double.toString(value));
                }
                //converting from eur to ngn
                if (from.equals("EUR") && to.equals("NGN")) {
                    value = amount * 488.49;
                    label.setText(Double.toString(value));
                }
                //converting from eur to jpy
                if (from.equals("EUR") && to.equals("jpy")) {
                    value = amount * 144.45;
                    label.setText(Double.toString(value));
                }
            }

        }

    }
}
