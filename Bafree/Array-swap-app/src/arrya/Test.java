package arrya;

import java.util.Scanner;

public class Test {
	public static void main(String agrs[]) {
		int count;
		String temp;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of color  you wanted to sort :");
		count = scan.nextInt();

		String str[] = new String[count];
		Scanner scan2 = new Scanner(System.in);

		System.out.println("Enter the  one by one:");
		for (int i = 0; i < count; i++) {
			str[i] = scan2.nextLine();
		}

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

		System.out.print("Strings in Sorted Order:");
		for (int i = 0; i <= count - 1; i++) {
			System.out.print(str[i] + ", ");
		}
	}

}
