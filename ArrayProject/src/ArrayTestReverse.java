
public class ArrayTestReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3,4,5,6,7}; //list배열의 크기는 7
		int[] reverseList; //공간만 마련
		
		System.out.println("메서드 호출 이전 리스트");
		for (int i : list) {
			System.out.print(i+", ");
		}
		
		//배열을 반환
		reverseList=reverse(list); //list의 참조변수가 가지고 있던 메모리시작주소를 reverse의 매개변수로 전달
		//return으로 새 배열 result의 매개변수가 reverseList 참조변수에 저장.
		//reverseList={7,6,5,4,3,2,1}
		System.out.println("\n\n메서드 호출 후 리스트");
		for (int i : reverseList) {
			System.out.print(i+", ");
		}
	}
	public static int[] reverse(int[] list) {
		//list참조변수는 인수인 list참조변수의 주소값을 가진 상태
		//새로운 result 배열이 생성. result배열의 크기는 list 배열의 크기와만 같다.
		int[] result = new int[list.length]; 
		for (int i = 0, j=result.length-1; i < list.length; i++,j--) {
			result[j]=list[i];
			//ex : j는 6에서 시작. i는 0에서 시작. result[6]=list[0]
			//1. result[6]=list[0];
			//2. result[5]=list[1];
			//3. result[4]=list[2];
			//4. result[3]=list[3];
			//5. result[2]=list[4];
			//6. result[1]=list[5];
			//1. result[0]=list[6];
		}
		return result;
	}

}
