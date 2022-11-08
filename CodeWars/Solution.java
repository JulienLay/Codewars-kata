// replace("Hi!") === "H!!"
// replace("!Hi! Hi!") === "!H!! H!!"
// replace("aeiou") === "!!!!!"
// replace("ABCDE") === "!BCD!"

public class Solution {
    public static String replace(final String s) {
      String result = "";
      for(int i=0; i<s.length(); i++) {
        if((s.charAt(i) == 'a')||(s.charAt(i) == 'e')||(s.charAt(i) == 'i')||(s.charAt(i) == 'o')||(s.charAt(i) == 'u')||(s.charAt(i) == 'A')||(s.charAt(i) == 'E')||(s.charAt(i) == 'I')||(s.charAt(i) == 'O')||(s.charAt(i) == 'U')) {
          result += "!";
        } else {
        result += s.charAt(i);
      }
    }
      return result;
  }
}