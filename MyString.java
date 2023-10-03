// MyString.java by Donato Zampini SB ID 114849209

public class MyString {
	private char[] chars;
	public MyString(char[] chars) {
		this.chars = chars;
	}
	public char charAt(int index) {
		if(index < 0 || index >= chars.length)
			throw new IndexOutOfBoundsException();
		return chars[index];
	}
	public int length() {
		return chars.length;
	}
	public MyString substring(int begin, int end) {
		char[] c = new char[end-begin];
		for(int i = begin; i < end; i++)
			c[i-begin] = chars[i];
		return new MyString(c);
	}
	public MyString toLowerCase() {
		char[] c = new char[chars.length];
		for(int i = 0; i < c.length; i++)
			c[i] = Character.toLowerCase(chars[i]);
		return new MyString(c);
	}
	public boolean equals(MyString s) {
		if(s.length() != this.length())
			return false;
		else
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == this.charAt(i))
					continue;
				else
					return false;
			}
		return true;
	}
	public static MyString valueOf(int i) {
		int count = 0;
		String s = "";
		int temp = i;
		while(temp >= 1) {
			temp /= 10;
			count++;
		}
		temp = i;
		char[] c = new char[count];
		for(int x = c.length-1; x >= 0; x--) {
			s += "" + (int)(temp%10);
			temp /= 10;
		}
		for(int x = c.length-1; x >= 0; x--) {
			c[(c.length-1)-x] = s.charAt(x);
		}
		return new MyString(c);
	}
	public MyString[] split(MyString s) {
		int len = 1;
		for(int i = 0; i < this.length() - s.length(); i++)
			if(this.substring(i, i+s.length()).equals(s))
				len++;
		MyString[] dif = new MyString[len];
		int last = 0, count = 0;
		for(int x = 0; x < chars.length; x++) {
			if(this.substring(x, x+s.length()).equals(s)) {
				dif[count] = this.substring(last, x);
				this.substring(last, x).print();
				last = x + s.length();
				count++;
			}
		}
		dif[dif.length-1] = this.substring(last, chars.length);
		return dif;
	}
	public void print() {
		for(int i = 0; i < chars.length; i++)
			System.out.print(chars[i]);
	}
	public static void main(String[] args) {
		char[] a = {'a','C','e'};
		char[] b = {'a','b','C','D'};
		char[] c = {'a','b','C','D'};
		char[] d = {'a'};
		MyString testA = new MyString(a);
		MyString testB = new MyString(b);
		MyString testC = new MyString(c);
		MyString testD = new MyString(d);
		System.out.println(testA.charAt(2));
		System.out.println(testB.length());
		testC.substring(0,1).print();
		System.out.println();
		testB.substring(1,3).print();
		System.out.println();
		testB.toLowerCase().print();
		System.out.println();
		System.out.println(testA.equals(testC));
		System.out.print(testB.equals(testC));
		System.out.println();
		valueOf(100).print();
		System.out.println();
		valueOf(918273645).print();
		System.out.println();
		MyString[] who = testA.split(testD);
		for(int i = 0; i < who.length; i++) {
			who[i].print();
		}
	}
}