import javax.swing.*;
import java.awt.*;

public class panel {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("D:\\code\\exproject\\icon.png");

        JLabel label = new JLabel(image);
        label.setText("hey bro");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100 , 50, 50);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 250, 250);
        redpanel.setLayout(new BorderLayout());


        redpanel.add(label);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250, 0, 250, 250);









        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("OOP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(redpanel);
        frame.add(bluepanel);
    }
}
