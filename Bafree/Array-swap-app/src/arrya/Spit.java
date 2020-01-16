package arrya;

public class Spit {
	public static void main(String[] args) {
		String name = "123#google!";
		
		String a[] = name.split("#");
		System.out.println(a.length);
		System.out.println(a[1]);
	}

}
