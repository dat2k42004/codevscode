import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class J07037 {
    public static class business {
        String id, name;
        int number;

        void input(Scanner sc)
        {
            id = sc.nextLine();
            name = sc.nextLine();
            number = Integer.parseInt(sc.nextLine());
        }

        void output()
        {
            System.out.printf("%s %s %d\n", id, name, number);
        }
        
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileInputStream("DN.in"));

        int n = sc.nextInt();
        sc.nextLine();

        Vector<business> v = new Vector<>();
        for(int i = 0; i < n; ++ i)
        {
            business a = new business();
            a.input(sc);
            v.add(a);
        }

        Collections.sort(v, new Comparator<business>() {
            @Override
            public int compare(business a, business b)
            {
                if(a.id.compareTo(b.id) > 0)
                    return 1;
                return -1;
            }
        });
        for(business x : v) 
            x.output();
    }
}
