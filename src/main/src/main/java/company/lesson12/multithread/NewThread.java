package company.lesson12.multithread;

public class NewThread implements Runnable {
  private String name;
  private Thread thread;

  public NewThread(String name, boolean isDemon) {
    this.name = name;
    thread = new Thread(this, name);
    System.out.println("Thread name: " + name + " has started!");
    thread.setDaemon(isDemon);
    thread.start();
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(this.name + ", " + i);
      sleep();
    }
    System.out.println("Thread name: " + name + " has finished!");
  }

  private void sleep() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
