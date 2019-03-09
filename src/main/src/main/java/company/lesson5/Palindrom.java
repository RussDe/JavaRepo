package company.lesson5;

public class Palindrom {
  private static int counter1 = 0;
  private static int counter2 = 0;
  private static int counter3 = 0;

  public static void main(String[] args) {

    // 999*999  100*100
    // 998'001
    int currentMax = 100 * 100;
    int maxNumber = 999;
    for (int i = maxNumber; i > 99; i--) {
      for (int j = maxNumber; j > 99; j--) {
        counter1++;
        if (isPalindrom(i * j)) {
          currentMax = i * j > currentMax ? i * j : currentMax;
        }
      }
    }
    System.out.println(currentMax);

    System.out.println(getPalindrom2());
    System.out.println("Counter 1 = " + counter1);
    System.out.println("Counter 2 = " + counter2 * counter3);
  }

  private static int getPalindrom2() {
    for (int number = 999 * 999; number > 100 * 100; number--) {
      counter2++;
      if (isPalindrom(number) && ismult(number)) {
        return number;
      }

    }
    return -1;
  }

  private static boolean ismult(int number) {
    for (int i = 999; i > 100; i--) {
      counter3++;
      if (number % i == 0 && number / i < 999 && number > 99) {
        System.out.println(i + "*" + number / i + "=" + number);
        return true;
      }
    }
    return false;
  }

  private static boolean isPalindrom(int number) {
    char[] chars = String.valueOf(number).toCharArray();
    for (int i = 0; i < chars.length / 2; i++) {
      if (chars[i] != chars[chars.length - i - 1]) {
        return false;
      }
    }
    return true;
  }
}
