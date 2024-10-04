import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class J05011 {
    static class  time implements Comparable<time> {
        String id, name, play_time;
        int res;
        void in(Scanner sc)
        {
            id = sc.nextLine();
            name = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();
            int h = Integer.parseInt(end.substring(0, 2)) - Integer.parseInt(start.substring(0, 2));
            int m = Integer.parseInt(end.substring(3)) - Integer.parseInt(start.substring(3));
            if ( m < 0 )
            {
                h --;
                m += 60;
            }
            play_time = String.format("%d gio %d phut", h, m);
            res = h * 60 + m;
        }
        @Override
        public int compareTo(time a)
        {
            return -(res - a.res);
        }
        void out()
        {
            System.out.printf("%s %s %s\n", id, name, play_time);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<time> a = new ArrayList<>();

        for (int i = 0; i < n; ++ i)
        {
            time x = new time();
            x.in(sc);
            a.add(x);
        }
        Collections.sort(a);
        for (time x : a)
            x.out();
    }
}


