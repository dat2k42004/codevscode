import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class J07034 {

    public static class subject {
    
        String id, name;
        int unit;

        void input(Scanner sc)
        {
            id = sc.nextLine();
            name = sc.nextLine();
            unit = Integer.parseInt(sc.nextLine());
        }

        void output()
        {
            System.out.printf("%s %s %d\n", id, name, unit);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));

        int n = sc.nextInt();
        sc.nextLine();
        Vector<subject> v = new Vector<>();

        for(int i = 0; i < n; ++ i)
        {
            subject a = new subject();
            a.input(sc);
            v.add(a);
        }
        Collections.sort(v, new Comparator<subject>() {
            @Override
            public int compare(subject a, subject b)
            {
                if (a.name.compareTo(b.name) > 0)
                    return 1;
                return -1;
            }
        });

        for(subject x : v)
            x.output();

    }
}
