package company.lesson12.thread;

public class ThreadRunner {
  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();

    HelloThread helloThread = new HelloThread();
    new Thread(helloThread).start();

  }
}
