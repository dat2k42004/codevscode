import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class J08026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Queue<int[]> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        while (t -- > 0) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            if (s >= e) {
                System.out.println(s - e);
                continue;
            }
            q.clear();
            set.clear();
            q.add(new int[]{s, 0});
            set.add(s);
            while (!q.isEmpty()) {
                int[] p = q.poll();
                int x = p[0];
                int y = p[1];
                if (x == e) {
                    System.out.println(y);
                    break;
                }
                if (x < e && !set.contains(x * 2)) {
                    set.add(x * 2);
                    q.add(new int[]{x * 2, y + 1});
                }
                if (x > 0 && !set.contains(x - 1)) {
                    set.add(x - 1);
                    q.add(new int[]{x - 1, y + 1});
                }
            }
        }
    }
}