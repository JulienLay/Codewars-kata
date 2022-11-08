// Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

// For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

// Note: The function accepts an integer and returns an integer

public class SquareDigit {

  public int squareDigits(int n) {
    // TODO Implement me
    String ord = String.valueOf(n);
    int order = ord.length();
    int i = order - 1;
    String finalRes = ""; 
    int finalResInt = 0;
    int newVal = n;
    int rest = 0;
    int square = 0;
    
    while (i >= 0) {
      rest = newVal / (int)(Math.pow(10, i));
      square = rest*rest;
      finalRes += square+"";
      newVal -= (rest*(int)(Math.pow(10, i)));
      i--;
    }
    
    finalResInt=Integer.parseInt(finalRes);
    return finalResInt;
  }
}