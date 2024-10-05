import java.util.ArrayList;
import java.util.Scanner;

public class J05076 {
    static class in_out {
        String id, name, type;

        in_out(String x, String y, String t) {
            id = x;
            name = y;
            type = t;
        }

        @Override
        public String toString() {
            return id + " " + name + " ";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<in_out> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(new in_out(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String[] x = sc.nextLine().split("\\s+");
            for (in_out y : a) {
                if (x[0].equals(y.id)) {
                    System.out.print(y);
                    System.out.print((Integer.parseInt(x[1]) * Integer.parseInt(x[2])) + " ");
                    int res = Integer.parseInt(x[2]) * Integer.parseInt(x[3]);

                    if (y.type.equals("A"))
                        res = res * 108 / 100;
                    else if (y.type.equals("B"))
                        res = res * 105 / 100;
                    else if (y.type.equals("C"))
                        res = res * 102 / 100;
                    System.out.println(res);
                }
            }
        }
    }
}