import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class myframe extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    myframe () {

        ImageIcon icon = new ImageIcon("D:\\code\\exproject\\icon.png");
        ImageIcon icon1 = new ImageIcon("D:\\code\\exproject\\icon1.png");
        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(150, 250, 150, 250);
        label.setVisible(false);
        button = new JButton();

        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
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

//        button.setEnabled(false);
//        JFrame frame = new JFrame(); // create a frame
        ImageIcon image = new ImageIcon("D:\\code\\exproject\\dat_logo.png");
        this.setSize(500, 500); //set size of frame
        this.setVisible(true); // make this visible
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setTitle("DAT_OOP_JAVA"); // set title of frame
        this.getContentPane().setBackground(Color.WHITE); // set color of background for frame
        this.setIconImage(image.getImage()); // set icon for title frame
//        this.setResizable(false); // make frame not resize
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("you die");
//        button.setEnabled(false);
        label.setVisible(true);
    }
}
