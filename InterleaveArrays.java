// InterleaveArrays.java by Donato Zampini SB ID 114849209

public class InterleaveArrays {
	public static void main(String[] args) {
		print(interleaveArrays(new int[] {1,3,5},new int[] {2,4,6}));
		System.out.println("");
		print(interleaveArrays(new int[] {10,20,30,40,50,60,70,80},new int[] {2,4,6,8}));
		System.out.println("");
		print(interleaveArrays(new int[] {1,3,5},new int[] {2,4,6,8,10}));
		System.out.println("");
		print(interleaveArrays(new int[] {10,8,6,4,2,0},new int[] {9,7,5,3,1}));
		System.out.println("");
		print(interleaveArrays(new int[] {11,9,7},new int[] {10,8,6,4,2,0}));
		System.out.println("");
	}
	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int[] mix = new int[array1.length+array2.length];
		if(array1.length>array2.length) {
			int x = 0, end = 0;
			for(int i = 0; i<array2.length*2;i+=2) {
				mix[i] = array1[x];
				x++;
				end = i + 2;
			}
			x = 1;
			for(int i = 0; i<array2.length; i++) {
				mix[x] = array2[i];
				x += 2;
			}
			x = end/2;
			for(int i = end; i<mix.length; i++) {
				mix[i] = array1[x];
				x++;
			}
		}
		else if(array1.length<array2.length) {
			int x = 0, end = 0;
			for(int i = 0; i<array1.length*2;i+=2) {
				mix[i] = array1[x];
				x++;
				end = i + 2;
			}
			x = 1;
			for(int i = 0; i<array1.length; i++) {
				mix[x] = array2[i];
				x += 2;
			}
			x = end/2;
			for(int i = end; i<mix.length; i++) {
				mix[i] = array2[x];
				x++;
			}
		}
		else if(array1.length==array2.length) {
			int x = 0;
			for(int i = 0; i<array1.length*2;i+=2) {
				mix[i] = array1[x];
				x++;
			}
			x = 0;
			for(int i = 1; i<array2.length*2;i+=2) {
				mix[i] = array2[x];
				x++;
			}
		}
		return mix;
	}
	public static void print(int[] list) {
		System.out.print("[");
		for(int i = 0; i<list.length; i++) {
			if(i < list.length-1)
				System.out.print(list[i]+" ");
			else
				System.out.print(list[i]+"]");
		}
	}
}
