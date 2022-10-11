package sec06;

public class ReturnDemo {

	public static void main(String[] args) {
		System.out.println("합 ( 1~10 ) : "+amugae(1,10));
		System.out.println("합 ( 10~100 ) : "+amugae(10, 100));
		System.out.println("합 ( 100~1000) : "+amugae(100,1000));
	}
	
	
	public static int amugae(int i1, int i2) {
		int sum=0;
		for(int i=i1;i<=i2;i++) {
			sum+=i;
		}
		return sum;
	}

}
