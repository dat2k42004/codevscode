import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07032 {
    static boolean reciprocal(String s)
    {
        if(s.length() == 1 || s.length() % 2 == 0)
            return false;
        for (int i = 0; i <= s.length() / 2; ++ i)
        {
            if((s.charAt(i) - '0') % 2 == 0)
            {
                return false;
            }
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA1.in"));

        ArrayList<Integer> a = (ArrayList<Integer>) os.readObject();
        int[] f1 = new int[1000001];
        for (Integer x : a)
        {
            if(reciprocal(x.toString()))
            {
                f1[x] ++ ;
            }
        }
        os = new ObjectInputStream(new FileInputStream("DATA2.in"));
        a = (ArrayList<Integer>) os.readObject();
        int[] f2 = new int[1000001];
        for(Integer x : a)
        {
            if(reciprocal(x.toString()))
            {
                f2[x] ++ ;
            }
        }
        int cnt = 0;
        for(int i = 0; i <= 1000000; ++ i)
        {
            if(f1[i] > 0 && f2[i] > 0)
            {
                cnt ++ ;
                System.out.println(i + " " + (f1[i] + f2[i]));
            }
            if(cnt == 10)
                break;
        }
        os.close();
    }
}
