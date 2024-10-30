import java.util.*;

public class J08025 {
    static class pair {
        String x;
        int cnt;
        pair (String x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws StringIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0) {
            int[] a = new int[6];
            String s = "", e = "";
            for (int i = 0; i < 6; ++ i) {
                a[i] = sc.nextInt();
                s += String.valueOf(a[i]);
            }
            for (int i = 0; i < 6; ++ i) {
                a[i] = sc.nextInt();
                e += String.valueOf(a[i]);
            }
            if (s.equals(e)) {
                System.out.println(0);
                continue;
            }
            Queue<pair> q = new LinkedList<>();
            Set<String> set  = new HashSet<>();
            q.add(new pair(s, 0));
            set.add(s);
            while (!q.isEmpty()) {
                pair p = q.poll();
                if (p.x.equals(e)) {
                    System.out.println(p.cnt);
                    break;
                }

                char[] x = p.x.toCharArray();
                char tmp = x[0];
                x[0] = x[3];
                x[3] = x[4];
                x[4] = x[1];
                x[1] = tmp;
                String res = String.valueOf(x);
                if (!set.contains(res)) {
                    set.add(res);
                    q.add(new pair(res, p.cnt + 1));
                }

                char[] y = p.x.toCharArray();
                tmp = y[1];
                y[1] = y[4];
                y[4] = y[5];
                y[5] = y[2];
                y[2] = tmp;
                String res2 = String.valueOf(y);
                if (!set.contains(res2)) {
                    set.add(res2);
                    q.add(new pair(res2, p.cnt + 1));
                }
            }
        }
    }
}