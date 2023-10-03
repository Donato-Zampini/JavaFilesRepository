// SelectionSortRecursive.java by Donato Zampini SB ID 114849209

public class SelectionSortRecursive {
	public static void main(String[] args) {
		int[] ints = {5,3,4,2,1,10,13,9,8,20,30,20};
		selectionSort(ints);
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i]+" ");
	}
	public static void selectionSort(int[] list) {
		selectionSort(list, 0, list.length);
	}
	public static void selectionSort(int[] list, int low, int high) {
		if(low < high) {
			int mindex = low;
			int min = list[low];
			for(int i = low+1; i < high; i++)
				if(list[i] < min) {
					min = list[i];
					mindex = i;
				}
			int temp = list[low];
			list[low] = min;
			list[mindex] = temp;
			selectionSort(list, low+1, high);
		}
	}
}
