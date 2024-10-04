import java.util.Scanner;

class student1
{
    String name, birthday, id, Class;
    float gpa;

    Scanner sc = new Scanner(System.in);

    void set()
    {
        name = sc.nextLine();
        Class = sc.next();
        birthday = sc.next();
        gpa = sc.nextFloat();
        id = "B20DCCN001";
        if (birthday.charAt(1) == '/')
        {
            birthday = "0" + birthday;
        }
        if(birthday.charAt(4) == '/')
        {
            birthday = birthday.substring(0, 3) + "0" + birthday.substring(3);
        }
    }

    void get()
    {
        System.out.printf("%s %s %s %s %.2f", id, name, Class, birthday, gpa);
    }
}
public class J04006 {
    public static void main(String[] args) {
        student1 a = new student1();

        a.set();
        a.get();

        
    }
}
