package company.lesson12.thread;

public class HelloThread implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
      System.out.println("Hello");
      sleep(500);
    }
  }

  private void sleep(long time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
