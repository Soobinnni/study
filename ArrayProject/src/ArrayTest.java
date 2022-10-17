
public class ArrayTest {

	public static void main(String[] args) {
		int x=1;
		int[] y=new int[10];
		
		arrayTest(x, y);
		
		System.out.println(x);
		System.out.println(y[0]);
		
		
	}
	public static void arrayTest(int n, int[]m) {
		System.out.println(n);
		n=100;
		m[0]=777;
	}
}
