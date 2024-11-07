
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class J07012 {
    static class pair implements Comparable<pair>{
        String key;
        int val;
        pair(String key, int val) {
            this.key = key;
            this.val = val;
        }
        @Override
        public int compareTo(pair o) {
            return val == o.val ? key.compareTo(o.key) : o.val - val;
        }
        @Override 
        public String toString() {
            return key + " " + val;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) os.readObject();
        ArrayList<pair> res = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();
        for (String x : a) {
            String tmp = x.toLowerCase() + " ";
            String cnt = "";
            for (int i = 0; i < tmp.length(); ++ i) {
                char c = tmp.charAt(i);
                if(!Character.isDigit(c) && !Character.isLetter(c)) {
                    if (!cnt.equals("")) {
                        if (s.contains(cnt)) {
                            int idx = s.indexOf(cnt);
                            res.get(idx).val += 1;
                        }
                        else {
                            res.add(new pair(cnt, 1));
                            s.add(cnt);
                        }
                    }
                    cnt = "";
                }
                else {
                    cnt += c;
                }
            }
            
        }
        Collections.sort(res);
        res.forEach(e -> System.out.println(e));
    }
}
