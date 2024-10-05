import java.util.ArrayList;
import java.util.Scanner;

public class J05075 {

    static int solve(String s) {
        String[] res = s.split("\\s+");
        int x = 10;
        for (int i = 0; i < res[1].length(); ++i) {
            if (res[1].charAt(i) == 'm')
                x--;
            else if (res[1].charAt(i) == 'v')
                x -= 2;
            if (x <= 0) {
                return -1;
            }
        }
        return x;
    }

    static class manager {
        String id, name, clas;

        manager(String x, String y, String z) {
            id = x;
            name = y;
            clas = z;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + clas + " ";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<manager> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            a.add(new manager(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        String[] res = new String[n];

        for (int i = 0; i < n; ++i) {
            res[i] = sc.nextLine();
        }
        String s = sc.nextLine();
        for (manager x : a) {
            if (x.clas.equals(s)) {
                System.out.print(x);
                for (int j = 0; j < n; ++j) {
                    if (res[j].startsWith(x.id)) {
                        if (solve(res[j]) == -1)
                            System.out.println("0 KDDK");
                        else
                            System.out.println(solve(res[j]));
                    }
                }
            }
        }

    }
}


