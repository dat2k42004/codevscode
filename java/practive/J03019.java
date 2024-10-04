
import java.util.Scanner;
import java.util.Stack;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); ++ i)
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
            }
            else
            {
                char x = '#';
                while (!st.isEmpty()) {
                    x = st.pop();
                    if(x >= s.charAt(i))
                    {
                        st.push(x);
                        break;
                    }
                }
                st.push(s.charAt(i));
            }

        }
        String res = "";
        while ( !st.isEmpty() )
        {
            res = st.pop() + res;
        }
        System.out.print(res);
    }
}
