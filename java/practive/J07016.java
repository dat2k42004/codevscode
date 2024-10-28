import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class J07016 {
    static boolean prime (int n) {
        if (n < 2) 
            return false;
        for (int i = 2; i <= Math.sqrt(n); ++ i) {
            if (n % i == 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) os.readObject();
        SortedMap<Integer, Integer> sm = new TreeMap<>();

        for (Integer x : a) {
            if (prime(x)) {
                if (sm.containsKey(x)) {
                    sm.put(x, sm.get(x) + 1);
                }
                else {
                    sm.put(x, 1);
                }
            }
        }
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        a.clear();
        a = (ArrayList<Integer>) os1.readObject();
        SortedMap<Integer, Integer> sm1 = new TreeMap<>();

        for (Integer x : a) {
            if (prime(x)) {
                if (sm1.containsKey(x)) {
                    sm1.put(x, sm1.get(x) + 1);
                }
                else {
                    sm1.put(x, 1);
                }
            }
        }
        for (Integer x : sm.keySet()) {
            if (sm1.containsKey(x)) {
                System.out.printf("%d %d %d\n", x, sm.get(x), sm1.get(x));
            }
        }
    }
}
