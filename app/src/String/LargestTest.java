package String;

public class LargestTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 56;
		int c = 300;

		if (a > b) {
			if (a > c)
				System.out.println("the largest value" + " " + a);
		} else if (b > a) {
			if (b > c)
				System.out.println("the largest value" + " " + b);

		}

		else
			System.out.println("the largest value" + " " + c);

	}
}