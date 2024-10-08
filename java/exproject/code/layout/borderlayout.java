import javax.swing.*;
import java.awt.*;

public class borderlayout {


    // Layout Manager = Defines the natural layout for components within a container

    // 3 common managers

    // BorderLayout = 	A BorderLayout places components in five areas: NORTH,SOUTH,WEST,EAST,CENTER.
    //					All extra space is placed in the center area.

    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("borderlayout");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
        JPanel p9 = new JPanel();
        JPanel p10 = new JPanel();


        p1.setBackground(Color.RED);
        p2.setBackground(Color.BLUE);
        p3.setBackground(Color.YELLOW);
        p4.setBackground(Color.GREEN);
        p5.setBackground(Color.GRAY);
        p6.setBackground(Color.BLACK);
        p7.setBackground(Color.LIGHT_GRAY);
        p8.setBackground(Color.CYAN);
        p9.setBackground(Color.MAGENTA);
        p10.setBackground(Color.PINK);

        p1.setPreferredSize(new Dimension(100, 100));
        p2.setPreferredSize(new Dimension(100, 100));
        p3.setPreferredSize(new Dimension(100, 100));
        p4.setPreferredSize(new Dimension(100, 100));
        p5.setPreferredSize(new Dimension(100, 100));
        p6.setPreferredSize(new Dimension(50, 50));
        p7.setPreferredSize(new Dimension(50, 50));
        p8.setPreferredSize(new Dimension(50, 50));
        p9.setPreferredSize(new Dimension(50, 50));
        p10.setPreferredSize(new Dimension(50, 50));

        p2.setLayout(new BorderLayout(5, 5));
        p2.add(p6, BorderLayout.NORTH);
        p2.add(p7, BorderLayout.SOUTH);
        p2.add(p8, BorderLayout.WEST);
        p2.add(p9, BorderLayout.EAST);
        p2.add(p10, BorderLayout.CENTER);

        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.CENTER);
        frame.add(p3, BorderLayout.SOUTH);
        frame.add(p4, BorderLayout.EAST);
        frame.add(p5, BorderLayout.WEST);




    }
}
