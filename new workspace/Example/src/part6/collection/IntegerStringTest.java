package part6.collection;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123";
        int num = Integer.parseInt(str1);

        System.out.println(num+num);

        String str2 = String.valueOf(num);
        String str3 = ""+num;
        String str4 = num+""+num;

        System.out.println(str2+str3);
        System.out.println(str4);
    }
}
