package opps;

public class PersonCostructorDemo {
	int id;
	String fname;
	String lname;
	String dob; 

	public void dispaly() {
		System.out.println(id + " " +fname + "" + lname + " " + dob );
		
	}
	public PersonCostructorDemo(int newid , String newfname, String newlname , String newdob ) {
		id = newid;
		fname=newfname;
		lname=newlname;
		dob=newdob;
		
		
		
	}
public static void main(String[] args) {
	PersonCostructorDemo p1 = new PersonCostructorDemo(12,"vias","m","12/8/78");
	p1.dispaly();
}
}
