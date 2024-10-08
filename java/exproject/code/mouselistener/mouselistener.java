import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mouselistener extends JFrame implements MouseListener {


    JLabel label;
    ImageIcon laughter;
    ImageIcon wow;
    ImageIcon sad;
    ImageIcon angry;
    mouselistener(){
        laughter = new ImageIcon("D:\\code\\exproject\\laughter.png");
        wow = new ImageIcon("D:\\code\\exproject\\wow.png");
        sad = new ImageIcon("D:\\code\\exproject\\sad.png");
        angry = new ImageIcon("D:\\code\\exproject\\angry.png");

        label = new JLabel();
//        label.setBounds(0, 0 , 100, 100);
//        label.setBackground(Color.RED);
//        label.setOpaque(true);
        label.setIcon(wow);
        label.addMouseListener(this);
//        this.addMouseListener(this);
        this.setTitle("mouselistener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        this.add(label);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // invoked when the mouse button has been clicked (pressed and released) on component
//        System.out.println("you clicked mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // invoked when the mouse button has been pressed on component
//        System.out.println("you pressed mouse");
//        label.setBackground(Color.YELLOW);
        label.setIcon(laughter);
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        // invoked when the mouse button has been released on component
//        System.out.println("you released mouse");
//        label.setBackground(Color.GREEN);
        label.setIcon(sad);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // invoked when mouse enters component
//        System.out.println("you entered component"); // needn't click
//        label.setBackground(Color.BLUE);
        label.setIcon(wow);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // invoked when mouse exits component
//        System.out.println("you exited component"); // needn't click
//        label.setBackground(Color.RED);
        label.setIcon(angry);
    }
}
