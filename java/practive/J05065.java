import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class J05065 {
    static class staff {
        String name, pos, id, unit;
        staff (String s) {
            String[] res = s.split("\\s+");
            pos = res[0].substring(0, 2);
            unit = res[0].substring(2, 4);
            id = res[0].substring(4);
            name = "";
            for (int i = 1; i < res.length; ++ i)
                name += res[i] + " ";
            name = name.trim();
        }
        @Override 
        public String toString() {
            return name + " " + pos + " " + id + " " + unit;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        staff[] a = new staff[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = new staff(sc.nextLine());
        }
        int gd = 0, tp = 0, pp = 0;
        for (int i = 0; i < n; ++ i) {
            if (a[i].pos.equals("GD")) {
                gd ++;
                if (gd > 1) 
                    a[i].pos = "NV";
            }
            else if (a[i].pos.equals("TP")) {
                tp ++;
                if (tp > 3) 
                    a[i].pos = "NV";
            }
            else if (a[i].pos.equals("PP")) {
                pp ++;
                if (pp > 3) 
                    a[i].pos = "NV";
            }
        }
        Arrays.sort(a, new Comparator<staff>() {
            @Override 
            public int compare(staff x, staff y) {
                return x.unit.compareTo(y.unit) == 0 ? x.id.compareTo(y.id) : y.unit.compareTo(x.unit);
            }
        });
        int t = sc.nextInt();
        while (t -- > 0) {
            String s = sc.next();
            for (int i = 0; i < n; ++ i) {
                if (a[i].pos.equals(s)) 
                    System.out.println(a[i]);
            }
        }
    }
}

