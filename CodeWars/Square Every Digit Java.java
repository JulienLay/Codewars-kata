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