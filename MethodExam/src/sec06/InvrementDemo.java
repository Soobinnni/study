package sec06;

public class InvrementDemo {

		public static void main(String[] args) {			
			System.out.println("A의 값은 : " + PlusAB(10, 20));
		}
		
		// PlusAB 메서드 선언
		public static String PlusAB(int a, int b)
		{	
			String text = a+b+"안녕";
			return text; //리턴의 데이터 타입은 메서드를 선언할 떄의 리턴타입과 같아야 한다.
		}
	}
	

