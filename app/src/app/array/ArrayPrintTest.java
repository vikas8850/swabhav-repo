package app.array;

public class ArrayPrintTest {
	public static void infoArray(int list[]) {
		for (int i : list)
			;
		System.out.println(list.length);

	}

	public static void sum(int s[]) {
		int add = 0;
		for (int j = 0; j < s.length; j++) {
			add = add + s[j];
		}

		System.out.println("The sum of the array is " + add);

	}

	public static void even(int evennum[]) {
		for (int i = 0; i < evennum.length; i++) {
			if (evennum[i] % 2 == 0) {

			}
			System.out.println("This is even number " + evennum[i]);
		}

	}

	public static void reverse(int list[]) {
		int i;

		for ( i = list.length - 1; i >= 0; i--) {

			
		}
		System.out.println("This is revers number " + list[i]);
	}

	public static void main(String agr[]) {
		int a[] = { 10, 20, 30, 55, 30 };
		infoArray(a);
		sum(a);
		even(a);
		reverse(a);
	}
}
