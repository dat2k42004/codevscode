import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J05014 {
    static class hire_teacher {
        String id, name, subject, status;
        double score;

        hire_teacher (int i, String x, String y, double a, double b) {
            id = String.format("GV%02d", i);
            name = x;
            switch (y.charAt(0)) {
                case 'A':
                    subject = "TOAN";
                    break;
                case 'B' :
                    subject = "LY";
                    break;
                case 'C' :
                    subject = "HOA";
                    break;
                default:
                    throw new AssertionError();
            }
            score = a * 2 + b;
            switch (y.charAt(1)) {
                case '1':
                    score += 2.0;
                    break;
                case '2' :
                    score += 1.5;
                    break;
                case '3' :
                    score += 1.0;
                    break;
                case '4' :
                    score += 0.0;
                    break;
                default:
                    throw new AssertionError();
            }
            if (score >= 18.0) {
                status = "TRUNG TUYEN";
            }
            else {
                status = "LOAI";
            }
        }
        @Override 
        public String toString() {
            return id + " " + name + " " + subject + " " + String.format("%.1f", score) + " " + status;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hire_teacher[] a = new hire_teacher[n];
        sc.nextLine();
        for (int i = 0; i < n; ++ i) {
            a[i] = new hire_teacher(i + 1, sc.nextLine(), sc.nextLine(),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<hire_teacher>() {
           @Override
           public int compare(hire_teacher x, hire_teacher y) {
                return x.score > y.score ? -1 : 1;
           } 
        });
        for (hire_teacher x : a) {
            System.out.println(x);
        }
    }
}

