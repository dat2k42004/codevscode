import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class textfield extends JFrame  implements ActionListener {

    JButton b;
    JTextField tf;

    // JTextField = A GUI textbox component that can be used to add, set, or get text
    textfield() {

        tf = new JTextField();
        tf.setPreferredSize(new Dimension(250, 40));
        tf.setBackground(Color.black);
        tf.setFont(new Font("Arial", Font.PLAIN, 20));
        tf.setForeground(Color.green);
        tf.setCaretColor(Color.white);
        tf.setText("co cai con cak");
        tf.setEditable(false);

        b = new JButton("submit");
        b.addActionListener(this);

        this.setTitle("textfield");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(b);
        this.add(tf);
        this.pack();
        this.setVisible(true);





    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b) {
            System.out.println("hey " + tf.getText());
            b.setEnabled(false);
            tf.setEditable(false);
        }
    }
}
