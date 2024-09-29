/*
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * ✅ Checked answer: 4613732
 */
package challenges;

import java.util.ArrayList;

public class Chall002 {
  public static void main(String[] args) {
    ArrayList<Integer> terms = new ArrayList<Integer>();
    terms.add(1);
    terms.add(2);
    boolean run = true;
    int sum = 0;
    int i = 0;
    while (run) {
      i++;
      final int term = terms.get(i);
      if (term % 2 == 0)
        sum += term;
      final int newTerm = terms.get(i - 1) + term;
      if (newTerm > 4000000)
        run = false;
      else
        terms.add(newTerm);
    }
    System.out.println("answer: " + sum);
  }
}
