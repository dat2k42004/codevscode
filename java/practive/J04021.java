import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class J04021 {


    public static class IntSet {
        
        int[] f ;

        IntSet(int[] a)
        {
            f = a;
        }

        public IntSet union(IntSet b)
        {

            int[] x = new int[1001];

            for (int i = 0; i < f.length; ++ i)
                x[f[i]] = 1;
            for (int i = 0; i < b.f.length; ++ i)
                x[b.f[i]] = 1;
            
            ArrayList<Integer> a = new ArrayList<>();

            for (int i = 0; i <= 1000; ++ i)
            {
                if (x[i] == 1)
                    a.add(i);
            }
            int[] c = new int[a.size()];

            for (int i = 0; i < a.size(); ++ i)
                c[i] = a.get(i);
            IntSet res = new IntSet(c);
            return res;
        }

        @Override
        public String toString()
        {
            String s = "";
            for (int i = 0; i < f.length; ++ i)
            {
                if (i == 0)
                    s += Integer.toString(f[i]);
                else 
                    s += " " + Integer.toString(f[i]);
            }
            return s;
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
