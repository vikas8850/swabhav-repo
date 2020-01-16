package arrya;

public class MethodOfEven {
	public static void main(String[] args) {
		
System.out.println(even());
	}

	static int[] even() {
		int[] a = new int[10];
		int b = 2;
		for (int i = 0; i < a.length; i++) {
			a[i] = b;
			b = b + 2;

		}
		return a;
	}

	static int even(int value) {

		return value;
	}
}