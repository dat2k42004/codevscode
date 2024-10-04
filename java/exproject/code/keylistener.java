import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keylistener extends JFrame implements KeyListener{
    JLabel label;
    ImageIcon icon;
    keylistener() {

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
//        label.setBackground(Color.red);
//        label.setOpaque(true);

        icon = new ImageIcon("D:\\code\\exproject\\roket.png");
        label.setIcon(icon);
        label.setVerticalAlignment(SwingConstants.BOTTOM);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
        this.setTitle("KeyListener");


    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keyTyped = Invoked when a key is typed, use KeyChar and char output
        switch (e.getKeyChar()) {
            case 'a' : label.setLocation(label.getX() - 10, label.getY()); // left
                break;
            case 'd' : label.setLocation(label.getX() + 10, label.getY()); // right
                break;
            case 'w' : label.setLocation(label.getX(), label.getY() - 10); // down
                break;
            case 's' : label.setLocation(label.getX(), label.getY() + 10); // up
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keyPressed = Invoked when a physical key is pressed down, use KeyCode and int output
        switch (e.getKeyCode()) {
            case 37 : label.setLocation(label.getX() - 10, label.getY());
                break;
            case 39 : label.setLocation(label.getX() + 10, label.getY());
                break;
            case 38 : label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 40 : label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased = called whenever a button is released
//        System.out.println("You released the key : " + e.getKeyChar()); // show char
//        System.out.println("You released the key : " + e.getKeyCode()); // show code
    }
}
