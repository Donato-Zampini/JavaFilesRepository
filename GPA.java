// GPA.java by Donato Zampini SB ID 114849209
public class GPA {
	public static void main(String[] args) {
		String[] list = {"A","B","C","D","F"};
		System.out.print(gpaCalculator(list));
	}
	public static double gpaCalculator(String[] grades) {
		double t=0;
		for(String s:grades) {
			switch(s) {
			case "A":
				t += 4;
			break;
			case "A-":
				t += 3.67;
			break;
			case "B+":
				t += 3.33;
			break;
			case "B":
				t += 3.0;
			break;
			case "B-":
				t += 2.67;
			break;
			case "C+":
				t += 2.33;
			break;
			case "C":
				t += 2.0;
			break;
			case "C-":
				t += 1.67;
			break;
			case "D+":
				t += 1.33;
			break;
			case "D":
				t += 1.0;
			break;
			case "F":
			break;
			default:
				return -1;
			}
		}
		return t/grades.length;
	}
}
