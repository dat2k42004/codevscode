import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J07045 {

    public static class LoaiPhong implements Comparable<LoaiPhong> {
        String name, value;

        public LoaiPhong (String s)
        {
            this.name = s.split("\\s+")[1];
            this.value = s;
        }

        @Override
        public String toString()
        {
            return value;
        }

        @Override
        public int compareTo(LoaiPhong a)
        {
            return this.name.compareTo(a.name);
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("PHONG.in"));

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<LoaiPhong> ds = new ArrayList<>();

        while (n -- > 0)
        {
            ds.add(new LoaiPhong(sc.nextLine()));
        }

        Collections.sort(ds);

        for (LoaiPhong tmp : ds)
            System.out.println(tmp);
    }
}
