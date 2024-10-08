import javax.swing.*;
import java.awt.*;

public class frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // create a frame
        ImageIcon image = new ImageIcon("D:\\code\\exproject\\dat_logo.png");
        frame.setSize(500, 500); //set size of frame
        frame.setVisible(true); // make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setTitle("DAT_OOP_JAVA"); // set title of frame
        frame.getContentPane().setBackground(Color.BLACK); // set color of background for frame
        frame.setIconImage(image.getImage()); // set icon for title frame
        frame.setResizable(false); // make frame not resize

    }
}
