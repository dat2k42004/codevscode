import java.util.Scanner;
import java.util.Stack;

public class J08028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        k = sc.nextInt();
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        long res = 0; 
        for (int i = 0; i < n; ++ i) {
            while (!st.isEmpty() && a[i] < a[st.peek()]) {
                int j = st.pop();
                if (st.isEmpty()) {
                    res = Math.max(res, 1l * a[j] * i);
                }
                else {
                    res = Math.max(res, 1l * a[j] * (i - st.peek() - 1));
                }
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int i = st.pop();
            if (st.isEmpty()) {
                res = Math.max(res, 1l * a[i] * n);
            }
            else {
                res = Math.max(res, 1l * a[i] * (n - st.peek() -1));
            }
        }
        for (int i = 0; i < n; ++ i) {
            a[i] = k - a[i];
        }
        st.clear();
        for (int i = 0; i < n; ++ i) {
            while (!st.isEmpty() && a[i] < a[st.peek()]) {
                int j = st.pop();
                if (st.isEmpty()) {
                    res = Math.max(res, 1l * a[j] * i);
                }
                else {
                    res = Math.max(res, 1l * a[j] * (i - st.peek() - 1));
                }
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int i = st.pop();
            if (st.isEmpty()) {
                res = Math.max(res, 1l * a[i] * n);
            }
            else {
                res = Math.max(res, 1l * a[i] * (n - st.peek() -1));
            }
        }
        System.out.print(res);
    }
}
