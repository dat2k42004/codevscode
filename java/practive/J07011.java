import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J07011 {
    static class pair implements Comparable<pair>{
        String key;
        int val;
        pair (String key, int val) {
            this.key = key;
            this.val = val;
        }
        @Override 
        public String toString() {
            return key + " " + val;
        }
        @Override 
        public int compareTo(pair o) {
            return val == o.val ? key.compareTo(o.key) : o.val - val;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<pair> a = new ArrayList<>();
        ArrayList<String> tmp = new ArrayList<>();
        for (int j = 0; j < n; ++ j) {
            String s = sc.nextLine().toLowerCase() + " ";
            String res = "";
            for (int i = 0; i < s.length(); ++ i) {
                char x = s.charAt(i);
                if (!Character.isDigit(x) && !Character.isLetter(x)) {
                    if (!res.equals("")) {
                        if (tmp.contains(res)) {
                            int idx = tmp.indexOf(res);
                            a.get(idx).val += 1;
                        }
                        else {
                            a.add(new pair(res, 1));
                            tmp.add(res);
                        }
                        res = "";
                    }
                }
                else {
                    res += x;
                }
            }
        }
        Collections.sort(a);
        a.forEach(e -> System.out.println(e));
    }
}