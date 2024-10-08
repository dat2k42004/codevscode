import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorchooser extends JFrame implements ActionListener {


    // JColorChooser = A GUI mechanism that let user choose color
    JButton button;
    JLabel label;
    colorchooser () {


        button = new JButton("Pick a Color");
        button.addActionListener(this);


        label = new JLabel();
        label.setText("Hey bro, Nice to meet you :))");
        label.setBackground(Color.white);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setOpaque(true);


        this.setTitle("Color Chooser");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
//            colorChooser.setLocation(200, 200);
            Color color = colorChooser.showDialog(this, "Choose a Color", Color.black);
            label.setForeground(color);
//            label.setBackground(color);

        }
    }
}
