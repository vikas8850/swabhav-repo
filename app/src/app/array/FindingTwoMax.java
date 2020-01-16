package app.array;

public class FindingTwoMax {
	public static void main(String agrs[]) {
		int[] list = { 100, 20, 300, 550, 87, 50, 90, 80};

		int max = list[0];
		int secondmax = list[0];
		int fristmaxpostion =0;
		int Secondmaxpostion=0;
		

		for (int i = 0; i < list.length; i++) {
			if (max < list[i]) {
				max = list[i];
				fristmaxpostion=i+1;
				
				
			}

		}
		System.out.println("From The Array Element Largest Number is:" + max +" The postion in array"+fristmaxpostion);

		for (int i = 0; i < list.length; i++) {
			if (max==secondmax)
				secondmax=list[i+1];
			if (max > list[i])
				if (secondmax < list[i])
					secondmax = list[i];
			Secondmaxpostion=i+1;

		}
		System.out.println("From The Array Element Largest Number is:" + secondmax +" The postion in array"+Secondmaxpostion);
	}
}
