package part4;

public class RegularEmployee extends Employee{
    public RegularEmployee(){
        super(); // 생략 가능
    }
    public RegularEmployee(String name, int age, String phone, String empDate, String dept, boolean marriage){
        // protected는 바람직하지 않음. 자식이라도 상태속성에 직접 접근하지 않게 하는 것이 바람직.
        super(name, age, phone, empDate, dept, marriage); // 생략 가능
    }
}
