package loginsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class loginpage implements ActionListener {
    HashMap<String, String> logininfo = new HashMap<>();
    JFrame frame = new JFrame();
    JButton loginbutton = new JButton("Login");
    JButton resetbutton = new JButton("Reset");
    JTextField useridfield = new JTextField();
    JPasswordField userpasswordfield = new JPasswordField();
    JLabel useridlabel = new JLabel("UserID:");
    JLabel userpasswordlabel = new JLabel("Password:");
    JLabel messagelabel = new JLabel();
    loginpage(HashMap<String, String> logininfoOrigin) {
        logininfo = logininfoOrigin;

        useridlabel.setBounds(50, 100, 75, 25);
        userpasswordlabel.setBounds(50, 150, 75, 25);


        messagelabel.setBounds(125, 250, 250, 35);
//        messagelabel.setText("TEST");
        messagelabel.setFont(new Font(null, Font.ITALIC, 25));

        useridfield.setBounds(125, 100, 200, 25);
        userpasswordfield.setBounds(125, 150, 200, 25);


        loginbutton.setBounds(125, 200, 100, 25);
        loginbutton.setFocusable(false);
        loginbutton.addActionListener(this);
        resetbutton.setBounds(225, 200, 100, 25);
        resetbutton.setFocusable(false);
        resetbutton.addActionListener(this);

        frame.add(useridlabel);
        frame.add(userpasswordlabel);
        frame.add(messagelabel);
        frame.add(useridfield);
        frame.add(userpasswordfield);
        frame.add(loginbutton);
        frame.add(resetbutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetbutton) {
            useridfield.setText("");
            userpasswordfield.setText("");
            messagelabel.setText("");
        }
        if (e.getSource() == loginbutton) {
            String userid = useridfield.getText();
            String userpassword = String.valueOf(userpasswordfield.getPassword());
            if (logininfo.containsKey(userid)) {
                if (logininfo.get(userid).equals(userpassword)) {
                    messagelabel.setText("Login Successful");
                    messagelabel.setForeground(Color.GREEN);
                    frame.dispose();
                    welcompage wel = new welcompage(userid);
                }
                else {
                    messagelabel.setText("Wrong Password");
                    messagelabel.setForeground(Color.RED);
                    userpasswordfield.setText("");
                }
            }
            else {
                messagelabel.setText("Username not found");
                messagelabel.setForeground(Color.RED);
                useridfield.setText("");
                userpasswordfield.setText("");
            }
        }
    }
}
