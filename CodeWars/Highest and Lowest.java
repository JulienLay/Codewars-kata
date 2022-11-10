// In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

// Examples
// highAndLow("1 2 3 4 5")  // return "5 1"
// highAndLow("1 2 -3 4 5") // return "5 -3"
// highAndLow("1 9 3 4 -5") // return "9 -5"

import java.util.*;

public class Kata {
  public static String highAndLow(String numbers) {
    
    // on enlève les espaces et on met chaque valeur dans un tableau de string
    String[] nombresStr = numbers.split("\\s+");
    
    // on convertit le tableau de string en tableau d'entiers
    int size = nombresStr.length;
    int [] arr = new int [size];
    for(int i=0; i<size; i++) {
        arr[i] = Integer.parseInt(nombresStr[i]);
    }
    
    // on initialise le min et le max à la première valeur du tableau arr
    int low = arr[0];
    int high = arr[0];
    
    // on commence la boucle à partir de l'indice 1 et on change la valeur quand elle est inférieure pour le min et supérieure pour le max
    for (int i=1; i<arr.length; i++) {
      if (arr[i]<low) {
        low = arr[i];
      }
      if (arr[i]>high) {
        high = arr[i];
      }
    }
    
    return high + " " + low;
  }
}