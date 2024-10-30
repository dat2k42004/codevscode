import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
public class J99210 {
    static class student {
        String id, name, gender, clas, email, phone, size;
        student (String id, String name, String gender, String clas, String email, String phone) {
            this.id = id;
            this.name = name;
            this.gender = "";
            for (int i = 0; i < gender.length(); i++) {
                this.gender += Character.toString(gender.charAt(i)).toUpperCase();
            }
            this.clas = clas;
            this.email = email;
            size = "";
            this.phone = phone;
        }
        @Override public String toString() {
            return id + " " + name + " " + clas + " " + email + " " + phone;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<student> students = new ArrayList<>();
        for (int i = 0; i < n; ++ i) {
            students.add(new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(students, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.id.compareTo(o2.id);
            }
        });
        sc.close();
        sc = new Scanner(new File("DANGKY.in"));
        for (int i = 0; i < n; ++ i) {
            String id, size;
            id = sc.next();
            size = sc.next();
            for (int j = 0; j < n; ++ j) {
                if (students.get(j).id.equals(id)) {
                    students.get(j).size = size;
                    break;
                }
            }
        }
        sc.close();
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0) {
            String x = sc.next();
            String gender = "";
            for (int i = 0; i < x.length(); i++) {
                gender += Character.toString(x.charAt(i)).toUpperCase();
            }
            String size = sc.next();
            System.out.printf("DANH SACH SINH VIEN %s DANG KY SIZE %s\n", gender, size);
            for (int i = 0; i < n; ++ i) {
                if (students.get(i).gender.equals(gender) && students.get(i).size.equals(size)) {
                    System.out.println(students.get(i));
                }
            }
        }
    }
}