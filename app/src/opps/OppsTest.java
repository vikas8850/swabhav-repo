package opps;

public class OppsTest {

	int roll;
	String name;

	public void Dispaly() {
		System.out.println(roll);
		System.out.println(name);

	}

	public static void main(String[] args) {
		OppsTest s1 = new OppsTest();
		s1.name= "vikas";
				s1.roll=101;
				s1.Dispaly();

	}
}
