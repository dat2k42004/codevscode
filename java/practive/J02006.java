import java.util.Scanner;

public class J02006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, m;
        n = scan.nextInt();
        m = scan.nextInt();

        int[] a = new  int[n], b = new int[m];


        int[] f = new int[1000];
        for(int i = 0 ; i < n ; ++ i) 
        {
            a[i] = scan.nextInt();
            f[a[i]] = 1;
        }
        for(int i = 0 ; i < m ; ++ i)
        {
            b[i] = scan.nextInt();
            f[b[i]] = 1;
        }
        for(int i = 0 ; i < 1000 ; ++ i)
        {
            if(f[i] == 1) System.out.print(i + " ");
        }
    }
    
}
