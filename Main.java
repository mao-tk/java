public class Main {
  public static void main(String[] args) {
    for (int a = 0; a < 10; a++) {
      System.out.print("BLOCK" + String.format("%02d ", a));
      for (int b = 0; b < 10; b++) {
        if (a == b) {
          System.out.print("00 ");
        }else {
          System.out.print(String.format("%02d ", a * 10 + b));
        }
      }
      System.out.println("");
    }
    System.out.println("END");
  }
}