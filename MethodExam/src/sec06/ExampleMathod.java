package sec06;

public class ExampleMathod {

		public static void main(String[] args) {			
		printScore(99);
		printScore(120);
		}
		
		public static void printScore(int score) {
			
			if((score>=0)&&(score<=100)) {
				System.out.println("옳은 점수입니다.");
			} else {
				System.out.println("옳지 못한 점수입니다.");
			}
			return;
		}
		
	}
	

