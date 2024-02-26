package part6.lambda;

@FunctionalInterface
interface StringOperation{
    String apply(String s);
}
public class LambdaApply {
    public static void main(String[] args) {
//        StringOperation toUpperCase = s -> s.toUpperCase();

        StringOperation toUpperCase = getStringOperateToUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();

        String input = "Lambda Expressions";
        System.out.println(processString(input, toUpperCase));
        System.out.println(processString(input, toLowerCase));
    }

    public static String processString(String input, StringOperation operation){
        return operation.apply(input);
    }

    public static StringOperation getStringOperateToUpperCase(){
        StringOperation toUpperCase = s -> s.toUpperCase();
        return toUpperCase;
    }
}
