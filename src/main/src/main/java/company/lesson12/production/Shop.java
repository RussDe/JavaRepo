package company.lesson12.production;

public class Shop {
  private int quantity;
  private boolean isExist = false;
  private int count = 0;
  //if count = 5 then we can only get
  //if count >0 and <=4 then we can put and get

  public synchronized int getQuantity() {
    while (!isExist) {
      waitIt();
    }
    System.out.println("Get quantity = " + quantity);
    sleep();
    isExist = false;
    notifyAll();
    return quantity;
  }

  private void sleep() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public synchronized void putQuantity(int quantity) {
    while (isExist) {
      waitIt();
    }
    this.quantity = quantity;
    System.out.println("Put quantity as " + quantity);
    sleep();
    isExist = true;
    notify();
  }

  private void waitIt() {
    try {
      wait();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
