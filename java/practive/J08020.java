
import java.util.Scanner;
import java.util.Stack;

public class J08020 {

    public static int check(String s)
    {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); ++ i)
        {
            char x = s.charAt(i);
            if(x == ')')
            {
                if(st.empty() || st.peek() != '(')
                    return 0;
                st.pop();
            }
            else if(x == '}')
            {
                if(st.empty() || st.peek() != '{')
                    return 0;
                st.pop();
            }
            else if(x == ']')
            {
                if(st.empty() || st.peek() != '[')
                    return 0;
                st.pop();
            }
            else
                st.push(x);
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t -- > 0 )
        {
            String s = sc.next();
            if (check(s) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
