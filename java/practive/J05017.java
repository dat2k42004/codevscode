import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class J05017 {
    static class bill_water {
        String name, id;
        int fee;
        
        bill_water(int i, String x, int Old, int New) {
            id = String.format("KH%02d", i);
            name = x;
            int num = New - Old;
            if (num > 100) {
                fee = (num - 100) * 200 + 50 * 150 + 50 * 100;
                fee = (int) Math.round(fee * 105.0 / 100);
            }
            else if (num > 50) {
                fee = (num - 50) * 150 + 50 * 100;
                fee = (int) Math.round(fee * 103.0 / 100);
            }
            else {
                fee = num * 100;
                fee = (int) Math.round(fee * 102.0 / 100);
            }
        }
        @Override public String toString() {
            return id + " " + name + " " + fee;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        bill_water[] a = new bill_water[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = new bill_water(i + 1, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<bill_water>() {
            @Override 
            public int compare(bill_water x, bill_water y) {
                return y.fee - x.fee;
            }
        });
        for (bill_water bill_water : a) {
            System.out.println(bill_water);
        }
    }
}
