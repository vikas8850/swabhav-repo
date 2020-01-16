package arrya;
import java.util.Arrays;
public class Sorting {
public static void main(String[] args) {
	int a[]= {10,20,300,40,50};
	char b[]= {'a','b','c','d'};
	for (int i =a.length-1;i>=0;i--) {
		Arrays.sort(a);
		
		System.out.println(a[i]);
	}
	
	for (int j =0;j<b.length;j++) {
		Arrays.sort(b);
		System.out.println(b[j]);
		
	}
	
}

}