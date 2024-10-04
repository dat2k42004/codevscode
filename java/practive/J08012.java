import java.util.*;
public class J08012
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; ++ i)   
            a[i] = 0;
        for(int i = 0; i < n - 1; ++ i)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            a[x] ++ ;
            a[y] ++ ;
        }
        boolean ok = false;
        for (int i = 0; i <= n; ++ i)
        {
            if (a[i] == n - 1)
            {
                ok = true;
                break;
            }
        }
        if (ok) 
            System.out.print("Yes");
        else 
            System.out.print("No");
    }
}