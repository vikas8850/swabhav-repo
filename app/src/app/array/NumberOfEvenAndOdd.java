package app.array;

public class NumberOfEvenAndOdd {
	public static void main(String agrs[]) {
		int[] list = { 10, 20, 30, 55, 87, 55, 44, 66, 7, 3, 2,33,11,21 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 == 0) {
				even=even+1;

			} else {
				odd=odd+1;

			}

		}
		System.out.println("The number of even in list " + even);
		System.out.println("The number of odd in list " + odd);
	}

}
