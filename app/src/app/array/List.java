package app.array;

public class List {
	
	public static void reverse(int array[]) {

		int a = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];

			System.out.println( array[i]);
		}

		array[array.length - 1] = a;
		System.out.println( a);
		
	}

	public static void main(String agr[]) {
		int b[] = { 80, 200, 300, 400 };
		int j=0;

		reverse(b);
		for ( j=0;j<b.length;j++)
		System.out.print("  " + b[j]);
		
		
	

		
	}
}
