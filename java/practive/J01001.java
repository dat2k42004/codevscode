import java.util.Scanner;

public class J01001
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a <= 0 || b <= 0) 
        {
            System.out.print(0);
        }
        else
        {
            System.out.print(2 * (a + b) + " " + a * b);
        }
    }
}