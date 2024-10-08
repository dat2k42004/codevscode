import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class menubar extends JFrame implements ActionListener{

    JMenuBar menubar;
    JMenu file;
    JMenu edit;
    JMenu help;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;
    menubar () {


        ImageIcon i1 = new ImageIcon("D:\\code\\exproject\\load.png");
        ImageIcon i2 = new ImageIcon("D:\\code\\exproject\\save.png");
        ImageIcon i3 = new ImageIcon("D:\\code\\exproject\\exit.png");


        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        file.setMnemonic(KeyEvent.VK_F);// Alt + f for file
        edit.setMnemonic(KeyEvent.VK_E);// Alt + e for edit
        help.setMnemonic(KeyEvent.VK_H);// Alt + h for help

        load = new JMenuItem("Load");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        load.setMnemonic(KeyEvent.VK_L);// l for load
        save.setMnemonic(KeyEvent.VK_S);// s for save
        exit.setMnemonic(KeyEvent.VK_E);// e for edit

        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        load.setIcon(i1);
        save.setIcon(i2);
        exit.setIcon(i3);
        

        file.add(load);
        file.add(save);
        file.add(exit);

        menubar = new JMenuBar();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());



        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);



        this.setJMenuBar(menubar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == load){
            System.out.println("you loaded file");
        }
        if (e.getSource() == save){
            System.out.println("you saved file");
        }
        if (e.getSource() == exit){
            System.exit(0);
        }
    }
}
