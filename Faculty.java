// Faculty.java by Donato Zampini SB ID 114849209
public class Faculty extends Employee {
	private String hours;
	private int rank;
	public Faculty (String name, String address, String phoneNo,
			String eAddress, int age, double salary, MyDate date,
			String hours, int rank) {
		super(name, address, phoneNo, eAddress, age, salary, date);
		this.hours = hours;
		this.rank = rank;
	}
	public int salaryRange() {
		int years = 2023 - getDate().getYear();
		if(rank*years < 10)
			return 1;
		else if(rank*years >= 10 && rank*years < 20)
			return 2;
		else if(rank*years >= 20)
			return 3;
		else
			throw new IllegalArgumentException("Cannot start working after current year");
	}
	public String getHours() { return hours; }
	public String toString() {
		return "This faculty member is named "+getName();
	}
}
