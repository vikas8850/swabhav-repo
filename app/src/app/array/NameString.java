package app.array;


	import java.util.Scanner;
	 
	public class NameString {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[] names = new String[3];
	        System.out.println("Enter 3 names: ");
	        for (int i = 0; i < names.length; i++) {
	            names[i] = scanner.nextLine();
	        }
	        System.out.print("Enter starting alphabet: ");
	        char start = scanner.next().charAt(0);
	        for (int i = 0; i < names.length; i++) {
	            char LetterOfName = names[i].charAt(0);
	            if (LetterOfName == start) {
	                System.out.println(names[i]);
	            }
	        }
	    }
	}


