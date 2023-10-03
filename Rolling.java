// Rolling.java Donato Zampini SB ID 114849209

public class Rolling {
	public static void main(String[] args) {
		int a, b;
		a = roll();
		b = roll();
		System.out.println("The first die comes up "+a);
		System.out.println("The second die comes up "+b);
		System.out.print("Your total roll is "+(a+b));
	}
	public static int roll() {
		return (int) (Math.random()*6.0 + 1);
	}
}
