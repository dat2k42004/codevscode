import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class J07072 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> a = new ArrayList<>();

        while(sc.hasNextLine())
        {
            a.add(sc.nextLine());
        }
        for (int i = 0; i < a.size(); ++ i)
        {
            String res[] = a.get(i).trim().toLowerCase().split("\\s+");    
            for (int j = 0; j < res.length; ++ j)
            {
                res[j] = res[j].substring(0, 1).toUpperCase() + res[j].substring(1);
            }
            a.set(i, String.join(" ", res));
        }

        a.sort(new Comparator<String>() {
            @Override
            public int compare(String x, String y)
            {
                String l_n1 = x.substring(x.lastIndexOf(" ") + 1);
                String l_n2 = y.substring(y.lastIndexOf(" ") + 1);
                String f_n1 = x.substring(0, x.lastIndexOf(" "));
                String f_n2 = y.substring(0, y.lastIndexOf(" "));

                if (l_n1.compareTo(l_n2) == 0)
                {
                    return f_n1.compareTo(f_n2);
                }
                return l_n1.compareTo(l_n2);
            }
        });

        for (String x : a)
            System.out.println(x);
    }
}
