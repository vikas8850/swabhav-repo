package opps;

public class PersonText {
	int id;
	String fname;
	String lname;
	String dob; 
	
	public void dispaly() {
		System.out.println(id + " " +fname + "" + lname + " " + dob );
	}
public static void main(String[] args) {
	PersonText p1 = new PersonText();
	p1.id =12;
	p1.fname="Ajay";
	p1.lname="pandey";
	p1.dob="2/12/2008";
	p1.dispaly();
	
	PersonText p2 = new PersonText();
	p2.fname="vivek";
	p2.lname="raju";
	p2.dob="3/12/2108";
	p2.dispaly();
	
	
	PersonText p3 = new PersonText();
	p3.id =13;
	p3.fname="joy";
	p3.lname="Max";
	p3.dispaly();
	
}
}
