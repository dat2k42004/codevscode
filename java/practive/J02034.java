
import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        int f[] = new int[201];
        for(int i = 0; i < n; ++ i)
        {
            a[i] = sc.nextInt();
            f[a[i]] = 1;
        }
        boolean ok = false;
        for(int i = 1; i < a[n - 1]; ++ i)
        {
            if(f[i] == 0) 
            {
                System.out.println(i);
                ok = true;
            }
        }
        if(!ok) System.out.print("Excellent!");
    }
    
}
