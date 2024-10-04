import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class label {
    public static void main(String[] args) {
        JLabel label = new JLabel(); //create a label
        ImageIcon image = new ImageIcon("D:\\code\\exproject\\icon.png");
        Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
        label.setText("Hey bro, nice to meet you"); // set text for label
        label.setIcon(image); // set icon for label
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text top center bottom of imageicon

        label.setIconTextGap(0); // set gap of text to image

        label.setForeground(Color.GREEN); // set color of text

        label.setFont(new Font("Arial", Font.PLAIN, 20)); // set font of text
        label.setBorder(border);

        label.setBackground(Color.YELLOW); // set background of label
        label.setOpaque(true); // display background
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of text and icon within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of text and icon within label
//        label.setBounds(0, 0, 250, 250); // set x, y position within frame as well as dimensions

        JFrame frame = new JFrame();
//        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setTitle("OOP_JAVA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
        frame.add(label);
        frame.pack();
    }
}
