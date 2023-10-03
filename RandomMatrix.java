// RandomMatrix.java by Donato Zampini SB ID 114849209

public class RandomMatrix {
	public static void main(String[] args) {
		int[][] list = new int[8][8];
		for(int i = 0; i < 8; i++)
			for(int j = 0; j < 8; j++)
				list[i][j] = (int)(Math.floor(Math.random()+0.5));
		print(list);
		System.out.print(check(list));
	}
	public static void print(int[][] list) {
		for(int i = 0; i<list.length; i++) {
			for(int j = 0; j<list[i].length; j++) {
				if(j<list[i].length-1)
					System.out.print(list[i][j]);
				else
					System.out.println(list[i][j]);
			}
		}
	}
	public static String check(int[][] list) {
		int sum = 0;
		String s = "";
		for(int i = 0; i<list.length; i++) {
			for(int j = 0; j<list[i].length; j++) {
				sum += list[i][j];
			}
			if (sum == 0)
				s += "Row "+(i+1)+" has all 0s\n";
			else if (sum == 8)
				s += "Row "+(i+1)+" has all 1s\n";
			sum = 0;
		}
		sum = 0;
		for(int i = 0; i<list.length; i++) {
			for(int j = 0; j<list[i].length; j++) {
				sum += list[j][i];
			}
			if (sum == 0)
				s += "Column "+(i+1)+" has all 0s\n";
			else if (sum == 8)
				s += "Column "+(i+1)+" has all 1s\n";
			sum = 0;
		}
		sum = 0;
		for(int i = 0; i<list.length; i++) {
			sum += list[i][i];
		}
		if (sum == 0 || sum == 8)
			s += "The main diagonal has all "+sum/8+"s\n";
		sum = 0;
		for(int i = 7; i>-1; i--) {
			sum += list[i][i];
		}
		if (sum == 0 || sum == 8)
			s += "The minor diagonal has all "+sum/8+"s\n";
		return s;
	}
}
