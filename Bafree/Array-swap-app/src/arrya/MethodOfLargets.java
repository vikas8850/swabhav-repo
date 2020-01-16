package arrya;

public class MethodOfLargets {
	public static void main(String[] args) {
		int a[] = { 10, 20, 50,100,160,95 };
		System.out.println("The largets number is "+largest(a));

	}

	static int largest(int b[]) {
		int max = b[0];
		int secondmax=b[0];
		for (int i = 0; i < b.length; i++) {
			if (max < b[i]) {
				max = b[i]; 
				

			}
			
		}
		return (max);
	}
	
}