package prime_finder;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		
	      System.out.println("Enter a number");
	      int num = sc.nextInt();	     
	      
	      System.out.println("List of prime numbers upto given number are : ");
	      
	      Sieves pf = new Sieves();
	      boolean[] b = pf.findPrimes(num);
	      
	      for (int i = 2; i< b.length; i++) {
		         if(b[i]==true) {
		            System.out.println(i);
		         }
	      }
	      
	   }


}
