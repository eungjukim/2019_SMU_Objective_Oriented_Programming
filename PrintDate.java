import java.util.Date;
public class PrintDate {
  long now = System.currentTimeMillis();
  public void printUTC() {
    long nowTotalSec = now/1000;
    long nowYear = nowTotalSec/(60*60*24*365)+1970;
    long nowDays = nowTotalSec/(60*60*24)%365;
    long nowHour = nowTotalSec/(60*60)%24;
    long nowMin = nowTotalSec/60%60;
    long nowSec = nowTotalSec%60;
    System.out.printf("Your time zone : Year: %d, Days: %d, %d : %d : %d.", nowYear, nowDays, nowHour, nowMin, nowSec);
  }

  public void printLocalTime() {
    System.out.println("Your time zone :" + new Date(now));
  }

  public void printDue() {
    System.out.println("Due : " + new Date(Integer.MAX_VALUE*1000L));
  }

  public static void main(String args[]) {
    PrintDate p = new PrintDate();
    p.printUTC();
    p.printLocalTime();
    p.printDue();
  }

}
