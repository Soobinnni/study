package part4;

public class EmployeeEx {

    public static void main(String[] args) {
        // 일반 사원 하나의 객체를 생성하고 데이터를 저장 후 출력
        RegularEmployee re = new RegularEmployee();
        re.setName("kim");
//        re.age = 23; //protecteded라서 접근 가능
        re.setAge(23);
        re.setDept("영업부");
        re.setPhone("010-3333-2222");
        re.setMarriage(false);
        re.setEmpDate("2023-04-23");
        System.out.println(re.toString());


        RegularEmployee ree = new RegularEmployee("홍길동", 33, "010-3333-4444", "2023-03-23", "홍보부", true);
        System.out.println(ree.toString());
    }
}
