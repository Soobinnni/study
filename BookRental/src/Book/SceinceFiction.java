package Book;

public final class SceinceFiction extends Book implements OverdueDays {
	public SceinceFiction() {
		super();
	}
	public SceinceFiction(int number, String name, String author) {
		super(number, name, author);

	}

	@Override
	public int getLateFees(int days) {
		int lateFee; // 연체료
		lateFee = days*OverdueDays.SCIENCE_FICTION_FEE;
		return lateFee;
	}

	@Override
	public String toString() {
		return "<ScienceFiction>\n["+super.toString()+"]";
	}

}
