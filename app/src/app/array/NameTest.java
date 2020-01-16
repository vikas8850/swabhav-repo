package app.array;

public class NameTest {
	public static void main(String agr[]) {
		int org_num = 1321;
		int num = org_num;
		int rem = 0;
		while (num != 0) {
			int t = num % 10;
			rem = rem * 10 + t;
			num = num / 10;

		}
		System.out.println("The revers of number is "+rem);
		if (org_num == rem) {
			System.out.println("Its palindrome");
		} else {
			System.out.println("Its not palindrome");
		}

	}

}
