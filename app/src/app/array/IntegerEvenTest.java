package app.array;

public class IntegerEvenTest {
	public static void main(String args[]) {
		int [] list= {10,20,30,55,87};
		for (int i = 0; i < list.length; i++) {
			if (list[i]%2==0) {
				System.out.println("This is even number "+list[i]);
			
			}
			else {
				System.out.println("This is odd number "+list[i]);
			}
			
				
		}
		
	}

}
