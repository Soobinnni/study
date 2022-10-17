
public class ArrayTestPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] array= {1, 10}; //array.length는 2
		
		System.out.println("swap 메서드 호출 이전");
		System.out.println("배열의 인수값 : "+array[0]+", "+array[1]);
		swap(array[0], array[1]);
		System.out.println("swap메서드 호출 이후 ");
		System.out.println("배열의 인수값 : "+array[0]+", "+array[1]);
		
		//배열에서 처음 2개 교체
		System.out.println("swapFirstTwoInArray 메서드호출이전");
		System.out.println("배열의 인수 값 : "+array[0]+", "+array[1]);
		swapFirstTwoInArray(array);
		System.out.println("swapFirstTwoInArray 메서드호출이후");
		System.out.println();
		System.out.println("배열의 인수 값 : "+array[0]+", "+array[1]);
		

	}
	
	public static void swapFirstTwoInArray(int[] arrayPass) {
		int temp;
		//자료형 temp는 arrayPass [0]과 [1]값을 서로 바꿔주는 변수역할
		temp=arrayPass[0];
		arrayPass[0]=arrayPass[1];
		arrayPass[1]=temp;	
	}
	public static void swap(int i, int j) {
		int temp;
		//자료형 변수 temp는 i 참조변수의 주소값과 j 참조변수의 주소값을 서로 바꿔줌
		temp=i; //temp=1
		i=j; //i=10
		j=temp; //j=1
	}


}
