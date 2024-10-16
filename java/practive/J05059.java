import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class J05059 {
    static class pass_hire{
        String id, name, status;
        double extra, score;
        pass_hire(String x, String y, double a, double b, double c) {
            id = x;
            name = y;
            switch (x.charAt(2)) {
                case '1' :
                    extra = 0.5;
                    break;
                case '2' :
                    extra = 1.0;
                    break;
                case '3' :
                    extra = 2.5;
                    break;
            }
            score = a * 2.0 + b + c + extra;
        }
        @Override 
        public String toString() {
            return id + " " + name + " " + ((int) extra == extra ? (int) extra : String.format("%.1f", extra)) + " " + ((int) score == score ? (int) score : String.format("%.1f", score)) + " " + status;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pass_hire[] a = new pass_hire[n];
        sc.nextLine();
        for (int i = 0; i < n; ++ i) {
            a[i] = new pass_hire(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<pass_hire> () {
            @Override 
            public int compare(pass_hire x, pass_hire y) {
                return x.score == y.score ? x.id.compareTo(y.id) : (x.score > y.score ? -1 : 1);
            }
        });
        int t = sc.nextInt();
        double res = a[t - 1].score;
        System.out.println(res);
        for (pass_hire pass_hire : a) {
            if (pass_hire.score >= res) 
                pass_hire.status = "TRUNG TUYEN";
            else 
                pass_hire.status = "TRUOT";
            System.out.println(pass_hire);
        }
    }
}


