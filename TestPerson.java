// TestPerson.java by Donato Zampini SB ID 114849209

public class TestPerson {
	public static void main(String[] args) {
		Person a = new Person("Alex", "1010 Wins St",
				"(100) 200-3000", "alex@gmail.com", 21);
		Person b = new Person("Betty Grimes", "1061 Bly Ave",
				"(789) 400-3000", "brimes@yahoo.com", 27);
		Student c = new Student("Calogero DiGesu", "880 Club Ct",
				"(800) 888-8888", "cdigesu@stonybrook.edu", 17, 1);
		Student d = new Student("Donato Zampini", "1795 Circle Rd",
				"(516) 946-8428", "dzampini@stonybrook.edu", 19, 2);
		Employee e = new Employee("Earl Jones", "899 Cooper St", "(888) 999-1111",
				"ejones@company.com", 35, 100000, new MyDate(2, 3, 2013));
		Employee f = new Employee("Frank Abraham", "2010 Broadway", "(878) 222-1234",
				"fabraham@company.com", 55, 140000, new MyDate(11, 8, 1993));
		Faculty g = new Faculty("Giuseppe Abruzzo", "1700 Strange St", "(123) 456-7891",
				"giusabruz@concrete.org", 43, 90000, new MyDate(1, 1, 2000), "M-F 9-5", 2);
		Faculty h = new Faculty("Happy Gilmore", "169 Franklin Sq", "(321) 654-1098",
				"bestgolfer@gmail.com", 31, 1000000, new MyDate(5, 23, 2015), "M-T, Th-S 8-12", 1);
		Staff i = new Staff("Ingrid", "n/a", "(756) 978-1091", "ingrid@crazy.com",
				70, 200000, new MyDate(4, 20, 1975), "boss");
		Staff j = new Staff("Janice Pennyworth", "1100 Wayne Drive", "(225) 522-8626",
				"jpennyworth@batman.com", 20, 10000, new MyDate(4,5,2023), "trainee");
		System.out.println(a.toString()+"\n");
		System.out.println(b.toString()+"\n");
		System.out.println(c.toString()+"\n");
		System.out.println(d.toString()+"\n");
		System.out.println(e.toString()+"\n");
		System.out.println(f.toString()+"\n");
		System.out.println(g.toString()+"\n");
		System.out.println(h.toString()+"\n");
		System.out.println(i.toString()+"\n");
		System.out.println(j.toString()+"\n");
	}
}
