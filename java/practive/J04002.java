import java.util.Scanner;


class Rectange
{
    int heigh, width;
    String color;

    public void set(Scanner sc)
    {
        this.heigh = sc.nextInt();
        this.width = sc.nextInt();
        this.color = sc.next();
    }

    public void get()
    {
        if (heigh <= 0 || width <= 0) 
        {
            System.out.print("INVALID");
        }
        else
        {
            color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
            System.out.print(2 * ( heigh + width ) + " " + heigh * width + " " + color);
        }
    }
}
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectange  a = new Rectange();

        a.set(sc);

        a.get();
    }
}
