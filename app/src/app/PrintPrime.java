package app;

public class PrintPrime {
	public static void isPrime(int n) {
		int i, j;
		boolean count = false;
		j = n / 2;
		for (i = 2; i <= j; i++) {

			if (n % i == 0) {
				count = true;
				break;
			}
		}
		if (!count)
			System.out.println(n + " " + count);
		else
			System.out.println(n + " " + count);
	}

	public static void main(String args[]) {

		isPrime(3);
		isPrime(10);
	}
}