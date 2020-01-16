package com.techlab.test;

public class CountOfChar {
	public static void main(String[] args) {
		String s = "swabhavtechlab@vicky";
		int repeatedcount = 0;
		int nonrepeatedcount = 0;

		for (int i = 0; i < s.length(); i++) {

			repeatedcount = 0;
			for (int j = 0; j < s.length(); j++) {
				if (  s.charAt(i) == s.charAt(j)) {
					repeatedcount = repeatedcount + 1;

				}

			}
			if (repeatedcount == 1) {
				nonrepeatedcount += 1;
			}

//			System.out.println("" + s.charAt(i) + repeatedcount);

		}
		System.out.println(nonrepeatedcount);
		System.out.println(s.length());
	}

}
