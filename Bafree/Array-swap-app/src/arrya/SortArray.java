package arrya;

public class SortArray {
	public static void main(String[] args) {
		int a[] = { 10, 10, 10, 10, 20, 20, 30, 30 };
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1 && a[i] == a[i + 1]) {

				count = count + 1;

			} else {
				System.out.println("number " + a[i] + " " + count);
				count = 1;
			}
		}

	}
}