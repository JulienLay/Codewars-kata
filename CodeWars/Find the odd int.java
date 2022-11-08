// Given an array of integers, find the one that appears an odd number of times.

// There will always be only one integer that appears an odd number of times.

// Examples
// [7] should return 7, because it occurs 1 time (which is odd).
// [0] should return 0, because it occurs 1 time (which is odd).
// [1,1,2] should return 2, because it occurs 1 time (which is odd).
// [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
// [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

import org.apache.commons.lang3.ArrayUtils;
import java.util.*;

public class FindOdd {
	public static int findIt(int[] a) {
    if (a.length == 1) return a[0];
    
    // convertir l'array de int 'a' en liste de int 'list'
     List<Integer> list1 = new ArrayList<Integer>(); 
    
    for (int i=0; i<a.length; i++) {
       list1.add(a[i]);
    }
       
    int frequence = 0;
    int result = 0;
    
    for (int i=0; i<a.length; i++) {
      frequence = Collections.frequency(list1, list1.get(i));
      if (frequence%2==1) {
        return list1.get(i);
    }
      System.out.println("frequence : " + frequence);
      System.out.println("valeur : " + list1.get(i));
    }
    return 0;
  }
}