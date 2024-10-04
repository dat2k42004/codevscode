import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class mypanel_amination2d extends JPanel implements ActionListener {

    final int Panel_wedth = 200;
    final int Panel_height = 200;
    Image enemy;
    Image background;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 0;
    int x = 0, y = 0;
    mypanel_amination2d () {
        this.setPreferredSize(new Dimension(Panel_wedth, Panel_height));
        this.setBackground(Color.gray);
        enemy = new ImageIcon("D:\\code\\exproject\\alien.png").getImage();
        background = new ImageIcon("D:\\code\\exproject\\universe.jpg").getImage();
        timer = new Timer(1, this);
        timer.start();
    }
    public void paint(Graphics g) {
        super.paint(g); // paint background
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background,0, 0, null);
        g2d.drawImage(enemy, x, y, null);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= Panel_wedth - enemy.getWidth(null) && y == 0) {
            xVelocity = -2;
            yVelocity = 1;
        }
        else if (x < 0 && y < Panel_height - enemy.getHeight(null)) {
            xVelocity = 2;
            yVelocity = 1;
        }
        else if (x >= Panel_wedth - enemy.getHeight(null) && y >= Panel_height - enemy.getHeight(null)) {
            xVelocity = -2;
            yVelocity = 0;
        }
        else if (x < 0 && y >= Panel_height - enemy.getHeight(null))
        {
            xVelocity = 2;
            yVelocity = -1;
        }
        else if (x >= Panel_wedth - enemy.getHeight(null) && y != 0 && y < Panel_height) {
            xVelocity = -2;
            yVelocity = -1;
        }
//        else {
//            xVelocity = 2;
//            yVelocity =0;
//            x = 0;
//            y = 0;
//        }
        x += xVelocity;
        y += yVelocity;
        repaint();
    }
}
