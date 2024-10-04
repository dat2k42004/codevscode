import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<Integer> a = (ArrayList<Integer>) os.readObject();

        int[] f = new int[1000];
        for (int x : a)
            f[x] ++ ;
        for(int i = 0; i < 1000; ++ i)
            if(f[i] > 0)    
                System.out.println(i + " " + f[i]);


    }
}
