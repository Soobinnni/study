package sec01;

public class CharBoolDemo {

	public static void main(String[] args) {
		char ga1='가';
		char ga2='\uac00';
		// '역슬래쉬u+16진수' 즉 유니코드로 문자를 표현 //
		
		boolean cham=true;
		boolean geojit=false;
		
		System.out.println(ga1);
		System.out.println((int)ga1); //변수 ga1을 int 타입으로 변환시켜 정수로 나타낸다//
		System.out.println(ga2);
		System.out.println(++ga2);
		System.out.println(cham+"가 아니면 "+geojit+"입니다.");
	}

}
