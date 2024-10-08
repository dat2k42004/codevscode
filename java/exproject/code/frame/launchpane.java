import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class launchpane implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("new window");

    launchpane() {
        button.setBounds(150, 150, 200, 50);
        button.setFont(new Font("Arial", Font.PLAIN, 25));
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            frame.dispose();
            newwindow window = new newwindow();
        }
    }
}
