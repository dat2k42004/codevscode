import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class J07033 {

    public static class student {
        String id, name, clas, mail;

        public void set(Scanner sc)
        {   
            id = sc.nextLine();
            name = change(sc.nextLine());
            clas = sc.nextLine();
            mail = sc.nextLine();
        }

        public String change(String s)
        {
            s = s.toLowerCase() + " ";
            String res = "";
            Vector<String> a = new Vector<>();

            for (int i = 0; i < s.length(); ++ i)
            {
                if (s.charAt(i) == ' ')
                {
                    if (res != "")
                    {
                        a.add(res);
                        res = "";
                    }
                }
                else 
                    res += s.charAt(i);
            }

            String result = "";
            for (String x : a)
            {
                result += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            }
            return result.substring(0, result.length() - 1);
        }

        public void get()
        {
            System.out.printf("%s %s %s %s\n", id, name, clas, mail);
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));

        int n = sc.nextInt();
        sc.nextLine();
        Vector<student> v = new Vector<>();

        for(int i = 0; i < n; ++ i)
        {
            student a = new student();
            a.set(sc);;
            v.add(a);
        }

        Collections.sort(v, new Comparator<student>() {
            @Override
            public int compare(student a, student b)
            {
                if (a.id.compareTo(b.id) > 0)
                    return 1;
                return -1;
            }
            
        });

        for (student x : v)
            x.get();
        sc.close();
    }   
}