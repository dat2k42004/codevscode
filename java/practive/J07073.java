import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07073 {

    public static class subject implements Comparable<subject> {
        String id, name, unit, theory, practice;
        void input(Scanner sc)
        {
            id = sc.nextLine();
            name = sc.nextLine();
            unit = sc.nextLine();
            theory = sc.nextLine();
            practice = sc.nextLine();
        }

        @Override
        public int compareTo(subject a)
        {
            return id.compareTo(a.id);
        }
        void output()
        {
            System.out.printf("%s %s %s %s %s\n", id, name, unit, theory, practice);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<subject> a = new ArrayList<>();

        for (int i = 0; i < n; ++ i)
        {
            subject x = new subject();
            x.input(sc);
            a.add(x);
        }
        Collections.sort(a);

        for (subject x : a)
            if (!x.practice.equals("Truc tiep"))
                x.output();

    }
}
