import java.util.Scanner;
class salary_teacher
{
    String id, name, position;
    int basic_salary, coefficient, allowance, income;

    Scanner sc = new Scanner(System.in);

    void set()
    {
        id = sc.nextLine();
        name = sc.nextLine();
        basic_salary = sc.nextInt();
        if(id.charAt(0) == 'H' && id.charAt(1) == 'T')
            allowance = 2000000;
        else if(id.charAt(0) == 'H' && id.charAt(1) == 'P')
            allowance = 900000;
        else 
            allowance = 500000; 

        coefficient = Integer.parseInt(id.substring(2));

        income = basic_salary * coefficient + allowance;
    }

    void get()
    {
        System.out.printf("%s %s %d %d %d", id, name, coefficient, allowance, income);
    }
}
public class J04015 {
    public static void main(String[] args) {
        salary_teacher a = new salary_teacher();

        a.set();
        a.get();

    }
}
