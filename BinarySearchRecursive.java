// BinarySearchRecursive.java by Donato Zampini SB ID 114849209

public class BinarySearchRecursive {
	public static void main(String[] args) {
		int[] ints = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.print(binarySearch(ints, 7));
	}
	public static int binarySearch(int[] list, int key) {
		return binarySearch(list, key, 0, list.length);
	}
	public static int binarySearch(int[] list, int key, int low, int high) {
		if(low > high) {
			return -1;
		}
		else {
			int mid = (low + high) / 2;
			if(mid >= list.length)
				return -1;
			if(key == list[mid])
				return mid;
			else if(key < list[mid])
				return binarySearch(list, key, low, mid-1);
			else
				return binarySearch(list,key,mid+1,high);
		}
	}
}
