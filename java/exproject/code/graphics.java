import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class graphics extends JFrame{
    mypanel panel;
    graphics () {
        panel = new mypanel();
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

}
