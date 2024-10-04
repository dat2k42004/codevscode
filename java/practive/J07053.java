import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class J07053 {

    public static String change(String s)
    {
        s = s.toLowerCase() + " ";
        String tmp = "";
        Vector<String> v = new Vector<>();
        for(int i = 0; i < s.length(); ++ i)
        {
            if(s.charAt(i) == ' ')
            {
                if(tmp != "")
                {
                    v.add(tmp);
                    tmp = "";
                }
            }
            else tmp += s.charAt(i);
        }
        s = "";
        for(String x : v)
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        return s.substring(0, s.length());
    }

    static int t;
    public static class amission {
        String name, id, birthday, status;
        double theory_point, practive_point, extra_point;
        int age, medium_point;

        void input(Scanner sc)
        {
            sc.nextLine();
            name = change(sc.nextLine());
            birthday = sc.nextLine();
            theory_point = sc.nextDouble();
            practive_point = sc.nextDouble();
            age = 2021 - Integer.parseInt(birthday.substring(birthday.length() - 4));
            if(theory_point >= 8 && practive_point >= 8)
                extra_point = 1.0;
            else if(theory_point >= 7.5 && practive_point >= 7.5)
                extra_point = 0.5;
            else 
                extra_point = 0;
            medium_point = (int) Math.round((theory_point + practive_point) / 2 + extra_point);
            if(medium_point > 10) 
                medium_point = 10;
            if(medium_point < 5)
                status = "Truot";
            else if (medium_point <= 6)
                status = "Trung binh";
            else if (medium_point == 7)
                status = "Kha";
            else if (medium_point == 8)
                status = "Gioi";
            else if(medium_point == 9 || medium_point == 10)
                status = "Xuat sac";
            t ++ ;
            id = String.format("PH%02d", t);
        }

        void output()
        {
            System.out.printf("%s %s %d %d %s\n", id, name, age, medium_point, status);
        }
        
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();

        ArrayList<amission> a = new ArrayList<>();

        for(int i = 0; i < n; ++ i)
        {
            amission x = new amission();
            x.input(sc);
            a.add(x);
        }

        for(amission x : a)
            x.output();
    }
}
