// ArrayUtils.java by Donato Zampini SB ID 114849209

public class ArrayUtils {
	public static void main(String[] args) {
		int[] list = new int[100]; //Declare list
		list = randomArray(100,21); //Create random list
		print(list); //Callback to the print method
		 //Computes array average using arraySum method
		double avg = (double)arraySum(list)/(double)list.length;
		//Prints average
		System.out.println("\nThe average is: "+avg);
		//Finds first index of first instance of 12 and prints it
		System.out.println("The first instance of 12 is: "+contains(list,12));
		//Counts all elements which are multiples of 7 and prints amount
		System.out.println("There are "+countMultiplesOf(list,7)+
				" multiples of 7 in the list");
	}
	public static int[] randomArray(int size, int limit) {
		int[] done = new int[size];
		for(int i = 0; i < done.length; i++)
			done[i] = (int) (Math.random()*limit);
		return done;
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
	public static int arraySum(int[] list) {
		int sum = 0;
		for(int i = 0; i<list.length; i++)
			sum += list[i];
		return sum;
	}
	public static int contains(int[] list, int find) {
		for(int i = 0; i<list.length; i++)
			if(list[i]==find)
				return i;
		return -1;
	}
	public static int countMultiplesOf(int[] list, int num) {
		int count = 0;
		for(int i:list)
			if(i%num==0)
				count++;
		return count;
	}
}
