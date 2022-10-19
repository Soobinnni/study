package Book;

public final class Poet extends Book implements OverdueDays {
	public Poet() {
		super();
	}
	public Poet(int number, String name, String author) {
		super(number, name, author);

	}

	@Override
	public int getLateFees(int days) {
		int lateFee; // 연체료
		lateFee = days*OverdueDays.POET_FEE;
		return lateFee;
	}

	@Override
	public String toString() {
		return "<Poet>\n["+super.toString()+"]";
	}

}
