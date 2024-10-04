import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07017 {

    static boolean prime(Integer n)
    {
        if (n < 2) 
            return false;
        for (int i = 2; i <= Math.sqrt(n); ++ i)
            if (n % i == 0)
                return false;
        
        return true;
    }

    public static class  Pair<T, K> {
        static Integer x, y;
        Pair(Integer a, Integer b)
        {
            x = a;
            y = b;
        }

        public static boolean isPrime()
        {
            return prime(x) && prime(y);
        }

        @Override
        public String toString()
        {
            String s = Integer.toString(x) + " " + Integer.toString(y);
            return s;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATAin"));

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
