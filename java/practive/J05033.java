import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;
public class J05033 {

    public static class time
    {
        int hour, munite, second, res_time;

        public void set(Scanner sc)
        {
            hour = sc.nextInt();
            munite = sc.nextInt();
            second = sc.nextInt();
            res_time = hour * 3600 + munite * 60 + second;
        }


        public void get()
        {
            System.out.println(hour + " " + munite + " " + second);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Vector<time> v = new Vector<time>();

        for (int i = 0; i < n; ++ i)
        {
            time a = new time();
            a.set(sc);
            v.add(a);
        }

        Collections.sort(v, new Comparator<time>() {
            @Override
            public int compare(time a, time b)
            {
                if (a.res_time > b.res_time)
                    return 1;
                return -1;
            }
        });

        for (time x : v)
            x.get();
    }
}
