package prime_finder;


public class Sieves {
	
	public Sieves() {
		
	}
	
	public boolean[] findPrimes(int num) {
		boolean[] bool = new boolean[num];
	     
	      for (int i = 0; i< bool.length; i++) {
	         bool[i] = true;
	      }
	      
	      for (int i = 2; i< Math.sqrt(num); i++) {
	         if(bool[i] == true) {
	            for(int j = (i*i); j<num; j = j+i) {
	               bool[j] = false;
	            }
	         }
	      }
	      return (bool);
	}

}
