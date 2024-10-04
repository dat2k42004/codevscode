import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07029 {
    static boolean prime(int n)
    {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); ++ i)
            if (n % i == 0)
                return false;
    
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<Integer> a = (ArrayList<Integer>) os.readObject();

        int[] f = new int[1000000];
        for(int x : a)
            f[x] ++ ;
        int cnt = 0;
        for(int i = 999999; i >=2; -- i)
        {
            if(f[i] > 0 && prime(i))
            {
                System.out.println(i + " " + f[i]);
                cnt ++;
            }
            if (cnt == 10)
                break;
        }
    }
}
