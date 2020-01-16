package app.array;

public class TestRevers {

	public static void main(String args[]) {

		int temp;
		int[] number = { 10, 20, 30, 40, 50 };
		System.out.println("Original array: ");

		for (int i = 0; i < number.length; i++)
			System.out.print(" " + number[i]);
		 System.out.println();  
		 System.out.println("Array in reverse order: ");  

		for (int j = number.length - 1; j >= 0; j--)
			System.out.print("   " + number[j]);
		System.out.println(); 

		System.out.println(number[0]);
	}

}
