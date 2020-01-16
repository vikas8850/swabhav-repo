package String;

public class Avarge {
	public static void main(String[] args) {
		double a[]= {1,2,3,4};
		double sum=0;
		double avg=0.0;
		for (int i=0 ;i<a.length;i++) {
			sum=sum+a[i];
			avg=sum/a.length;
			
		}
		System.out.println(sum);
		System.out.println(avg);
	}
	

}
