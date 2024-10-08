import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkbox extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkbox1;
    ImageIcon xIcon;
    ImageIcon checkIcon;
    checkbox(){
        this.setTitle("Checkbox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("D:\\code\\exproject\\x.png");
        checkIcon = new ImageIcon("D:\\code\\exproject\\tick.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkbox1 = new JCheckBox();
        checkbox1.setText("Are you man");
        checkbox1.setFocusable(false);
        checkbox1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        checkbox1.setIcon(xIcon);
        checkbox1.setSelectedIcon(checkIcon);
//        checkbox1.setHorizontalTextPosition(JCheckBox.RIGHT);
//        checkbox1.setVerticalTextPosition(JCheckBox.CENTER);

        this.add(button);
        this.add(checkbox1);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            button.setEnabled(false);
            System.out.println(checkbox1.isSelected());
        }
    }
}
