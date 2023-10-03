// LargestInArray.java by Donato Zampini SB ID 114849209

public class LargestInArray {
	public static void main(String[] args) {
		int[] ints = {5,4,3,2,1,6,7,8,9,10,30,28,25,26};
		System.out.print(findLargest(ints));
	}
	public static int findLargest(int[] list) {
		return findLargest(list, 0);
	}
	public static int findLargest(int[] list, int currentIndex) {
		return findLargest(list, currentIndex, 0);
	}
	public static int findLargest(int[] list, int currentIndex, int max) {
		if(currentIndex == list.length-1)
			return max(max, list[currentIndex]);
		else {
			max = max(max, list[currentIndex]);
			return findLargest(list, currentIndex+1, max);
		}
	}
	public static int max(int a, int b) {
		if(a > b) return a;
		else return b;
	}
}
