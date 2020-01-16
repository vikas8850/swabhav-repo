package String;

public class LargeNumber {
	public static void main(String[] args) {
		int a = 100;
		int b = 506;
		int c = 30;

		if (a > b && a > c) {
			System.out.println("the largest value" + " " + a);

		} else if (b > c && b > a) {
			System.out.println("the largest value" + " " + b);
		} else {
			System.out.println("the largest value" + " " + c);
		}

	}
}