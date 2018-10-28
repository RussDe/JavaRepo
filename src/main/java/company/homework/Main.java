package company.homework;

public class Main {

  public static void main(String[] args) {
    //Factorial calculation via for cycle
    int n = 5;
    int sum = 1;
    for (int i = 2; i <= n; i++) {
      sum *= i;
    }
    System.out.print("SUM = " + sum);
    System.out.print("Factorial =" + factorial(n));
  }
  //5!=5*4!=5*4*3!=
  //n!=n*(n-1)!    factorial(n)
  //Factorial calculation via for recursion
  static int factorial(int n) {
    return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
  }
}
