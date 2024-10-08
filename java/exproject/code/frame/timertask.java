
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class timertask {
    public static void main(String[] args) {
        /* timer = a facility threads to schedule tasks for future execution in a background thread

            timer task = a task that can be scheduled for one - time
                        or repeated execution by timer
         */

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 10;
            @Override
            public void run() {
                if (count > 0) {
                    System.out.println(count);
                    count -- ;
                }
                else {
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel();
                }
            }
        };
//        timer.schedule(task, 1); // set up time to run

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(calendar.MONTH, Calendar.OCTOBER);
        calendar.set(calendar.DAY_OF_MONTH, 5);
        calendar.set(calendar.HOUR_OF_DAY, 0);
        calendar.set(calendar.MINUTE, 0);
        calendar.set(calendar.SECOND, 0);
//        timer.schedule(task, calendar.getTime());

        timer.scheduleAtFixedRate(task, 0, 100);
    }
}
