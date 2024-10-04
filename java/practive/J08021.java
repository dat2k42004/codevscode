
import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0)
        {
            sc.nextLine();
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            int res = 0;
            st.push(-1);
            for (int i = 0; i < s.length(); ++ i)
            {
                if (s.charAt(i) == '(')
                    st.push(i);
                else
                {
                    st.pop();
                    if (st.isEmpty())
                        st.push(i);
                    else    
                        res = Math.max(res, i - st.peek());
                }
            }
            System.out.println(res);
        }
    }
}

