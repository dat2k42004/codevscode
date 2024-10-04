import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class J07030 {

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
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) os.readObject();
        Set<Integer> s1 = new TreeSet<>();
        for (int x : a1)
            if(prime(x))
                s1.add(x);
        os = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) os.readObject();
        Set<Integer> s2 = new TreeSet<>();
        for (int x : a2)
            if (prime(x))
                s2.add(x);
        

        for (int x : s1)
        {
            if (x >= 1000000 - x)
            {
                break;
            }
            else 
            {
                if(s2.contains(1000000 - x))
                    System.out.println(x + " " + (1000000 - x));
            }
        }
        os.close();
    }
}
