package part4;

public class Employee {
    private String name;
    private int age; // 자식 접근 가능
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;

    public Employee(){
        super(); // 상위 클래스의 생성자를 호출(Object): 자식 객체가 생성되려면 먼저 상위 클래스의 생성자를 호출하여
                //                                  상위 클래스의 인스턴스를 먼저 메모리에 만들고, 자식 클래스가 생성된다.
    }

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmpDate() {
        return empDate;
    }

    public void setEmpDate(String empDate) {
        this.empDate = empDate;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
