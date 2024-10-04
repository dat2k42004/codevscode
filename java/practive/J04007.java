import java.util.Scanner;

class staff
{
    String name, gender, birthday, address, tax, date, id;

    Scanner sc = new Scanner(System.in);

    void set()
    {   
        name = sc.nextLine();
        gender = sc.nextLine();
        birthday = sc.nextLine();
        address = sc.nextLine();
        tax = sc.nextLine();
        date = sc.nextLine();
        id = "00001";
    }

    void get()
    {
        System.out.printf("%s %s %s %s %s %s %s", id, name, gender, birthday, address, tax, date);
    }
}
public class J04007 {
    public static void main(String[] args) {
        staff a = new staff();
        a.set();
        a.get();
    }
}

