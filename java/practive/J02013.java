
import java.util.Scanner;

public class J02013 {

    public static boolean check(int[] a, int n)
    {
        for(int i = 0; i < n - 1; ++ i)
        {
            if(a[i] > a[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++ i)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; ++ i)
        {
            if(check(a, n)) 
            {
                break;
            }
            for(int j = 1; j < n; ++ j)
            {
                if(a[j] < a[j - 1])
                {
                    int tmp =  a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0; j < n; ++ j)
            {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
