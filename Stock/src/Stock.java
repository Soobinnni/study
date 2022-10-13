
public class Stock {
	private String name;//종목명
	private int proviusClosingPrice;// 어제의 종가
	private int currentPrice; //종목의 현재가
	
	public Stock() {
		this("가산전자", 1000000, 900000);
	}
	public Stock(String name, int proviusClosingPrice, int currentPrice) {
		this.name = name;
		this.proviusClosingPrice = proviusClosingPrice;
		this.currentPrice = currentPrice;
	}
	//이름 반환
	public String getName() {
		return name;
	}
	//이름 변경
	public void setName(String name) {
		this.name = name;
	}
	//어제의 종가 반환
	public int getProviusClosingPrice() {
		return proviusClosingPrice;
	}
	//어제의 종가 변경
	public void setProviusClosingPrice(int proviusClosingPrice) {
		this.proviusClosingPrice = proviusClosingPrice;
	}
	//오늘의 종가 반환
	public int getCurrentPrice() {
		return currentPrice;
	}
	//오늘의 종가 변경
	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
	}
	public double getChangePercent() {
		return ((double)proviusClosingPrice/currentPrice)*100;
	}
	
	@Override
	public String toString() {
		return "주식 [종목명(회사명)=" + getName() + ", 어제의 종가=" + getProviusClosingPrice()
				+ ", 종목의 현재가=" + getCurrentPrice() + " 주가변동률 : "+getChangePercent()+"]";
	}
	

}
