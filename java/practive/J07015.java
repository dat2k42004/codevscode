    import java.io.FileInputStream;
    import java.io.IOException;
    import java.io.ObjectInputStream;
    import java.util.ArrayList;

    public class J07015 {
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
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));

            ArrayList<Integer> a = (ArrayList<Integer>) os.readObject();

            int[] f = new int[10000];
            for (int x : a)
                f[x] ++ ;

            for (int i = 2; i < 10000; ++ i)
            {
                if(f[i] > 0 && prime(i))
                    System.out.println(i + " " + f[i]);
            }
        }
    }
