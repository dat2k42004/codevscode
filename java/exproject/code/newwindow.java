import javax.swing.*;
import java.awt.*;

public class newwindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    newwindow() {
        label.setText("Hello bro");
        label.setBounds(0, 0 , 200, 50);
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

//        frame.setSize(500, 500);
//        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);

    }
}
