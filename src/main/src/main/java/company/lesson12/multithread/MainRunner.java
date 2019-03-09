package company.lesson12.multithread;

public class MainRunner {
  public static void main(String[] args) {
    new NewThread("First",false);
    new NewThread("Second",false);
    new NewThread("Third",true);

    System.out.println("MaiRunner has finished!");
  }
}
