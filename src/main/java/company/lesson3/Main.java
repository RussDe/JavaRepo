package company.lesson3;

public class Main {
  public static void main(String[] args) {
//    Container container = new Container(5);
//    container.add("First");
//    container.add(1); //Integer
//    container.add(new Object());
//    container.add(new int[2]);
//
//    int[] arr = (int[]) container.getLast();

    GenericContainer<Number> genericContainer = new GenericContainer<>(5);
    genericContainer.add(5);
    genericContainer.add(3);
    genericContainer.add(1.5);
    System.out.println("The average is " + genericContainer.average());

//    Number [] numbers =new Number[2];
//    numbers[0]=1;
//    numbers[1]=1.5;
  }
}
