// Alright, detective, one of our colleagues successfully observed our target person, Robby the robber. We followed him to a secret warehouse, where we assume to find all the stolen stuff. The door to this warehouse is secured by an electronic combination lock. Unfortunately our spy isn't sure about the PIN he saw, when Robby entered it.

// The keypad has the following layout:

// ┌───┬───┬───┐
// │ 1 │ 2 │ 3 │
// ├───┼───┼───┤
// │ 4 │ 5 │ 6 │
// ├───┼───┼───┤
// │ 7 │ 8 │ 9 │
// └───┼───┼───┘
//     │ 0 │
//     └───┘
// He noted the PIN 1357, but he also said, it is possible that each of the digits he saw could actually be another adjacent digit (horizontally or vertically, but not diagonally). E.g. instead of the 1 it could also be the 2 or 4. And instead of the 5 it could also be the 2, 4, 6 or 8.

// He also mentioned, he knows this kind of locks. You can enter an unlimited amount of wrong PINs, they never finally lock the system or sound the alarm. That's why we can try out all possible (*) variations.

// * possible in sense of: the observed PIN itself and all variations considering the adjacent digits

// Can you help us to find all those variations? It would be nice to have a function, that returns an array (or a list in Java/Kotlin and C#) of all variations for an observed PIN with a length of 1 to 8 digits. We could name the function getPINs (get_pins in python, GetPINs in C#). But please note that all PINs, the observed one and also the results, must be strings, because of potentially leading '0's. We already prepared some test cases for you.

// Detective, we are counting on you!

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ObservedPin {

    public static List<String> getPINs(String observed) {

    List<String> res = new ArrayList<String>();
      
    List<String> adjacentNumbersList = new ArrayList<String>();
      
     System.out.println(observed);
      
    for(int i=0; i<observed.length(); i++) {
      System.out.println(observed.charAt(i));
      adjacentNumbersList = adjacentNumbers(observed.charAt(i));
      for(int j=0; j<adjacentNumbersList.size(); j++) {
        res.add(observed.charAt(i) + adjacentNumbersList.get(j));
      }
    }
      
    return res;
      
    
}
  
  public static List<String> adjacentNumbers(char c)
    {
      if(c=='1')
        return Arrays.asList("124".split("")); //["1","2","4"]
      if(c=='2')
        return Arrays.asList("1235".split(""));
      if(c=='3')
        return Arrays.asList("236".split(""));
      if(c=='4')
        return Arrays.asList("1457".split(""));
      if(c=='5')
        return Arrays.asList("24568".split(""));
      if(c=='6')
        return Arrays.asList("3569".split(""));
      if(c=='7')
        return Arrays.asList("478".split(""));
      if(c=='8')
        return Arrays.asList("57890".split(""));
      if(c=='9')
        return Arrays.asList("689".split(""));
      if(c=='0')
        return Arrays.asList("80".split(""));
      return null;
    }
  
}

