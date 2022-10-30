package quiz;

public class QuizProtocol {
	private static int WAITING = 0;
	private static int PROBLEM = 1;
	private static int ANSWER = 2;

	private static final int NOMPROBLEMS = 3;
	private int state = WAITING;
	private int currentProblem = 0;
	private String[] problems = { "김수빈네 강아지 이름은?", "김수빈네 조카 이름은?", "김수빈의 나이는?" };
	private String[] answers = { "김용구", "김로현", "25세" };

	// 문제 메서드
	public String process(String theInput) {
		String theOutput = null;
		state = PROBLEM;
		if (state == WAITING) {
			theOutput = "퀴즈를 시작합니다(y/n)";
			state = PROBLEM;
		} else if (state == PROBLEM) {
			if (theInput.equalsIgnoreCase("y")) {
				theOutput = problems[currentProblem];
				state = ANSWER;
			} else {
				state = WAITING;
				theOutput = "quit";
			}
		} else if (state == ANSWER) {
			if (theInput.equals(answers[currentProblem])) {
				theOutput = "정답입니다. 계속하시겠습니까?(y/n)";
				state = PROBLEM;
			} else {
				state = PROBLEM;
				theOutput = "오답입니다. 계속하시겠습니까?(y/n)";
			}
			currentProblem = (currentProblem + 1) % NOMPROBLEMS; // 나머지
		}
		return theOutput;
	}
}
