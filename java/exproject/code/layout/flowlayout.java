import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class flowlayout {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components within a container

        // FlowLayout = 	places components in a row, sized at their preferred size.
        //					If the horizontal space in the container is too small,
        //					the FlowLayout class uses the next available row.
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        JButton button = new JButton("nhấn đây nè");
        button.addActionListener(e -> System.out.println("nhấn cái con cak"));
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);

    }
}
