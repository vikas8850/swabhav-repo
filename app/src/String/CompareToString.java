package String;

public class CompareToString {
	public static void main(String agrs[]) {

		int[] a = { 10, 10, 10, 10, 20, 20, 20, 20, 20 };

		int temp = 1;

		for (int i = 0, length = a.length; i < length; i++) {
			if (i < length - 1) {
				if (a[i] == a[i + 1]) {
					temp++;
				}
			} else {
				System.out.println(a[i] + " occurs " + temp + " time(s)");
			}

			if (i < length - 1 && a[i] != a[i + 1]) {
				System.out.println(a[i] + " occurs " + temp + " time(s)");
				temp = 1;
			}
		}
	}
}