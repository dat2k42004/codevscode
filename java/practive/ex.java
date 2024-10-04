import java.util.LinkedHashMap;

public class ex {
    public static void main(String[] args) {
        LinkedHashMap <String, Integer> m = new LinkedHashMap<>();
        m.put("dat", 5);
        m.put("giang", 5);
        m.put("dat", 6);
        m.put("hong", 7);
        for (String x : m.keySet())
            System.out.println(x + " " + m.get(x));
    }
}
