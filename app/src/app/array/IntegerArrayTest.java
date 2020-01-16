package app.array;

public class IntegerArrayTest {
	
	public static void main(String args[]) {
		int sum=0;
		int m=1;
		int [] marks= {10,20,30};
		System.out.println("The legnth of the array is "+ marks.length);
		for (int i = 0; i < marks.length; i++)  {
			System.out.println("This the postion of the array "+i+" and value is "+ marks[i]);
			sum=sum+marks[i];
			m=m *marks[i];
			
			
			
			
			
			
		}
		System.out.println("The total of the array is "+sum);
		System.out.println("The Mutiplication of the array is "+m);
		
		}
	}


