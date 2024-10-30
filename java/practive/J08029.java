import java.util.*;

public class J08029{
    static class pair {
        String x;
        int cnt;
        pair(String x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
        int[] y = new int[]{2, 1, -1, -2, -2, -1, 1, 2};

        int t = sc.nextInt();
        while (t -- > 0) {
            String s = sc.next();
            String e = sc.next();
            if (s.equals(e)) {
                System.out.println(0);
                continue;
            }
            Queue<pair> q = new LinkedList<>();
            Set<String> set = new HashSet<>();
            set.add(s);
            q.add(new pair(s, 0));
            while (!q.isEmpty()) {
                pair p = q.poll();
                if (p.x.equals(e)) {
                    System.out.println(p.cnt);
                    break;
                }
                for (int i = 0; i < 8; ++ i) {
                    String tmp = p.x;
                    char a = (char) (tmp.charAt(0) - 'a' + x[i] + 97);
                    char b = (char) (tmp.charAt(1) - '0' + y[i] + 48);
                    if (a >= 'a' && a <= 'h' && b >= '1' && b <= '8') {
                        q.add((new pair("" + a + b, p.cnt + 1)));
                    }
                }
            }

        }
    }
}