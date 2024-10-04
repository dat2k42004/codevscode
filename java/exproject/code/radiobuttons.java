import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radiobuttons extends JFrame implements ActionListener {

    // JRadioButton = One or more buttons in a grouping in which only 1 may be selected per group

    JRadioButton pizza;
    JRadioButton hamburger;
    JRadioButton hotdog;
    ButtonGroup group;

    ImageIcon pizzaicon;
    ImageIcon hamburgericon;
    ImageIcon hotdogicon;

    radiobuttons() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaicon = new ImageIcon("D:\\code\\exproject\\pizza.png");
        hamburgericon = new ImageIcon("D:\\code\\exproject\\hamburger.png");
        hotdogicon = new ImageIcon("D:\\code\\exproject\\hotdog.png");

        pizza = new JRadioButton("Pizza");
        hamburger = new JRadioButton("Hamburger");
        hotdog = new JRadioButton("Hotdog");

        pizza.addActionListener(this);
        hamburger.addActionListener(this);
        hotdog.addActionListener(this);

        pizza.setIcon(pizzaicon);
        hamburger.setIcon(hamburgericon);
        hotdog.setIcon(hotdogicon);


        group = new ButtonGroup();// can chose one radiobutton
        group.add(pizza);
        group.add(hamburger);
        group.add(hotdog);
        
        this.add(pizza);
        this.add(hamburger);
        this.add(hotdog);

        this.pack();
        this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizza) {
            System.out.println("you ordered pizza");
        } else if (e.getSource() == hamburger) {
            System.out.println("you ordered hamburger");
        } else if (e.getSource() == hotdog) {
            System.out.println("you ordered hotdog");
        }
    }
}
