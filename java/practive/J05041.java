import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05041 {

    static class Salary {
        String name, posi, id;
        int day_salary, work, extra, second_salary, sum, salary;

        Salary(String x, int y, int z, String t, int u)
        {
            id = String.format("NV%02d", u);
            name = x;
            day_salary = y;
            work = z;
            posi = t;
            if (posi.equals("GD"))
                second_salary = 250000;
            else if (posi.equals("PGD"))
                second_salary = 200000;
            else if (posi.equals("TP"))
                second_salary = 180000;
            else if (posi.equals("NV"))
                second_salary = 150000;
            salary = day_salary * work;
            extra = 0;
            if (work >= 25)
                extra = salary / 5;
            else if (work >= 22)
                extra = salary / 10;
            sum = salary + second_salary + extra;
        }
        @Override
        public String toString()
        {
            return id + " " + name + " " + salary + " " +  extra + " " + second_salary + " " + sum;
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Salary> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new Salary(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next(), i + 1));
        }
        Collections.sort(a, new Comparator<Salary>() {
            @Override
            public int compare(Salary a, Salary b)
            {
                return b.sum - a.sum;
            }
        });
        for (Salary x : a)
        {
            System.out.println(x);
        }
    }   
}
