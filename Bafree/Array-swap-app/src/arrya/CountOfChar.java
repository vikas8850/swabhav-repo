package arrya;
import java.util.Arrays;
public class CountOfChar {
	public static void main(String[] args) {
		char b[]= {'A','a','a','d'};
		
		char f= 'A';
		
		int c=0;
		for (int i =0;i<b.length;i++) {
			if (Character.toLowerCase(b[i])== Character.toLowerCase(f)){
				c=c+1;
				
			}
		}
		System.out.println(c);
	}

}
