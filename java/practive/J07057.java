import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07057 {

    public static class ThiSinh implements Comparable<ThiSinh> {

        private String ma;
        private String ten;
        private float diem;
        private String trangThai;
    
        public ThiSinh(String ma, String ten, float diem, String trangThai) {
            this.ma = ma;
            this.ten = ten;
            this.diem = diem;
            this.trangThai = trangThai;
        }
    
        @Override
        public String toString() {
            return String.format("%s %s %.1f %s", ma, ten, diem, trangThai);
        }
    
        @Override
        public int compareTo(ThiSinh o) {
            if (diem > o.diem) {
                return -1;
            } else if (diem == o.diem) {
                return ma.compareTo(o.ma);
            } else {
                return 1;
            }
        }
    
    }

    public static String chuanHoa(String ten) {
        String[] a = ten.trim().toLowerCase().split("\\s+");
        String s = "";
        for (String i : a) {
            s += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return s.trim();
    }

    public static float tinhDiem(float d, String dt, int kv) {
        if (kv == 1) {
            d += 1.5;
        } else if (kv == 2) {
            d += 1;
        }
        if (!"Kinh".equals(dt)) {
            d += 1.5;
        }
        return d;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        List<ThiSinh> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ma = String.format("TS%02d", i + 1);
            String ten = chuanHoa(sc.nextLine());
            float d = sc.nextFloat();
            sc.nextLine();
            String dt = sc.nextLine();
            int kv = sc.nextInt();
            float diem = tinhDiem(d, dt, kv);
            String trangThai;
            if (diem >= 20.5) {
                trangThai = "Do";
            } else {
                trangThai = "Truot";
            }
            l.add(new ThiSinh(ma, ten, diem, trangThai));
        }
        Collections.sort(l);
        for (ThiSinh i : l) {
            System.out.println(i);
        }
    }

}



