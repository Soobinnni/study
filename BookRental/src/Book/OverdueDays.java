package Book;

	
public interface OverdueDays {
	
	int NOVEL_FEE=300;
	int POET_FEE=200;
	int SCIENCE_FICTION_FEE=600;
	
	int getLateFees(int days); //days 는 연체 일수
}
