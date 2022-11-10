// Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

// Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case

public class BitCounting {

	public static int countBits(int n){
    // on convertit le nombre en un binary string (par exemple 1234 devient "10011010010")
    String binary = Integer.toBinaryString(n);
    
    int compteur = 0;
	  
    for (int i=0; i<binary.length(); i++) {
      // on déclare le char avant car sinon on ne peut pas le déréférencer dans le if
      Character charac = binary.charAt(i);
      if(charac.equals('1')) {
        compteur++;
      }
    }
    
    return compteur;
  }
}