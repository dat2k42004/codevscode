import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttons implements ActionListener {
    static JButton button;
    public static void main(String[] args) {
        // JButton = a button that performs an action when clicked on

        ImageIcon icon = new ImageIcon("D:\\code\\exproject\\icon.png");
        button = new JButton();

        button.setBounds(200, 100, 100, 50);
        button.addActionListener(e -> System.out.println("muốn chết ak mà sao nhấn"));
        button.setText("click here");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font("Arial", Font.PLAIN, 12));
        button.setForeground(Color.GREEN);
        button.setIconTextGap(5);
        button.setBackground(Color.YELLOW);
        button.setBorder(BorderFactory.createEtchedBorder());

        button.setEnabled(false);





        myframe frame = new myframe();
        frame.add(button);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("hey");
        }
    }
}
