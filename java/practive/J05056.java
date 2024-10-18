import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Comparator;
public class J05056 {
    static SortedMap<String, Integer> arr = new TreeMap<>();
    static class athlete {
        String id, name, time, extra, res;
        athlete(String x, String y, String s, String e, int i) {
            id = String.format("VDV%02d", i);
            name = x;
            int age = 2021 - Integer.parseInt(y.substring(6));
            int hour = Integer.parseInt(e.substring(0, 2)) - Integer.parseInt(s.substring(0, 2));
            int munite = Integer.parseInt(e.substring(3, 5)) - Integer.parseInt(s.substring(3, 5));
            int second = Integer.parseInt(e.substring(6)) - Integer.parseInt(s.substring(6));
            if (second < 0) {
                munite -- ;
                second += 60;
            }
            if (munite < 0) {
                hour -- ;
                munite += 60;
            }
            time = String.format("%02d:%02d:%02d", hour, munite, second);
            int tmp = 0;
            if (age >= 32) 
                tmp = 3;
            else if (age >= 25) 
                tmp = 2;
            else if (age >= 18)
                tmp = 1;
            else 
                tmp = 0;
            
            extra = String.format("00:00:%02d", tmp);
            second -= tmp;
            if (second < 0) {
                munite -- ;
                second += 60;
            }
            if (munite < 0) {
                hour -- ;
                munite += 60;
            }
            res = String.format("%02d:%02d:%02d", hour, munite, second);
            if (arr.containsKey(res)) 
                arr.put(res, arr.get(res) + 1);
            else 
                arr.put(res, 1);
        }
        @Override 
        public String toString() {
            return id + " " + name + " " + time + " " + extra + " " + res + " " + arr.get(res);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        athlete[] a = new athlete[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = new athlete(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), i + 1);
        }
        int cnt = 1;
        for (String x : arr.keySet()) {
            int tmp = arr.get(x);
            arr.put(x, cnt);
            cnt += tmp;
        }
        Arrays.sort(a, new Comparator<athlete> () {
            @Override 
            public int compare(athlete x, athlete y) {
                return x.res.compareTo(y.res);
            }
        });
        for (athlete athlete : a) {
            System.out.println(athlete);
        }
    }
}