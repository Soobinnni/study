package part6.lambda;

@FunctionalInterface
interface Ex{
    public abstract int max(int a, int b);
}
@FunctionalInterface
interface MathOperation{
    int operation(int x, int y);

    default void print(String x){
        System.out.println(x);
    }

    static void printy(String y){
        System.out.println(y);
    }

    private String format(String d){
        return d+"이다";
    }
}
public class LambdaEx {
    public static void main(String[] args) {
        Ex ex = new Ex(){
            @Override
            public int max(int a, int b){
                return a>b?a:b;
            }
        };
        Ex ex2 = (a, b) -> a>b?a:b;

        MathOperation mo = (x, y) -> x+y;
        System.out.println(mo.operation(1,2));
        mo.print("x");
        mo.toString();
    }
}