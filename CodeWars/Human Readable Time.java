// Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

// HH = hours, padded to 2 digits, range: 00 - 99
// MM = minutes, padded to 2 digits, range: 00 - 59
// SS = seconds, padded to 2 digits, range: 00 - 59
// The maximum time never exceeds 359999 (99:59:59)

// You can find some examples in the test fixtures.

public class HumanReadableTime {
  public static String makeReadable(int s) {
    int seconds = s%60;
    int minutes = (s/60)%60;
    int hours = s/3600;
    
    String secondsStr = "";
    String minutesStr = "";
    String hoursStr = "";
    
    secondsStr= (seconds < 10) ? "0"+Integer.toString(seconds) : Integer.toString(seconds);
    minutesStr= (minutes < 10) ? "0"+Integer.toString(minutes) : Integer.toString(minutes);
    hoursStr= (hours < 10) ? "0"+Integer.toString(hours) : Integer.toString(hours);
    
    // QUI PEUT AUSSI S'ECRIRE
    
//     if(seconds < 10) {
//       secondsStr="0"+Integer.toString(seconds);
//     } else {
//       secondsStr=Integer.toString(seconds);
//     }
    
//     if (minutes < 10) {
//       minutesStr="0"+Integer.toString(minutes);
//     } else {
//       minutesStr=Integer.toString(minutes);
//     }
    
//     if (hours < 10) {
//       hoursStr="0"+Integer.toString(hours);
//     } else {
//       hoursStr=Integer.toString(hours);
//     }
    
    return hoursStr+":"+minutesStr+":"+secondsStr;
  }
}