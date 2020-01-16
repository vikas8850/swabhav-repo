package arrya;

public class PassingArray {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4 };
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);

		}
		System.out.println(mutable(a));

	}

	static int mutable(int b[]) {
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum = sum + b[i];

		}
		return sum;

	}
}
