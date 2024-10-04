import java.util.Scanner;

class student
{
    String name, birthday;
    float d1, d2, d3, sum;

    Scanner sc = new Scanner(System.in);

    void set()
    {
        name = sc.nextLine();

        birthday = sc.next();

        d1 = sc.nextFloat();
        d2 = sc.nextFloat();
        d3 = sc.nextFloat();

        sum = d1 + d2 + d3;
    }

    void get()
    {
        System.out.print(name + " " + birthday + " ");
        System.out.printf("%.1f", sum);
    }
}
public class J04005 {
    public static void main(String[] args) {
        student a = new student();

        a.set();
        a.get();
        
    }
}
