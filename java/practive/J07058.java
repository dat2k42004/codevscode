import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
class subject
{
    String id, name, test;

    void set(Scanner sc)
    {
        id = sc.nextLine();
        name = sc.nextLine();
        test = sc.nextLine();
    }
    

    public void get()
    {
        System.out.printf("%s %s %s\n", id, name, test);
    }
    
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));

        int n = sc.nextInt();
        sc.nextLine();
        Vector<subject> v = new Vector<>();

        for (int i = 0; i < n; ++ i)
        {
            subject x = new subject();
            x.set(sc);
            v.add(x);
        }

        Collections.sort(v, new Comparator<subject>() {

            @Override
            public int compare(subject a, subject b)
            {
                if(a.id.compareTo(b.id) > 0) 
                    return 1;
                return -1;
            }
        });

        for (int i = 0; i < n; ++ i)
        {
            v.get(i).get();
        }
        sc.close();
    }
}
