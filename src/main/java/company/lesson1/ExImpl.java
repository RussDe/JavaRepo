package company.lesson1;

import java.util.function.Function;

public class ExImpl implements Ex {

  @Override
  public void print() {

  }

  //  @Override
//  public void print1() {
//
//  }
  public static void main(String[] args) {
    Function<Integer, Boolean> function = n -> getaBoolean(n);
    function.compose(x -> 10);
  }

  private static Boolean getaBoolean(Integer n) {
    System.out.println();
    return n > 10;
  }
}
