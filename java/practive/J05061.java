
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05061 {
    static class result
    {
        String id, name, status;
        int score;
        int age;
        result (String x, String y, double a, double b, int i)
        {
            id = String.format("PH%02d", i);
            name = x;
            age = 2021 - Integer.parseInt(y.substring(6));
            double z;
            if (a >= 8.0 && b >= 8.0)
                z = 1.0;
            else if (a >= 7.5 && b >= 7.5) 
                z = 0.5;
            else 
                z = 0.0;
            score = (int) Math.round((double) ((a + b) / 2) + z);
            if (score > 10)
                score = 10;
            if (score >= 9)
                status = "Xuat sac";
            else if (score == 8)
                status = "Gioi";
            else if (score == 7)
                status = "Kha";
            else if (score >= 5)
                status = "Trung binh";
            else 
                status = "Truot";
        }
        @Override
        public String toString()
        {
            return  String.format("%s %s %d %d %s", id, name, age, score, status);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<result> a = new ArrayList<>();
        for (int i = 1; i <= n; ++ i)
        {
            sc.nextLine();
            a.add(new result(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), i));
        }
        Collections.sort(a, new Comparator<result>(){
            @Override
            public int compare (result x, result y)
            {
                if (x.score == y.score)
                    return x.id.compareTo(y.id);
                return y.score - x.score;
            }
        });
        for (result x : a)
            System.out.println(x);
    }
}

