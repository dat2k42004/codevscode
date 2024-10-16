import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
public class J05015 {
    static class ride {
        String id = "", name, city;
        int speed, time;  

        ride (String x, String y, String z) {
            name = x;
            city = y;
            String res = y + " " + x;
            for (String i : res.split("\\s+"))
                id += i.substring(0, 1);
            time = (Integer.parseInt(z.substring(0, z.indexOf(':'))) - 6) * 60 + Integer.parseInt(z.substring(z.indexOf(':') + 1));
            speed = (int) Math.round((double) 120 * 60 / time);
        }
        @Override 
        public String toString () {
            return id + " " + name + " " + city + " " + speed + " Km/h"; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ride[] a = new ride[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = new ride(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }

        Arrays.sort(a, new Comparator<ride>() {
            @Override
            public int compare(ride x, ride y) {
                return x.time - y.time;
            }
        });
        for (ride ride : a) {
            System.out.println(ride);
        }
    }
}
