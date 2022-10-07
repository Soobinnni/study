package practiceProblem;

public class MultiplicationTable {

	public static void main(String[] args) {
		// 구구단 프로그램

		for (int i = 2; i < 10; i++) {
			System.out.print(i + "단\t");
		}
		System.out.println();

		for (int k = 1; k < 10; k++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + k + "=" + (j * k) + "\t");
				switch (j) {
				case 9:
					System.out.println();
				}
			}
		}
	}
}