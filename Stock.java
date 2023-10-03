// Stock.java by Donato Zampini SB ID 114849209

public class Stock {
	private String symbol, name;
	private double pPrice, cPrice;
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getSymbol() {
		return symbol;
	}
	public double getPreviousClosingPrice() {
		return pPrice;
	}
	public double getCurrentPrice() {
		return cPrice;
	}
	public void setPreviousClosingPrice(double price) {
		pPrice = price;
	}
	public void setCurrentPrice(double price) {
		cPrice = price;
	}
	public double changePercent() {
		double pcnt = cPrice - pPrice;
		pcnt /= pPrice;
		return pcnt * 100;
	}
	public static void main(String[] args) {
		Stock object = new Stock("GOOG", "Google Inc.");
		object.setPreviousClosingPrice(1000);
		object.setCurrentPrice(2000);
		System.out.printf("Percent change for "+object.getSymbol()+": %.2f" + "%%", object.changePercent());
		System.out.println();
		Stock amazon = new Stock("AMZN", "Amazon.com, Inc.");
		amazon.setPreviousClosingPrice(103.29);
		amazon.setCurrentPrice(102.95);
		System.out.printf("Percent change for "+amazon.getSymbol()+": %.2f" + "%%", amazon.changePercent());
		System.out.println();
		Stock meta = new Stock("META", "Meta Platforms Inc");
		meta.setPreviousClosingPrice(211.94);
		meta.setCurrentPrice(209.53);
		System.out.printf("Percent change for "+meta.getSymbol()+": %.2f" + "%%", meta.changePercent());
	}
}