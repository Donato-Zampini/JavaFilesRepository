// Staff.java by Donato Zampini SB ID 114849209

public class Staff extends Employee {
	private String title;
	public Staff(String name, String address, String phoneNo,
			String eAddress, int age, double salary, MyDate date,
			String title) {
		super(name, address, phoneNo, eAddress, age, salary, date);
		this.title = title;
	}
	public String getTitle() { return title; }
	public String toString() {
		return "This staff member is named "+getName();
	}
}
