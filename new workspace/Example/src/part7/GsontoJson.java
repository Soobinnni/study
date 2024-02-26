package part7;

import com.google.gson.Gson;

class Address{
    private String city;
    private String country;

    public Address() {
    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
class Member{
    private String name;
    private int age;
    private String email;
    private Address address;

    public Member() {
    }

    public Member(String name, int age, String email, Address address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
public class GsontoJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동", 30, "example.com", new Address("서울", "대한민국"));
        Gson gson = new Gson();

        String jsonMember = gson.toJson(mvo);
        System.out.println(jsonMember);

        Member memberFromJson = gson.fromJson("{\"name\":\"홍길동\",\"age\":30,\"email\":\"example.com\",\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}", Member.class);
        System.out.println(memberFromJson);

    }
}
