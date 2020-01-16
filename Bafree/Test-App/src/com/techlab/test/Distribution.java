package com.techlab.test;

public class Distribution  {
	public void distribution(String s) {
		s.toCharArray();
		
			
		 char[] ch = new char[s.length()]; 

			
			for (int j: ch) {
				ch[j]++;
			}

			
			for (int i = 0; i < s.length(); i++) {
				if (ch[i] > 0) {
					System.out.printf( i + "  * "   );
				}
			}
		}

		
		
		
		public static void main(String[] args) {
			Distribution d= new Distribution();
			d.distribution("01122233");
		}
		
		
	}
	


