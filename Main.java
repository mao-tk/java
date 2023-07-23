public class Main {
  public static void main (String[] args){
    int[] arrayA = {1, 2, 3}; //arrayA[0]は１
    int[] arrayB;
    
    arrayB = arrayA;
    arrayB[0] = 100; //arrayB[0]に100を
    System.out.println(arrayA[0]);
  }
}