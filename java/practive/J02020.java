
import java.util.Scanner;

public class J02020 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, ans = 0;
        n = sc.nextInt(); k = sc.nextInt();
        int[] a = new int[11];
        for(int i = 1; i <= k; ++ i) a[i] = i;
        // boolean ok = false;
        while (true) {
            ans++;
            for(int i = 1; i <= k; ++ i)
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            int i = k;
            while(i > 0 && a[i] >= n - k + i) i--;
            if(i == 0)
            {
                break;
            }
            a[i] += 1;
            for(int j = i + 1; j <= k; ++j) a[j] = a[i] + j - i;
        }
        System.out.print("Tong cong co " + ans + " to hop");
    }
    
}
