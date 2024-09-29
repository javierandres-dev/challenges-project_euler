/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which,
 * a^2 + b^2 = c^2.
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * ✅ Checked answer: 31875000
 */
package challenges;

public class Chall009 {
  public static void main(String[] args) {
    boolean search = true;
    int c = 3;
    while (search) {
      for (int b = 2; b < c; b++) {
        for (int a = 1; a < b; a++) {
          final int aa = (int) Math.pow(a, 2);
          final int bb = (int) Math.pow(b, 2);
          final int cc = (int) Math.pow(c, 2);
          if ((aa + bb == cc) && (a + b + c == 1000)) {
            System.out.println("answer: " + (a * b * c));
            search = false;
          }
        }
      }
      c++;
    }
  }
}
