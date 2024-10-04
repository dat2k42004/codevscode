import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class amination2d extends JFrame {


    mypanel_amination2d panel;
    amination2d() {
        panel = new mypanel_amination2d();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
