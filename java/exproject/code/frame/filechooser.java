import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;


public class filechooser extends JFrame implements ActionListener {

    // JFileChooser = A GUI mechanism that let  a user choose file (helpful for opening and saving file)

    JButton button;


    filechooser() {
        button = new JButton("Select File");

        button.addActionListener(this);
        this.setTitle("File Chooser");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fc = new JFileChooser();

            fc.setCurrentDirectory(new File(".")); // choose folder current
//            System.out.println(fc.showOpenDialog(null)); // 0 is open || 1 is cancel/ exit

//            int response = fc.showOpenDialog(null); // select file to open
            int response = fc.showSaveDialog(null);


            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fc.getSelectedFile().getAbsolutePath());
                System.out.println(file.getAbsolutePath()); // return path of file
            }
        }
    }
}
