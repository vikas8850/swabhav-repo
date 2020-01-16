package app.array;

public class Palandrom {
	public static void main(String[] args) {
		int num=121,temp=0 ,n;
		int org_num=num;
		while(num>0) {
			n=num%10;
			temp=temp*10+n;
			num=num/10;
			
		}
		System.out.println(temp);
		if (org_num==temp) {
			System.out.println("its palandrom");
			
		}
		else {
			System.out.println("its not palandrom");
		}
		
		
	}
	

}
