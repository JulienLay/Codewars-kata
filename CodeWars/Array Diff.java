// Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

// It should remove all values from list a, which are present in list b keeping their order.

// Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
// If a value is present in b, all of its occurrences must be removed from the other:

// Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}

import java.util.*; 
import java.util.Arrays;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    System.out.println("test");
    // on crée une liste vide listResult 
    List<Integer> listResult = new ArrayList<Integer>();
    
    if (b.length == 0) {
      return a;
    }

    // on ajoute les éléments qui sont différents dans la liste listResult
    // mustKeep est vraie quand les éléments sont différents
    for(int i=0; i<a.length;i++){
      boolean mustKeep = true;
      for (int j=0; j<b.length; j++) {
        if(a[i] == b[j]){
          mustKeep = false;
          break;
        }
      }
      if (mustKeep) listResult.add(a[i]);
    }
    
    System.out.println(listResult);
    
    // on convertit la liste de Integer en un tableau de int et on le renvoie
    return listResult.stream().mapToInt(i->i).toArray();
  }

}