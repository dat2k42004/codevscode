import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J07014 {
    static class WordSet {
        SortedSet<String> res = new TreeSet<>();
        WordSet(String s) throws IOException {
            Scanner sc = new Scanner(new File(s));
            while (sc.hasNextLine()) {
                String x = sc.nextLine();
                for (String i : x.toLowerCase().split("\\s+")) {
                    res.add(i);
                }
            }
        }
        public String union(WordSet x) {
            SortedSet<String> result =  new TreeSet<>();
            for (String i : res) {
                result.add(i);
            }
            for (String i : x.res) {
                result.add(i);
            }
            String s = "";
            for (String i : result) {
                s += i + " ";
            }
            return s.trim();
        }
        public String intersection(WordSet x) {
            String  s = "";
            for (String i : res) {
                if (x.res.contains(i)) {
                    s += i + " ";
                }
            }
            return s.trim();
        }
    }
    public static void main(String[] args) throws IOException {
        
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));

    }
}
