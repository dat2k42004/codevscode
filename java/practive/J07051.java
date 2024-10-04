
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class J07051 {
    public static String solve1(String s)
    {
        String res = s;
        if (res.charAt(1) == '/') 
            res = "0" + res;
        if (res.charAt(4) == '/')
            res = res.substring(0, 3) + "0" + res.substring(3);
        return  res;
    }
    
    public static String solve2(String s)
    {
        s = s.toLowerCase() + " ";
        ArrayList<String> a = new ArrayList<>();

        String tmp = "";

        for(int i = 0; i < s.length(); ++ i)
        {
            if (s.charAt(i) == ' ')
            {
                if(tmp != "")
                {
                    a.add(tmp);
                    tmp = "";
                }
            }
            else tmp += s.charAt(i);
        }

        s = "";
        for(String x : a)
            s += x.substring(0, 1).toUpperCase() + x.substring(1) +  " ";
        
        return s.substring(0, s.length());
    }

    public static long day_distance(String a, String b) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse(a);
        Date d2 = sdf.parse(b);

        return (d2.getTime() - d1.getTime()) / (1000 * 24 * 60 * 60) + 1;
    }

    static int t;
    public static class guest implements Comparable<guest>
    {
        String name, start_day, end_day, id, room;
        long service, cost, dayin;

        public void input(Scanner sc) throws ParseException
        {
            sc.nextLine();
            name = solve2(sc.nextLine());
            room = sc.nextLine();
            start_day = solve1(sc.nextLine());
            end_day = solve1(sc.nextLine());
            service = sc.nextLong();
            dayin = day_distance(start_day, end_day);
            t ++ ;
            id = "KH" + String.format("%02d", t);
            long res = 0l;
            switch (room.charAt(0)) {
                case '1':
                    res = 25;
                    break;
                case '2':
                    res = 34;
                    break;
                case '3':
                    res = 50;
                    break;
                case '4':
                    res = 80;
                    break;
                default:
                    break;
            }
            cost = res * dayin + service;
        }

        @Override
        public int compareTo(guest a)
        {
            if (cost > a.cost) 
                return -1;
            return 1;
        }

        @Override
        public String toString()
        {
            return id +  " " + name +  " " + room + " " + dayin + " " + cost;
        }
    }
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));

        int n = sc.nextInt();
        t = 0;
        Vector<guest> v = new Vector<>();

        for(int i = 0; i < n; ++ i)
        {
            guest x = new guest();
            x.input(sc);
            v.add(x);
        }

        Collections.sort(v);

        for(guest x : v) 
            System.out.println(x);

    }
}
