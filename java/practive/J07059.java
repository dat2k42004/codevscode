import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07059 {
    static int t;
    public static class exam implements Comparable<exam> {
        String id, day, time, zoom;
        
        void input(Scanner sc) {
            t ++ ;
            id = String.format("C%03d", t);
            day = sc.nextLine();
            time = sc.nextLine();
            zoom = sc.nextLine();
        }
        
        @Override 
        public int compareTo(exam a) {
            if (day.compareTo(a.day) == 0) {
                if (time.compareTo(a.time) == 0) {
                    return id.compareTo(a.id);
                }
                else {
                    return time.compareTo(a.time);
                }
            }
            return day.compareTo(a.day);
        }
        
        void output() {
            System.out.printf("%s %s %s %s\n", id, day, time, zoom);
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        t = 0;
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<exam> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i) {
            exam x = new exam();
            x.input(sc);
            a.add(x);
        }
        Collections.sort(a);
        for (exam x : a)
            x.output();
    }
}
