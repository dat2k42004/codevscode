import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class J07009 {

    public static class IntSet {
        int[] f;

        IntSet(int[] a)
        {
            f = a;
        }

        public IntSet intersection(IntSet a)
        {
            Set<Integer> s = new HashSet<>();
            for (int x : f)
                s.add(x);
            
            SortedSet<Integer> ss = new TreeSet<>();

            for (int x : a.f)
                if (s.contains(x))
                    ss.add(x);
            
            int[] c = new int[ss.size()];
            int i = 0;
            for (int x : ss)
                c[i ++ ] = x;
            
            IntSet x = new IntSet(c);
            return x;
        }

        @Override
        public String toString()
        {
            String res = "";
            for (int i = 0; i < f.length; ++ i)
                res += Integer.toString(f[i]) + " ";
            
            return res;
        }

        
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in")) ;

        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
