
import java.util.Scanner;

public class J03027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int i = 0;
        
        while ( i < s.length() - 1 )
        {
            if ( s.charAt(i) == s.charAt(i + 1))
            {
                s = s.substring(0, i) + s.substring(i + 2);
                if ( i > 0 ) i -- ;          
            }
            else
                i ++ ;
        }
        if( s.length() == 0)
        {
            System.out.print("Empty String");
        }
        else
        {
            System.out.print(s);
        }
    }
    
}
