import com.example.object.*;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Book b = new Book("제목", 1000, "한빛", "김수빈", 10, "32532");

        System.out.println(b);

        b.setTitle("새로 변경된 제목");
        System.out.println(b);
        printPersonArr(getPersonArr());
    }

    public static Person[] getPersonArr(){
        Person[] p = new Person[4];
        for(int i = 0;i<p.length;i++){
            System.out.println("이름 입력");
            String name = s.nextLine();
            System.out.println("나이 입력");
            int age = s.nextInt();
            s.nextLine();
            System.out.println("휴대전화번호 입력");
            String phone = s.nextLine();

            p[i] = new Person(name, age, phone);
        }
        s.close();
        return p;
    }
    public static void printPersonArr(Person[] p){
        for(Person ps:p){
            System.out.println(ps);
        }
    }
}