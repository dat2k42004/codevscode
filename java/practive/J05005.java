import java.util.*;
public class J05005 {
    static int t;
    static String change(String s)
    {
        String[] res = s.trim().toLowerCase().split("\\s+");
        s = "";
        for(String x : res)
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        return s.trim();
    }

    static class student implements Comparable<student> {
        String id, name, clas, birthday;
        double gpa;

        void input(Scanner sc)
        {
            t ++ ;
            sc.nextLine();
            id = String.format("B20DCCN%03d", t);
            name = change(sc.nextLine());
            clas = sc.nextLine();
            birthday = sc.nextLine();
            gpa = sc.nextDouble();

            if (birthday.charAt(1) == '/')
                birthday = "0" + birthday;
            if (birthday.charAt(4) == '/')
                birthday = birthday.substring(0, 3) + "0" + birthday.substring(3);
        }
        @Override
        public int compareTo(student a)
        {
            if(gpa > a.gpa) 
                return -1;
            return 1;
        }
        void output()
        {
            System.out.printf("%s %s %s %s %.2f\n", id, name, clas, birthday, gpa);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = 0;
        int n = sc.nextInt();
        ArrayList<student> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            student x = new student();
            x.input(sc);
            a.add(x);
        }
        Collections.sort(a);
        for (student x : a)
            x.output();

    }
}
