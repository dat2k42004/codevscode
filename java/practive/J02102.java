import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;
public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x ;

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; ++ i)
        {
            for (int j = 0; j < n; ++ j)
            {
                x = sc.nextInt();

                a.add(x);
            }
        }
        Collections.sort(a);

        int[][] v = new int[n][n];

        int x1 = 0, x2 = n - 1, y1 = 0, y2 = n - 1;
        int k = 0;
        while (x1 <= x2 && y1 <= y2)
        {
            for (int i = y1; i <= y2; ++ i)
            {
                v[x1][i] = a.get(k ++ );
            }
            x1 ++;
            for (int i = x1; i <= x2; ++ i)
            {
                v[i][y2] = a.get(k ++);
            }
            y2 --;
            for(int i = y2; i >= y1; --i)
            {
                v[x2][i] = a.get(k ++);
            }
            x2 --;
            for(int i = x2; i >= x1; --i)
            {
                v[i][y1] = a.get(k ++ );
            }
            y1 ++;
        }
        for (int i = 0; i < n; ++ i)
        {
            for (int j = 0; j < n; ++ j)
            {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }
}
