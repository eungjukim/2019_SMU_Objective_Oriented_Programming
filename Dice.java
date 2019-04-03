public class Dice {
  public int number;
  public static String arr[] = {"A", "B"};
  private void roll() {
    number = (int)(Math.random() * 6) + 1;
  }
  private int getNumber() {
    return number;
  }
  public static void main(String args[]) {
    Dice d = new Dice();
    for(int i=0; i<2; i++) {
      d.roll();
      System.out.println(arr[i] + ":" + d.getNumber());
    }
  }
}
