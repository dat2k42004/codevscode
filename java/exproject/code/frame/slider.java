import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;



public class slider implements ChangeListener{

    // JSlider = GUI components that lets user enter a value by using
    //           an adjustable sliding knob on a track

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;


    slider () {
        frame = new JFrame("slider");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));

        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this);


        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }



    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());
    }
}
