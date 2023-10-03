// HourlyEmployee.java by Donato Zampini SB ID 114849209

public class HourlyEmployee extends Employee {
	private double hours;
	private double wage;
	public HourlyEmployee(String name, String ID) {
		super(name, ID);
	}
	public HourlyEmployee(String name, String ID, double hours, double wage) {
		super(name, ID);
		this.hours = hours;
		this.wage = wage;
	}
	public double earnings() {
		return hours * wage;
	}
	public String toString() {
		String read = super.toString();
		return read += "\nEarnings: $"+this.earnings()+" this week";
	}
	public static void main(String[] args) {
		Employee john = new Employee("John","1234");
		HourlyEmployee deb = new HourlyEmployee("Deborah","4321",40,50);
		System.out.println(john);
		System.out.println(deb);
	}
}
