import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J07007 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));

        SortedSet<String> ss = new TreeSet<>();

        while (sc.hasNext())
        {
            ss.add(sc.next().toLowerCase());
        }
        for (String x : ss)
        {
            System.out.println(x);
        }
    }
}