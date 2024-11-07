import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class J07019{
    static class clothes {
        String id, name;
        int cost1, cost2;
        clothes (String id, String name, int x1, int x2) {
            this.id = id;
            this.name = name;
            this.cost1 = x1;
            this.cost2 = x2;
        }
    }
    static class bill {
        String id, name;
        int discount, sum;
        
        bill(int i,String x1, int x2) {
            id = x1 + "-" + String.format("%03d", i);
            sum = x2;
            discount = 0;
        }
        @Override 
        public String toString () {
            return id + " " + name + " " + discount + " " + sum;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<clothes> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i){
            a.add(new clothes(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        sc.close();
        sc = new Scanner(new File("DATA2.in"));
        int m = sc.nextInt();
        ArrayList<bill> res = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            String x = sc.next();
            int y = sc.nextInt();
            res.add(new bill(i + 1, x, y));
            for (int j = 0; j < n; ++j) {
                if (res.get(i).id.startsWith(a.get(j).id)) {
                    res.get(i).name = a.get(j).name;
                    if (res.get(i).id.charAt(2) == '1') {
                        res.get(i).sum *= a.get(j).cost1;
                    } else {
                        res.get(i).sum *= a.get(j).cost2;
                    }
                    if (y >= 150) {
                        res.get(i).discount = (int) res.get(i).sum / 2;
                    }
                    else if (y >= 100) {
                        res.get(i).discount = (int) res.get(i).sum * 3 / 10;
                    }
                    else if (y >= 50) {
                        res.get(i).discount = (int) res.get(i).sum * 15 / 100;
                    }
                    else {
                        res.get(i).discount = 0;
                    }
                    res.get(i).sum -= res.get(i).discount;
                    break;
                }
            }
        }
        res.forEach(e -> System.out.println(e));
    }
}