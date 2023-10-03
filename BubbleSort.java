// BubbleSort.java by Donato Zampini SB ID 114849209

public class BubbleSort {
	public static void main(String[] args) {
		double[] list = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
		bubbleSort(list);
		print(list);
	}
	public static void bubbleSort(double[] list) {
		boolean changed = true;
		double temp = 0;
		do {
			changed = false;
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					changed = true;
				}
			}
		} while (changed);
	}
	public static void print(double[] list) {
		System.out.print("[");
		for(int i = 0; i<list.length; i++) {
			if(i < list.length-1)
				System.out.print(list[i]+" ");
			else
				System.out.print(list[i]+"]");
		}
	}

}