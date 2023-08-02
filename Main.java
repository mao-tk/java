public class Main {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    hello("minato");
    hello("asaka");
    hello("sugawara");
    System.out.println("メソッドの呼び出しが終わりました");
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちわ");
  }
}