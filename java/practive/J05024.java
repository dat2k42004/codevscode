import java.util.*;
public class J05024 {
    static class student{
        String id, name, clas, email;
        void in(Scanner sc){
            id = sc.nextLine();
            name = sc.nextLine();
            clas = sc.nextLine();
            email = sc.nextLine();
        }
        
        void out(){
            System.out.printf("%s %s %s %s\n", id, name, clas, email);
        }
    }
    public static void main (String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Ke toan", "DCKT");
        hm.put("Cong nghe thong tin", "DCCN");
        hm.put("An toan thong tin", "DCAT");
        hm.put("Vien thong", "DCVT");
        hm.put("Dien tu", "DCDT");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<student> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i) {
            student x = new student();
            x.in(sc);
            a.add(x);
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t -- > 0){
            String s = sc.nextLine();
            String res = hm.get(s);
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", s.toUpperCase());
            for (student x : a) {
                if (res.compareTo("DCCN") == 0 || res.compareTo("DCAT") == 0) {
                    if (!x.clas.startsWith("E") && x.id.indexOf(res) > -1)
                        x.out();
                }
                else{
                    if (x.id.indexOf(res) > -1)
                        x.out();
                }
                    
            }
        }
    }
}