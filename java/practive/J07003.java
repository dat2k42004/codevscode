import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        
        String s = sc.next();

        while (s.length() > 1) {
            int n = s.length();
            

            BigInteger a1 = new BigInteger(s.substring(0, n / 2));

            BigInteger a2 = new BigInteger(s.substring(n / 2));

            a1 = a1.add(a2);
            s = a1.toString();
            System.out.println(s);
            
        }
    }
}
