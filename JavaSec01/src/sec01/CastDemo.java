package sec01;

public class CastDemo {

	public static void main(String[] args) {
		int i;
		double d;
	
		
		i=7/4;
		System.out.println(i);  //int는 정수만 인식하므로 정수 나누기 정수는 1로 인식//
		
		d=7/4;
		System.out.println(d); 
		
		d=7/(double)4;
		System.out.println(d);
		
		/*
		 * i=7/(double)4; --타입 불일치 오류 발생. i의 타입은 int이므로 실수 (double)4의 값이 나타날 수 없다.
		 */
		
	}

}
