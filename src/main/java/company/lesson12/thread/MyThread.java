package company.lesson12.thread;

public class MyThread extends Thread {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
    long factorial = 1;
    for (int i = 1; i <= 15; i++) {
      factorial *= i;
    }
    System.out.println(factorial);
  }
}
