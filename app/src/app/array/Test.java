package app.array;

public class Test {
	public static void sum(int s[]) {
		int add = 0;
		int j;
		for (j = 0; j < s.length; j++) {
			add = add + s[j];
		}
		System.out.println("The sum of the array is " + add);

	}

	public static void even(int evennum[]) {
		int i;
		
		for (i = 0; i < evennum.length; i++) {
			if (evennum[i] % 2 == 0) 
				System.out.println("The even number is   " + evennum[i]);
				
				
				

			
			
		}
		System.out.println("The value of i is    " + i);
	}

	public static void main(String agr[]) {
		int a[] = { 10, 20, 30, 3, 31};

		sum(a);
		even(a);
	}
}
