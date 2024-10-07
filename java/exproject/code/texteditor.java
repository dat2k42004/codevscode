
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class texteditor extends JFrame implements ActionListener {

    JTextArea textArea;
    JScrollPane scrollPane;
    JSpinner spinner;
    JLabel label;
    JButton button;
    JComboBox comboBox;

    JMenuBar menuBar;
    JMenu file;
    JMenuItem open;
    JMenuItem save;
    JMenuItem exit;
    texteditor () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Editor");
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        textArea = new JTextArea();
//        textArea.setPreferredSize(new Dimension(450, 450));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
//        textArea.setForeground(Color.GREEN);
//        textArea.setBackground(Color.WHITE);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(450, 450));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        spinner = new JSpinner();
        spinner.setPreferredSize(new Dimension(50, 25));
        spinner.setValue(20);
        spinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                textArea.setFont(new Font(textArea.getFont().getFamily(), Font.PLAIN, (Integer) spinner.getValue()));
            }
        });
        label = new JLabel();
        label.setText("Font : ");


        button = new JButton("Color");
        button.addActionListener(this);

        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        this.add(textArea);
        comboBox = new JComboBox(fonts);
        comboBox.addActionListener(this);
        comboBox.setSelectedItem("Arial");

        menuBar = new JMenuBar();
        file = new JMenu("File");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        file.add(open);
        file.add(save);
        file.add(exit);
        menuBar.add(file);


        this.setJMenuBar(menuBar);

        this.add(label);
        this.add(spinner);
        this.add(button);
        this.add(comboBox);
        this.add(scrollPane);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = colorChooser.showDialog(null, "Choose Color", Color.BLACK);
            textArea.setForeground(color);

        }

        if (e.getSource() == comboBox) {
            textArea.setFont(new Font((String) comboBox.getSelectedItem(), Font.PLAIN, textArea.getFont().getSize()));
        }

        if (e.getSource() == open) {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "txt");
            chooser.setFileFilter(filter);
            int response = chooser.showOpenDialog(null);


            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(chooser.getSelectedFile().getAbsolutePath());
                Scanner sc = null;

                try {
                    sc = new Scanner(file);
                    if(file.isFile()) {
                        while(sc.hasNextLine()) {
                            String line = sc.nextLine() + '\n';
                            textArea.append(line);

                        }
                    }
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } finally {
                    sc.close();
                }
            }

        }
        if(e.getSource() == save) {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));
            int response = chooser.showSaveDialog(null);

            if(response == JFileChooser.APPROVE_OPTION) {
                File file;
                PrintWriter fileout = null;

                file = new File(chooser.getSelectedFile().getAbsolutePath());
                try {
                    fileout = new PrintWriter(file);
                    fileout.println(textArea.getText());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } finally {
                    fileout.close();
                }
            }
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }
}
