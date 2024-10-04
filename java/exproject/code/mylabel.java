import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class mylabel extends JLabel {
    mylabel() {
        ImageIcon image = new ImageIcon("D:\\code\\exproject\\icon.png");
        Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
        this.setText("Hey bro, nice to meet you"); // set text for label
        this.setIcon(image); // set icon for label
        this.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of imageicon
        this.setVerticalTextPosition(JLabel.TOP); // set text top center bottom of imageicon

        this.setIconTextGap(0); // set gap of text to image

        this.setForeground(Color.GREEN); // set color of text

        this.setFont(new Font("Arial", Font.PLAIN, 20)); // set font of text
        this.setBorder(border);

        this.setBackground(Color.YELLOW); // set background of label
        this.setOpaque(true); // display background
        this.setVerticalAlignment(JLabel.CENTER); // set vertical position of text and icon within label
        this.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of text and icon within label
//        this.setBounds(0, 0, 250, 250); // set x, y position within frame as well as dimensions
    }
}
