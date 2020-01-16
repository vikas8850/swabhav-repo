package app.array;

public class TestMax {
	public static void main(String agrs[]) {
		int [] list= {10,20,300,55,87,500};
		
		int max=list[0];
		int secondmax=list[0];
		
		for (int i = 0; i < list.length; i++) {
			if (max<list[i]) {
				max=list[i];
			}
			
		}
		System.out.println("From The Array Element Largest Number is:" + max);
		System.out.println(list.length);
	}
	

}
