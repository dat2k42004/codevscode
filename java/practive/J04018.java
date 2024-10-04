import java.util.Scanner;

public class J04018 {

    static class complex {
        int real, virtual;

        void input(Scanner sc)
        {
            real = sc.nextInt(); 
            virtual = sc.nextInt();
        }

        void output(complex a)
        {
            int x = real + a.real;
            int y = virtual + a.virtual;

            int x1 = real * x - y * virtual;
            int x2 = real * y + virtual * x;

            int y1 = x * x - y * y;
            int y2 = 2 * x * y;

            System.out.print(x1 + " ");
            if(x2 > 0) 
                System.out.print("+ " + x2 + "i, ");
            else 
                System.out.print("- " + Math.abs(x2) + "i, ");
            System.out.print(y1 + " ");
            if(y2 > 0)
                System.out.print("+ " + y2 + "i\n");
            else 
                System.out.print("- " + Math.abs(y2) + "i\n");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            complex A = new complex();
            A.input(sc);
            complex B = new complex();
            B.input(sc);
            A.output(B);
        }
    }   
}
