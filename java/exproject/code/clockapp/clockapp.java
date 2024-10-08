
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class clockapp extends JFrame {

    Calendar calender;
    SimpleDateFormat timeformat;
    SimpleDateFormat dayformat;
    SimpleDateFormat dateformat;
    JLabel timelabel;
    JLabel daylabel;
    JLabel datelabel;
    String time;
    String day;
    String date;
    clockapp() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock app");
        this.setSize(350, 200);

        timeformat = new SimpleDateFormat("HH:mm:ss a");
        dayformat = new SimpleDateFormat("EEEE");
        dateformat = new SimpleDateFormat("MMMMM dd, yyyy");
        timelabel = new JLabel();
        time = timeformat.format(Calendar.getInstance().getTime()); // get current time

//        timelabel.setText(time);
        timelabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        timelabel.setForeground(Color.GREEN);
        timelabel.setBackground(Color.BLACK);
        timelabel.setOpaque(true);

        daylabel = new JLabel();
        daylabel.setFont(new Font("Ink Free", Font.PLAIN, 20));

        datelabel = new JLabel();
        datelabel.setFont(new Font("Ink Free", Font.PLAIN, 20));

        this.add(timelabel);
        this.add(daylabel);
        this.add(datelabel);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        setTime();
    }


    public void setTime() {
        while (true) {
            time = timeformat.format(Calendar.getInstance().getTime());
            timelabel.setText(time);

            day = dayformat.format(Calendar.getInstance().getTime());
            daylabel.setText(day);

            date = dateformat.format(Calendar.getInstance().getTime());
            datelabel.setText(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
