import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mypanel extends JPanel {


    Image image;
    mypanel() {
        image = new ImageIcon("D:\\code\\exproject\\16.jpg").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5)); // create bold
        g2d.setPaint(Color.red); // set color for
//        g2d.drawLine(0, 0, 500, 500); // draw line
//        g2d.drawRect(0, 0, 100, 100); // draw rect
//        g2d.setPaint(Color.blue);
//        g2d.fillRect(0,0, 100, 200); // fill rect using color
        g2d.setPaint(Color.green);
//        g2d.drawOval(0,0, 100, 100); // draw oval
//        g2d.fillOval(0,0, 100, 100);

//        g2d.drawArc(0, 0, 100, 100, 0, 360); // draw arc
//        g2d.fillArc(0, 0, 100, 100, 0, 180);
//        int[] xpoint = {150, 250, 350};
//        int[] ypoint = {100, 200, 100};
//        g2d.fillPolygon(xpoint, ypoint, 3);
//        g2d.drawPolygon(xpoint, ypoint, 3);

//        g2d.setFont(new Font("MV Boli", Font.PLAIN, 20));
//        g2d.drawString("Hey bro, nice to meet you!", 50, 50);
        g2d.drawImage(image, 0, 0, null);
//        g2d.
    }

}
