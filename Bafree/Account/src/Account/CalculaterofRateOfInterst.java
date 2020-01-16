package Account;

public class CalculaterofRateOfInterst {

	private int amount;

	private int time;

	public CalculaterofRateOfInterst(int amount, int time) {

		this.amount = amount;
		this.time = time;

	}

	public int getAmount() {
		return amount;

	}

	public int getTime() {
		return time;

	}

	public void IntrestCalucater() {
		if (this.time <= 1 || this.time <= 5) {
			int total = (this.amount * 5 * time / 100) + this.amount;

			System.out.println("After " + this.time + "  Year" + " the amount  will be " + "Rs." + total);
		} else {
			System.out.println(" invalid year ");
		}

	}
	
	public void IntrestAbove5() {
		
		if (this.time >=6 && this.time <= 9) {
			int total = (this.amount * 10 * time / 100) + this.amount;

			System.out.println("After " + this.time + "  Year" + " the amount  will be " + "Rs." + total);
		} else {
			System.out.println(" invalid year ");
		}
		
	}
	
	
public void IntrestAbove10() {
		
		if (this.time >=10) {
			int total = (this.amount * 15 * time / 100) + this.amount;

			System.out.println("After " + this.time + "  Year" + " the amount  will be " + "Rs." + total);
		} else {
			System.out.println(" invalid year ");
		}
		
	}
	

}