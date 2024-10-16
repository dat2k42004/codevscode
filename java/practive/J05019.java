import java.util.ArrayList;
import java.util.Scanner;

public class J05019 {
    static class rain{
        String id, address;
        double avg;
        int time, traffic;

        rain(String x, String s, String e, int a, int t) {
            id = String.format("T%02d", t);
            address = x;
            int hour = Integer.parseInt(e.substring(0, 2)) - Integer.parseInt(s.substring(0, 2));
            int munite = Integer.parseInt(e.substring(3)) - Integer.parseInt(s.substring(3));
            if (munite < 0) {
                hour -- ;
                munite += 60;
            }
            time = hour * 60 + munite;
            traffic = a;
        }

        @Override 
        public String toString() {
            return id + " " + address + " " + String.format("%.2f", avg);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int n = sc.nextInt();
        ArrayList<rain> a = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; ++ i) {
            sc.nextLine();
            String x = sc.nextLine();
            String s = sc.nextLine();
            String e = sc.nextLine();
            int y = sc.nextInt();
            if (res.contains(x)) {
                int idx = res.indexOf(x);
                a.get(idx).traffic += y;
                int hour = Integer.parseInt(e.substring(0, 2)) - Integer.parseInt(s.substring(0, 2));
                int munite = Integer.parseInt(e.substring(3)) - Integer.parseInt(s.substring(3));
                if (munite < 0) {
                    hour -- ;
                    munite += 60;
                }
                a.get(idx).time += hour * 60 + munite;
            }
            else {
                res.add(x);
                t ++ ;
                a.add(new rain(x, s, e, y, t));
            }
        }
        for (rain x : a) {
            x.avg = Math.round((double) x.traffic * 60.0 * 100.0 / x.time) / 100.0;
            System.out.println(x);
        }
    }
}

