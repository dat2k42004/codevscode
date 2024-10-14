
import java.util.Arrays;
import java.util.Scanner;

public class J05082 {

    static String solve(String s) {
        String[] res = s.trim().toLowerCase().split("\\s+");
        s = "";
        for (String x : res) {
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        }
        return s.trim();
    }
    static String date (String s) {
        if (s.charAt(1) == '/' )
            s = "0" + s;
        if (s.charAt(4) == '/')
            s = s.substring(0, 3) + "0" + s.substring(3);
        return s;
    }
    public static class guess implements Comparable<guess>{
        
        String id, name, gender, birthday, address;

        guess (int i, String x, String y, String z, String t) {
            id = String.format("KH%03d", i);
            name = solve(x);
            gender = y;
            birthday = date(z);
            address = t;
        }

        @Override
        public int compareTo(J05082.guess o) {
            String x1 = birthday.substring(6) + birthday.substring(3, 5) + birthday.substring(0, 2);
            String x2 = o.birthday.substring(6) + o.birthday.substring(3, 5) + o.birthday.substring(0, 2);
            return x1.compareTo(x2);
        }

        @Override 
        public String toString () {
            return id + " " + name + " " + gender + " " + address + " " + birthday;
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        guess[] a = new guess[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = new guess(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);

        for (guess x : a) 
            System.out.println(x);
    } 
}


