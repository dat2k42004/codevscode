import java.awt.*;
import javax.swing.*;



public class progressbar {
    // progress bar = visual aid to let user know an operation is progressing

    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar(0, 500);


    progressbar () {


        progressBar.setValue(0);
        progressBar.setBounds(0, 0, 420, 50);
        progressBar.setStringPainted(true);

        progressBar.setFont(new Font("Arial", Font.PLAIN, 20));
        progressBar.setForeground(Color.red);
        progressBar.setBackground(Color.black);







        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);


        fill();

    }
    public void fill() {
        int cnt = 500;

        while (cnt > 0) {
            progressBar.setValue(cnt);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
            cnt -= 1;
        }
        progressBar.setString("done!");
    }
}
