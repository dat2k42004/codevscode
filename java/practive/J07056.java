import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class J07056 {
    public static String change(String s)
    {
        s = s.toLowerCase() + " ";
        ArrayList<String> a = new ArrayList<>();
        String tmp = "";
        for(int i = 0; i < s.length(); ++ i)
        {
            if(s.charAt(i) == ' ')
            {
                if(tmp != "")
                {
                    a.add(tmp);
                    tmp = "";
                }
            }
            else   
                tmp += s.charAt(i);
        }
        s = "";
        for(String x : a)
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        return s.substring(0, s.length());
    }
    static int t;
    public static class guest {
        
        String id, name, type;
        int first_ele, last_ele, insite, outsite, sum, lim, vat;

        void input(Scanner sc)
        {
            sc.nextLine();
            name = change(sc.nextLine());
            type = sc.next();
            first_ele = sc.nextInt();
            last_ele = sc.nextInt();
            id = String.format("KH%02d", ++ t);
            if(type.compareTo("A") == 0)
                lim = 100;
            else if(type.compareTo("B") == 0)
                lim = 500;
            else if(type.compareTo("C") == 0)
                lim = 200;
            
            if(last_ele - first_ele <= lim)
            {
                insite = (last_ele - first_ele) * 450;
                outsite = 0;
                vat = 0;
                sum = insite;
            }
            else
            {
                insite = lim * 450;
                outsite = (last_ele - first_ele - lim) * 1000;
                vat = (int)outsite / 20;
                sum = insite + outsite + vat;
            }
        }

        void output()
        {
            System.out.printf("%s %s %d %d %d %d\n", id, name, insite, outsite, vat, sum);
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        t = 0;
        ArrayList<guest> a = new ArrayList<>();
        for(int i = 0; i < n; ++ i)
        {
            guest x = new guest();
            x.input(sc);
            a.add(x);
        }
        Collections.sort(a, new Comparator<guest>() {
            @Override
            public int compare(guest a, guest b)
            {
                if(a.sum > b.sum)
                    return -1;
                return 1;
            }
        });

        for(guest x : a)
            x.output();
    }
}
