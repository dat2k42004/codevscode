import java.util.ArrayList;
import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "";

        while (sc.hasNextLine())
            s += sc.nextLine();

        String[] a = s.trim().toLowerCase().split("[!.?]");

        for (String x : a)
        {
            x = x.trim();
            x = x.substring(0, 1).toUpperCase() + x.substring(1);
            for (String j : x.split("\\s+"))
            {
                System.out.printf("%s ", j);
            }
            System.out.println("");
        }
        
    }
}
