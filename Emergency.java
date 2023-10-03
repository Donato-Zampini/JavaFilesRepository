// Emergency.java

public class Emergency {
	public static void main(String[] args) {
		System.out.println(emergency("Hello, my name is John Smith. I need to report a fire. Please come to 100 Circle Road.")); // expecting "a fire at 100 Circle Road reported by John Smith"
		System.out.println(emergency("Hello, my name is Mary Smith. I need to report a car accident. Please come to 2635 Main Street.")); // expecting "a car accident at 2635 Main Street reported by Mary Smith"     
		System.out.println(emergency("Hello, my name is Joe Bell. I need to report a robbery. Please come to 3595 Oakwood Avenue.")); // expecting "a robbery at 3595 Oakwood Avenue reported by Joe M Bell"
	}
	public static String emergency(String s) {
		String result = "";
		int begin = s.indexOf(" is ");
		int end = s.indexOf(". I need to report ");
		String name = s.substring((begin+4), end);
		begin = end + 19;
		end = s.indexOf(". Please come to ");
		String event = s.substring(begin,end);
		begin = end + 17;
		String where = s.substring(begin, s.length()-1);
		result = String.format("%s at %s reported by %s", event, where, name);
		return result;
	}
}
