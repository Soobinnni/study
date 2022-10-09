package practiceProblem;

public class MultiplicationTable {

	public static void main(String[] args) {
		// 구구단 프로그램

		//1. 가로로 출력하기
		for (int i = 2; i < 10; i++) {
			System.out.print("=== "+i + "단 ===\t\t");
		}
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		//2. 세로로 출력하기
		for (int i = 2; i < 10; i++) {
			System.out.println("\n=== "+i + "단 ===");
			for (int j = 1; j < 10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
}