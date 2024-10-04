
import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        
        for(int i = 0; i < n; ++ i)
        {
            a[i] = sc.nextInt();
        }
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; ++ i)
        {
            if(s.isEmpty()) s.push(a[i]);
            else
            {
                int tmp = s.pop();
                if((a[i] + tmp) % 2 != 0)
                {
                    s.push(tmp);
                    s.push(a[i]);
                }
            }
        }

        System.out.print(s.size());
    }
}
