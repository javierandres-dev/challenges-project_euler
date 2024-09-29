/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * What is the 10001st prime number?
 * ✅ Checked answer: 104743
 */
package challenges;

public class Chall007 {
  public static void main(String[] args) {
    printXprimeNumber(10001);
  }

  private static void printXprimeNumber(int x) {
    int counter = 0;
    int number = 2;
    while (counter < x) {
      boolean isPrime = true;
      for (int i = 2; i < number; i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime)
        counter++;
      if (counter == x)
        System.out.println("answer: " + number);
      number++;
    }
  };
}
