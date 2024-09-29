/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * ✅ Checked answer: 142913828922
 */
package challenges;

public class Chall010 {
  public static void main(String[] args) {
    printSumPrimes(2000000);
  }

  private static void printSumPrimes(int limit) {
    long sum = 0;
    int num = 2;
    while (num < limit) {
      if (isPrime(num))
        sum += num;
      num++;
    }
    System.out.println("answer: " + sum);
  }

  private static boolean isPrime(int x) {
    for (int i = 2; i < x; i++)
      if (x % i == 0)
        return false;
    return true;
  }
}
