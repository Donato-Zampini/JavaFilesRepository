// Person.java by Donato Zampini SB ID 114849209
public class Person {
	private String name, address, phoneNo, eAddress;
	private int age;
	public Person(String name, String address, String phoneNo,
			String eAddress, int age) {
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.eAddress = eAddress;
		this.age = age;
	}
	public int getAge() { return age; }
	public String getName() { return name; }
	public String getAddress() { return address; }
	public String getPhoneNo() { return phoneNo; }
	public String getEAddress() { return eAddress; }
	public String toString() { return "This person is named "+name; }
}
