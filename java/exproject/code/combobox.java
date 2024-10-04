import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class combobox extends JFrame implements ActionListener{

    // JComboBox = A component that combines a button or editable field and a drop-down list

    JComboBox combobox;
    combobox() {



        String[] car = {"vinfast", "bmw", "audi", "lexus"};

        combobox = new JComboBox(car);
        combobox.addActionListener(this);

//        combobox.setEditable(true);
        combobox.addItem("candila");
        combobox.insertItemAt("lambogini", 0);
        combobox.setSelectedIndex(0);
        combobox.removeItem("candila");
        combobox.removeItemAt(2);
//        combobox.removeAllItems();

        System.out.println(combobox.getItemCount());





        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(combobox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == combobox) {
            System.out.println(combobox.getSelectedItem());
        }
    }
}
