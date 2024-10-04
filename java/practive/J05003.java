import java.util.*;
public class J05003 {
    static int t;
    static class student {
        String id, name, birthday, clas;
        double gpa;

        void input(Scanner sc)
        {
            t ++ ;
            id = String.format("B20DCCN%03d", t);
            sc.nextLine();
            name = sc.nextLine();
            clas = sc.nextLine();
            birthday = sc.nextLine();
            gpa = sc.nextDouble();
            if (birthday.charAt(1) == '/') 
                birthday = "0" + birthday;
            if (birthday.charAt(4) == '/')
                birthday = birthday.substring(0, 3) + "0" + birthday.substring(3);
        }
        void output()
        {
            System.out.printf("%s %s %s %s %.2f\n", id, name, clas, birthday, gpa);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<student> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            student x = new student();
            x.input(sc);
            a.add(x);
        }
        for (student x : a)
            x.output();
    }
}
