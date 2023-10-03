// Student.java by Donato Zampini SB ID 114849209

public class Student extends Person{
	private String status;
	final private String FRE = "freshman";
	final private String SOF = "sophomore";
	final private String JUN = "junior";
	final private String SEN = "senior";
	public Student(String name, String address, String phoneNo,
			String eAddress, int age, int status) {
		super(name, address, phoneNo, eAddress, age);
		if(status == 1)
			this.status = FRE;
		else if (status == 2)
			this.status = SOF;
		else if (status == 3)
			this.status = JUN;
		else if (status == 4)
			this.status = SEN;
		else
			throw new IllegalArgumentException("Status must be int between 1-4, inclusive");
	}
	public String getStatus() { return status; }
	public String toString() {
		return "This is a student named "+getName();
	}
}
