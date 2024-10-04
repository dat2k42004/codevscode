import java.util.Scanner;   

public class J01002
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0)
        {
            long l = sc.nextLong();

            System.out.println(l * (l + 1) /2);
            --t;
        }
    }
}