package calculator_app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculator_app  implements ActionListener {
    /* create */
    JFrame frame;
    JTextField textField;
    JButton[] numbers = new JButton[10];
    JButton[] functions = new JButton[10];
    JButton add, sub, mul, div, mod, pow;
    JButton dec, equ, del, clr;

    JPanel panel;
    double num1 = 0, num2 = 0, result = 0;
    char operator = '#', operator2 = '#';
    boolean flag = false;
    Font font = new Font("Ink Free", Font.BOLD, 30);
    /* create */

    calculator_app () {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField("0");
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(font);
        textField.setEditable(false);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        dec = new JButton(".");
        equ = new JButton("=");
        mod = new JButton("%");
        pow = new JButton("^");
        del = new JButton("Delete");
        clr = new JButton("Clear");

        functions[0] = add;
        functions[1] = sub;
        functions[2] = mul;
        functions[3] = div;
        functions[4] = dec;
        functions[5] = equ;
        functions[6] = del;
        functions[7] = clr;
        functions[8] = mod;
        functions[9] = pow;
        for (int i = 0; i < 10; ++ i) {
            functions[i].addActionListener(this);
            functions[i].setFont(font);
            functions[i].setFocusable(false);
        }

        for (int i = 0; i < 10; ++ i) {
            numbers[i] = new JButton(String.valueOf(i));
            numbers[i].addActionListener(this);
            numbers[i].setFont(font);
            numbers[i].setFocusable(false);
        }

        del.setBounds(50, 430, 145, 50);
        clr.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        panel.setBackground(Color.WHITE);
        panel.setBounds(50, 100, 300, 300);

        panel.add(numbers[1]);
        panel.add(numbers[2]);
        panel.add(numbers[3]);
        panel.add(add);
        panel.add(numbers[4]);
        panel.add(numbers[5]);
        panel.add(numbers[6]);
        panel.add(sub);
        panel.add(numbers[7]);
        panel.add(numbers[8]);
        panel.add(numbers[9]);
        panel.add(mul);
        panel.add(dec);
        panel.add(numbers[0]);
        panel.add(equ);
        panel.add(div);
        panel.add(mod);
        panel.add(pow);


        frame.add(panel);
        frame.add(del);
        frame.add(clr);

        frame.add(textField);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; ++ i) {
            if (e.getSource() == numbers[i]) {
                if (flag == false) {
                    textField.setText("");
                    flag = true;
                }
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == dec) {
            textField.setText(textField.getText().concat("."));
        }

        if (e.getSource() == add) {
            if (operator == '#') {
                String tmp = textField.getText();
                if (!tmp.equals(""))
                    num1 = Double.parseDouble(tmp);
            }
            else {
                String tmp = textField.getText();
                if (!tmp.equals("")) {
                    switch (operator) {
                        case '+': num1 = num1 + Double.parseDouble(tmp);
                            break;
                        case '-': num1 = num1 - Double.parseDouble(tmp);
                            break;
                        case '*': num1 = num1 * Double.parseDouble(tmp);
                            break;
                        case '/': num1 = num1 / Double.parseDouble(tmp);
                            break;
                        case '%': num1 = num1 % Double.parseDouble(tmp);
                            break;
                        case '^' : num2 = Math.pow(num2, Double.parseDouble(tmp));
                                   switch (operator2) {
                                       case '+': num1 += num2; break;
                                       case '-': num1 -= num2; break;
                                       case '*': num1 *= num2; break;
                                       case '/': num1 /= num2; break;
                                       case '%': num1 %= num2; break;
                                       case '#': num1 = num2; break;
                                   }
                                   num2 = 0;
                            break;
                    }
                }
            }
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == sub) {
            if (operator == '#') {
                String tmp = textField.getText();
                if (!tmp.equals(""))
                    num1 = Double.parseDouble(tmp);
            }
            else {
                String tmp = textField.getText();
                if (!tmp.equals("")) {
                    switch (operator) {
                        case '+': num1 = num1 + Double.parseDouble(tmp);
                            break;
                        case '-': num1 = num1 - Double.parseDouble(tmp);
                            break;
                        case '*': num1 = num1 * Double.parseDouble(tmp);
                            break;
                        case '/': num1 = num1 / Double.parseDouble(tmp);
                            break;
                        case '%': num1 = num1 % Double.parseDouble(tmp);
                            break;
                        case '^' : num2 = Math.pow(num2, Double.parseDouble(tmp));
                                    switch (operator2) {
                                        case '+': num1 += num2; break;
                                        case '-': num1 -= num2; break;
                                        case '*': num1 *= num2; break;
                                        case '/': num1 /= num2; break;
                                        case '%': num1 %= num2; break;
                                        case '#': num1 = num2; break;
                                    }
                                    num2 = 0;
                            break;
                    }
                }
            }
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mul) {;
            if (operator == '#') {
                String tmp = textField.getText();
                if (!tmp.equals(""))
                    num1 = Double.parseDouble(tmp);
            }
            else {
                String tmp = textField.getText();
                if (!tmp.equals("")) {
                    switch (operator) {
                        case '+': num1 = num1 + Double.parseDouble(tmp);
                            break;
                        case '-': num1 = num1 - Double.parseDouble(tmp);
                            break;
                        case '*': num1 = num1 * Double.parseDouble(tmp);
                            break;
                        case '/': num1 = num1 / Double.parseDouble(tmp);
                            break;
                        case '%': num1 = num1 % Double.parseDouble(tmp);
                            break;
                        case '^' : num2 = Math.pow(num2, Double.parseDouble(tmp));
                                    switch (operator2) {
                                        case '+': num1 += num2; break;
                                        case '-': num1 -= num2; break;
                                        case '*': num1 *= num2; break;
                                        case '/': num1 /= num2; break;
                                        case '%': num1 %= num2; break;
                                        case '#': num1 = num2; break;
                                    }
                                    num2 = 0;
                            break;
                    }
                }
            }
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == div) {
            if (operator == '#') {
                String tmp = textField.getText();
                if (!tmp.equals(""))
                    num1 = Double.parseDouble(tmp);
            }
            else {
                String tmp = textField.getText();
                if (!tmp.equals("")) {
                    switch (operator) {
                        case '+': num1 = num1 + Double.parseDouble(tmp);
                            break;
                        case '-': num1 = num1 - Double.parseDouble(tmp);
                            break;
                        case '*': num1 = num1 * Double.parseDouble(tmp);
                            break;
                        case '/': num1 = num1 / Double.parseDouble(tmp);
                            break;
                        case '%': num1 = num1 % Double.parseDouble(tmp);
                            break;
                        case '^' : num2 = Math.pow(num2, Double.parseDouble(tmp));
                                    switch (operator2) {
                                        case '+': num1 += num2; break;
                                        case '-': num1 -= num2; break;
                                        case '*': num1 *= num2; break;
                                        case '/': num1 /= num2; break;
                                        case '%': num1 %= num2; break;
                                        case '#': num1 = num2; break;
                                    }
                                    num2 = 0;
                            break;
                    }
                }
            }
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == mod) {
            if (operator == '#') {
                String tmp = textField.getText();
                if (!tmp.equals(""))
                    num1 = Double.parseDouble(tmp);
            }
            else {
                String tmp = textField.getText();
                if (!tmp.equals("")) {
                    switch (operator) {
                        case '+': num1 = num1 + Double.parseDouble(tmp);
                            break;
                        case '-': num1 = num1 - Double.parseDouble(tmp);
                            break;
                        case '*': num1 = num1 * Double.parseDouble(tmp);
                            break;
                        case '/': num1 = num1 / Double.parseDouble(tmp);
                            break;
                        case '%': num1 = num1 % Double.parseDouble(tmp);
                            break;
                        case '^' : num2 = Math.pow(num2, Double.parseDouble(tmp));
                                    switch (operator2) {
                                        case '+': num1 += num2; break;
                                        case '-': num1 -= num2; break;
                                        case '*': num1 *= num2; break;
                                        case '/': num1 /= num2; break;
                                        case '%': num1 %= num2; break;
                                        case '#': num1 = num2; break;
                                    }
                                    num2 = 0;
                            break;
                    }
                }
            }
            operator = '%';
            textField.setText("");
        }
        if (e.getSource() == pow) {
            if (operator == '#') {
                String tmp = textField.getText();
                if (!tmp.equals(""))
                    num2 = Double.parseDouble(tmp);
            }
            else {
                String tmp = textField.getText();
                if (!tmp.equals("")) {
                   if (operator != '^') {
                       num2 = Double.parseDouble(tmp);
                       operator2 = operator;
                   }
                   else {
                       num2 = Math.pow(num2, Double.parseDouble(tmp));
                   }
                }
            }
            operator = '^';
            textField.setText("");
        }
        if (e.getSource() == equ) {
            switch (operator) {
                case '#': num1 = Double.parseDouble(textField.getText());
                    break;
                case '+': num1 = num1 + Double.parseDouble(textField.getText());
                    break;
                case '-': num1 = num1 - Double.parseDouble(textField.getText());
                    break;
                case '*': num1 = num1 * Double.parseDouble(textField.getText());
                    break;
                case '/': num1 = num1 / Double.parseDouble(textField.getText());
                    break;
                case '%': num1 = num1 % Double.parseDouble(textField.getText());
                    break;
                case '^' : num2 = Math.pow(num2, Double.parseDouble(textField.getText()));
                        switch (operator2) {
                            case '+': num1 += num2; break;
                            case '-': num1 -= num2; break;
                            case '*': num1 *= num2; break;
                            case '/': num1 /= num2; break;
                            case '%': num1 %= num2; break;
                            case '#': num1 = num2; break;
                        }
                        num2 = 0;
                    break;
            }
            if ((int) num1 == num1)
                textField.setText(String.format("%.0f", num1));
            else
                textField.setText(String.valueOf(num1));
            operator = '#';
            operator2 = '#';
//            num1 = result;
        }
        if (e.getSource() == clr) {
            textField.setText("0");
            num1 = 0;
            num2 = 0;
            operator = '#';
            operator2 = '#';
            flag = false;
        }
        if(e.getSource() == del) {
            String text = textField.getText();
            textField.setText("");
            for (int i = 0; i < text.length() - 1; ++ i) {
                textField.setText(textField.getText() + text.charAt(i));
            }
        }
    }
}
