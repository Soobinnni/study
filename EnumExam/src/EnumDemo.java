
public class EnumDemo {

	public static void main(String[] args) {
		Gender2 whatGender=Gender2.FEMALE;
		System.out.println(whatGender);
		//whatGender=0;
		
		
		/*
		 * Direction whatDirection=Direction.EAST; if(whatDirection==Direction.EAST) {
		 * System.out.println("동쪽"); } else if (whatDirection) {
		 * 
		 * }
		 */

	}
	

}
enum Gender2{
	MALE, FEMALE
}
enum Direction{
	EAST, WEST, SOUTH, NORTH
}