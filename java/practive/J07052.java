
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J07052 {

    public static String change(String s)
    {
        s = s.toLowerCase() + " ";
        Vector<String> v = new Vector<>();

        String tmp = "";
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
        String res = "";
        for(String x : v)
            res += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        
        return res.substring(0, res.length());
    } 
    static double eccept_scorce;
    public static class student implements Comparable<student>
    {
        String id, name, status;
        double math, physical, technology, extra_point, sum;

        void input(Scanner sc)
        {
            sc.nextLine();
            id = sc.nextLine();
            name = change(sc.nextLine());
            math = sc.nextDouble();
            physical = sc.nextDouble();
            technology = sc.nextDouble();
            char x = id.charAt(2);
            switch (x) {
                case '1':
                    extra_point = 0.5;
                    break;
                case '2':
                    extra_point = 1.0;
                    break;
                case '3':
                    extra_point = 2.5;
                    break;
                default:
                    break;
            }
            sum = math * 2.0 + physical + technology + extra_point;
        }
        @Override
        public int compareTo(student a)
        {
            if(sum > a.sum)
                return -1;
            return 1;
        }

        void output()
        {
            System.out.printf("%s %s ", id, name);
            if((int)extra_point == extra_point)
            {
                System.out.printf("%d ", (int)extra_point);
            }
            else
                System.out.printf("%.1f ", extra_point);
            if((int)sum == sum)
            {
                System.out.printf("%d ", (int)sum);
            }
            else
                System.out.printf("%.1f ", sum);
            if(sum >= eccept_scorce) 
                status = "TRUNG TUYEN";
            else 
                status = "TRUOT";
            System.out.println(status);
        }

    }
    public static void main(String[] args) throws  IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        Vector<student> v = new Vector<>();

        for(int i = 0; i < n; ++ i)
        {
            student x = new student();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v);
        int target = sc.nextInt();
        eccept_scorce = v.get(target - 1).sum;
        if((int)eccept_scorce == eccept_scorce)
        {
            System.out.printf("%d\n", (int)eccept_scorce);
        }
        else
            System.out.printf("%.1f\n", eccept_scorce);  

        for (student x : v) 
            x.output();
    }   
}
