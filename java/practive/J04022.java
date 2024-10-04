import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class J04022 {

    public static class  WordSet {
        
        String s;

        WordSet(String a)
        {
            s = a;
        }

        public String union(WordSet a)
        {
            SortedSet<String> st = new TreeSet<>();

            String[] res = s.split("\\s+");

            for (String x : res)
                st.add(x.toLowerCase());
            String[] tmp = a.s.split("\\s+");

            for (String x : tmp)
                st.add(x.toLowerCase());
            String result = "";
            for (String x : st)
                result += x + " ";
            
            return result;
        }

        public String intersection(WordSet a)
        {
            Set<String> st = new HashSet<>();
            SortedSet<String> st1 = new TreeSet<>();
            String[] res = s.split("\\s+");

            for (String x : res)
            {
                st.add(x.toLowerCase());
            }

            String[] tmp = a.s.split("\\s+");

            for(String x : tmp)
            {
                if(st.contains(x.toLowerCase())) 
                    st1.add(x.toLowerCase());
            }

            String result = "";
            for (String x : st1)
                result += x + " ";
            
            return result;
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));

    }
}
