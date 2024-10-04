import java.util.Scanner;

public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0)
        {
            String s = sc.next();
            if (s.startsWith("0")) 
                System.out.println(4);
            else
            {
                int res = 1;
                int n;
                if (s.length() >= 2)
                    n = Integer.parseInt(s.substring(s.length() - 2));
                else
                    n = Integer.parseInt(s);
                if (n % 4 == 0)
                    res += 6 + 1 + 6;
                else if (n % 4 == 1)
                    res += 2 + 3 + 4;
                else if (n % 4 == 2)
                    res += 4 + 9 + 6;
                else 
                    res += 8 + 7 + 4;
                System.out.println(res % 5);
            }
        }
    }
}
