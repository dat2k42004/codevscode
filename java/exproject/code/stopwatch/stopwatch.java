
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stopwatch implements ActionListener {


    JFrame frame = new JFrame();
    JButton startbutton = new JButton("Start");
    JButton resetbutton = new JButton("Reset");
    JLabel timeLabel = new JLabel();
    int elapsedTime  = 0;
    int seconds = 0;
    int munites = 0;
    int hours = 0;
    boolean started = false;
    String seconds_string = String.format("%02d", seconds);
    String munites_string = String.format("%02d", munites);
    String hours_string = String.format("%02d", hours);

    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime += 1000;
            hours = (elapsedTime / 3600000);
            munites = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            seconds_string = String.format("%02d", seconds);
            munites_string = String.format("%02d", munites);
            hours_string = String.format("%02d", hours);
            timeLabel.setText(hours_string + ":" + munites_string + ":" + seconds_string);

        }
    });

    stopwatch() {

        timeLabel.setText(hours_string + ":" + munites_string + ":" + seconds_string);
        timeLabel.setBounds(100, 100, 200, 50);
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startbutton.setBounds(100, 150, 100, 50);
        startbutton.setFont(new Font("Ink Free", Font.PLAIN, 20));
        startbutton.setFocusable(false);
        startbutton.addActionListener(this);


        resetbutton.setBounds(200, 150, 100, 50);
        resetbutton.setFont(new Font("Ink Free", Font.PLAIN, 20));
        resetbutton.setFocusable(false);
        resetbutton.addActionListener(this);

        frame.add(timeLabel);
        frame.add(startbutton);
        frame.add(resetbutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startbutton) {
            if(started == false) {
                started = true;
                startbutton.setText("Stop");
                start();
            }
            else {
                started = false;
                startbutton.setText("Continue");
                stop();
            }
        }
        else if (e.getSource() == resetbutton) {
            started = false;
            startbutton.setText("Start");
            reset();
        }
    }


    void start() {
        timer.restart();
    }
    void stop() {
        timer.stop();
    }
    void reset() {
        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        munites = 0;
        hours = 0;
        seconds_string = String.format("%02d", seconds);
        munites_string = String.format("%02d", munites);
        hours_string = String.format("%02d", hours);
        timeLabel.setText(hours_string + ":" + munites_string + ":" + seconds_string);
    }
}
