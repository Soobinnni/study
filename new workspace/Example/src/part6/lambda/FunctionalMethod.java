package part6.lambda;

import java.util.*;

class IntegerUtils{
    public static int stringToInt(String s){
        return Integer.parseInt(s);
    }
}
class StringUtils{
    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}

interface Converter<T, U>{
    U converter(T s);
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

interface PersonFactory{
    Person create(String name, int age);
}
public class FunctionalMethod {
    public static void main(String[] args){
        // 정적 메소드 참조
        Converter<String, Integer> intConverter = IntegerUtils::stringToInt;
        Integer intResult = intConverter.converter("123");
        System.out.println(intResult);

        // 인스턴스메서드 참조
        StringUtils stringUtils = new StringUtils();
        Converter<String, String> strConverter = stringUtils::reverse;
        String strResult = strConverter.converter("가나다라마바사");
        System.out.println(strResult);

        // 특정 객체의 인스턴스 메서드 참조(String클래스의 compareTo 메서드 참조)
        List<String> names= Arrays.asList("John", "Jane", "Doe");
        Collections.sort(names, String::compareTo);
        System.out.println(names);

        // 생성자 참조
        PersonFactory pf = Person::new;
        Person p = pf.create("Kim", 27);

        // 람다식 사용
        PersonFactory pfLambda = (name,age) -> new Person(name, age);
        Person pLambda = pfLambda.create("Kim", 27);


    }
}
