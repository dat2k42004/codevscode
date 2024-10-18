import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J06004 {
    static class team_work {
        String id, name, phone;
        int group;
        team_work(String x, String y, String z, int t) {
            id = x;
            name = y;
            phone = z;
            group = t;
        }
        @Override
        public String toString() {
            return id + " " + name + " " + phone + " " + group;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        team_work[] a = new team_work[n];
        for (int i = 0; i < n; ++ i) {
            sc.nextLine();
            a[i] = new team_work(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        sc.nextLine();
        String[] b = new String[m];
        for (int i = 0; i < m; ++ i) {
            b[i] = sc.nextLine();
        }
        Arrays.sort(a, new Comparator<team_work>() {
            @Override 
            public int compare (team_work x, team_work y) {
                return x.id.compareTo(y.id);
            }
        });
        for(int i = 0; i < n; ++ i) {
            System.out.print(a[i]);
            System.out.println(" " + b[a[i].group - 1]);
        }
    }
}
