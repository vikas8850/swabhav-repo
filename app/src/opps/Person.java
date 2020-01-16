package opps;

public class Person {
	int id;
	String name;
	String addres;

	public void dispaly() {
		System.out.println(id + " " + name + "  " + addres);

	}

	public Person(int id, String name, String addres) {
		this.id = id;
		this.name = name;
		this.addres = addres;

	}

	public static void main(String[] args) {
		Person p1 = new Person(12, "vikas", "mumbai");

		Person p2 = new Person(13, "lucky", "pune");

		Person p3 = new Person(14, "ketan", "kolkata");

		p1.dispaly();
		p2.dispaly();
		p3.dispaly();
	}
}
