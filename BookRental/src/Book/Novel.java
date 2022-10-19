package Book;

public final class Novel extends Book implements OverdueDays {
	public Novel() {
		super();
	}

	public Novel(int number, String name, String author) {
		super(number, name, author);
	}

	@Override
	public int getLateFees(int days) {
		int lateFee; // 연체료
		lateFee = days * OverdueDays.NOVEL_FEE;
		return lateFee;
	}

	@Override
	public String toString() {
		return "<Novel>\n[" + super.toString() + "]";
	}

}
