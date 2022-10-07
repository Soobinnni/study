package practiceProblem;

public class MultiplicationTable {

	public static void main(String[] args) {
		// 구구단 프로그램
		for (int j = 2; j < 10; j++) {
			System.out.print(" ==" + j + "단" + "=="+"\t\t");
			for (int i = 2; i < 10; i++) {
				System.out.print(j + " X " + "1" + " = " + (j * 1)+"\t\t\n");
				
			}
		}

	}
}