package kr.excel.example.util;

import kr.excel.example.vo.Member;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class InputData {
    private InputData(){}
    private static Scanner scanner = new Scanner(System.in);

    public static List<Member> addMember(){
        List<Member> members = new ArrayList<>();
        while(true){
            Member member = inputMemberInfo();
            if(member == null) break;
            members.add(member);
        }
        scanner.close();

        return members;
    }
    private static Member inputMemberInfo(){
        System.out.print("이름을 입력하세요:");
        String name = scanner.nextLine();
        if (name.equals("quit")) {
            return null;
        }
        System.out.print("나이를 입력하세요:");
        int age = scanner.nextInt();
        scanner.nextLine(); // 개행문자 제거
        System.out.print("생년월일을 입력하세요:");
        String birthdate = scanner.nextLine();
        System.out.print("전화번호를 입력하세요:");
        String phone = scanner.nextLine();
        System.out.print("주소를 입력하세요:");
        String address = scanner.nextLine();
        System.out.print("결혼여부를 입력하세요 (true/false):");
        boolean isMarried = scanner.nextBoolean();
        scanner.nextLine(); // 개행문자 제거

        return new Member(name, age, birthdate, phone, address, isMarried);
    }
}
