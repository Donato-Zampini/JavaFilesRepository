// Test.java by Donato Zampini SB ID 114849209

public class Test {
	public static void main(String[] args) {
		GeometricObject[] arr = new GeometricObject[10];
		arr[0] = new Square();
		arr[1] = new Square(2);
		arr[2] = new Square(3);
		arr[3] = new Square(4);
		arr[4] = new Square(3);
		arr[5] = new Square();
		arr[6] = new Square(7);
		arr[7] = new Square(8);
		arr[8] = new Square(9);
		arr[9] = new Square(8);
		System.out.println(arr[0].compareTo(arr[1]));
		System.out.println(arr[1].compareTo(arr[0]));
		System.out.println(arr[2].compareTo(arr[4]));
		arr[4] = arr[3].clone();
		System.out.println(arr[4].compareTo(arr[3]));
		GeometricObject g = (GeometricObject) max(arr[0],arr[1]);
		for(int i = 2; i < 10; i++)
			g = max(g,arr[i]);
		System.out.println(g);
		GeometricObject[] arr1 = new GeometricObject[10];
		arr1[0] = new Rectangle(1,1);
		arr1[1] = new Rectangle(1,2);
		arr1[2] = new Rectangle(2,1);
		arr1[3] = new Rectangle(2,2);
		arr1[4] = new Rectangle(1,3);
		arr1[5] = new Rectangle(3,1);
		arr1[6] = new Rectangle(2,3);
		arr1[7] = new Rectangle(3,2);
		arr1[8] = new Rectangle(3,3);
		arr1[9] = new Rectangle(4,4);
		GeometricObject g1 = (GeometricObject) max(arr1[0],arr1[1]);
		for(int i = 2; i < 10; i++)
			g1 = max(g1,arr1[i]);
		System.out.println(g1);
		arr1[1] = arr1[0].clone();
		arr1[2] = arr1[1].clone();
		System.out.println(arr1[0].compareTo(arr1[1]));
		System.out.println(arr1[1].compareTo(arr1[2]));
		GeometricObject[] arr2 = new GeometricObject[10];
		arr2[0] = new Circle(1);
		arr2[1] = new Circle(4);
		arr2[2] = new Circle(5);
		arr2[3] = new Circle(8);
		arr2[4] = new Circle(7);
		arr2[5] = new Circle(14);
		arr2[6] = new Circle(13);
		arr2[7] = new Circle(12);
		arr2[8] = new Circle(11);
		arr2[9] = new Circle(10);
		GeometricObject g2 = (GeometricObject) max(arr2[0],arr2[1]);
		for(int i = 2; i < 10; i++)
			g2 = max(g2,arr2[i]);
		System.out.println(g2);
		arr2[0] = arr2[1].clone();
		arr2[2] = arr2[0].clone();
		System.out.println(arr2[0].compareTo(arr2[1]));
		System.out.println(arr2[1].compareTo(arr2[2]));
	}
	public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
		if(g1.compareTo(g2) > 0)
			return g1;
		else
			return g2;
	}
}
