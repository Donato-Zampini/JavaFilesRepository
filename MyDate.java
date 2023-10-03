// MyDate.java by Donato Zampini SB ID 114849209

public class MyDate {
	private int year, day, month;
	public MyDate(int month, int day, int year) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() { return year; }
	public String toString() {
		return month + "/" + day + "/" + year;
	}
}
