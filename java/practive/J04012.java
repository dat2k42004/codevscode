import java.util.Scanner;

class staff1
{
    String name, position, id;
    int basic_salary, work, allowance, income, reward;

    Scanner sc = new Scanner(System.in);

    void set()
    {
        name = sc.nextLine();
        basic_salary = Integer.parseInt(sc.nextLine());
        work = Integer.parseInt(sc.nextLine());
        position = sc.nextLine(); 
        id = "NV01";
        basic_salary = basic_salary * work;
        if (work >= 25) 
            reward = basic_salary / 5;
        else if (work >= 22)
            reward = basic_salary / 10;
        else
            reward = 0;

        if (position.compareTo("GD") == 0)
            allowance = 250000;
        else if(position.compareTo("PGD") == 0)
            allowance = 200000;
        else if(position.compareTo("TP") == 0)
            allowance = 180000;
        else 
            allowance = 150000;

        income = basic_salary + reward + allowance;
    }

    void get()
    {
        System.out.printf("%s %s %d %d %d %d", id, name, basic_salary, reward, allowance, income);
    }
}
public class J04012 {
    public static void main(String[] args) {
        staff1 a = new staff1();

        a.set();
        a.get();


    }
}
