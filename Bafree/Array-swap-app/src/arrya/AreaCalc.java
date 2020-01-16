package arrya;

public class AreaCalc {
	public static void main(String[] args) {
		doSomething();
		
		int add1=add(10,12);
		System.out.println(add1 + "The total number " );
		
		System.out.println("the area is " + area(12, 12));

	}

	static int doSomething() {
		System.out.println(" i am doing java programimg ");
		return 0;
	}

	static void doSomething1() {
		System.out.println(" i m doing nothing  ");

	}
	static int add(int b ,int a) {

		
		int sum=a+b;
		return sum;
		
	}
	static int area(int x, int y) {
		int total  =x*y;
		return total;
		
	}
}