import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class J05016 {
    static long calcu_date(String x, String y) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse(x);
        Date d2 = sdf.parse(y);
        return ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24)) % 365 + 1;
    }
    static class bill implements Comparable<bill>{
        String name, room, id;
        long date, fee;

        bill (int i, String x, String y, String s, String e, String ex) throws ParseException{
            id = String.format("KH%02d", i);
            name = x;
            room = y;
            date = calcu_date(s, e);
            switch (y.charAt(0)) {
                case '1':
                    fee = 25;
                    break;
                case '2' :
                    fee = 34;
                    break;
                case '3' :
                    fee = 50;
                    break;
                case '4' :
                    fee = 80;
                    break;
                default:
                    throw new AssertionError();
            }
            fee = fee * date + Long.parseLong(ex);
        }
        @Override
        public int compareTo(bill o) {
            return fee > o.fee ? -1 : 1;
        } 
        @Override 
        public String toString() {
            return id + " " + name + " " + room + " " + date + " " + fee;
        }
    } 
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        bill[] a = new bill[n];
        for(int i = 0; i < n; ++ i) {
            a[i] = new bill(i + 1, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim());
        }
        Arrays.sort(a);
        for (bill bill : a) {
            System.out.println(bill);
        }
    }
}
