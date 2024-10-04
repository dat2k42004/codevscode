import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07076 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));

        int t = Integer.parseInt(sc.nextLine());
        while (t -- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt(); 
            sc.nextLine();
            int[] a = new int[n * m + 1];

            for (int i = 1; i <= n * m; ++ i)
                a[i] = sc.nextInt();
            sc.nextLine();
            ArrayList<Integer> x = new ArrayList<>();

            for(int i = k; i <= n * m; i += m)
                x.add(a[i]);
            Collections.sort(x);
            int idx = 0;
            for(int i = k; i <= n * m; i += m)
                a[i] = x.get(idx ++ );
            for(int i = 1; i <= n * m; ++ i)
            {
                System.out.print(a[i] + " ");
                if (i % m == 0)
                    System.out.println();
            }
        }
    }
}