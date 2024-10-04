
import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++ i) 
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; ++ i)
        {
            System.out.print("Buoc " + i + ": ");
            for(int j = 0; j <= i; ++ j)
            {
                if(a[j] > a[i])
                {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
    
}
