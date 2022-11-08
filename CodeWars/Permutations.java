// In this kata you have to create all permutations of a non empty input string and remove duplicates, if present. This means, you have to shuffle all letters from the input in all possible orders.

// Examples:

// * With input 'a'
// * Your function should return: ['a']
// * With input 'ab'
// * Your function should return ['ab', 'ba']
// * With input 'aabb'
// * Your function should return ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Permutations {
    
    public static List<String> singlePermutations(String s) {
      // Your code here!
      List<String> result = new ArrayList<>();
      
      if (s.length() <= 0) {
        return null;
      } else if (s.length() == 1) {
        result.add(s);
        return result;
      } else {
        // crée une ArrayList vide pour stocker les permutations (partielles)
        List<String> partial = new ArrayList<>();
 
        // initialise la liste avec le premier caractère de la string
        partial.add(String.valueOf(s.charAt(0)));
 
        // faire pour chaque caractère de la string spécifiée
        for (int i = 1; i < s.length(); i++)
        {
            // considère les permutations partielles précédemment construites une par une
 
            // (itérer en arrière pour éviter ConcurrentModificationException)
            for (int j = partial.size() - 1; j >= 0 ; j--)
            {
                // supprime la permutation partielle actuelle de la ArrayList
                String str = partial.remove(j);
 
                // Insère complètement le caractère suivant de la string spécifiée
                // positions possibles de la permutation partielle courante. Alors
                // insère chacune de ces strings nouvellement construites dans la liste
 
                for (int k = 0; k <= str.length(); k++)
                {
                    // Conseil : utilisez StringBuilder pour la concaténation
                    partial.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
                }
            }
        }
        
        
        // Créer une liste de contenu unique basée sur les éléments de ArrayList
        Set<String> mySet = new HashSet<String>(partial);
 
        // Créer une Nouvelle ArrayList à partir de Set
        List<String> partial2 = new ArrayList<String>(mySet);
        
        return partial2;
      }
    }
}