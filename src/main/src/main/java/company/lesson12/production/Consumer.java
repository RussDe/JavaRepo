package company.lesson12.production;

public class Consumer implements Runnable {
  private Shop shop;

  public Consumer(Shop shop) {
    this.shop = shop;
    new Thread(this, "Consumer").start();
  }

  @Override
  public void run() {
    while (true) {
      shop.getQuantity();
    }
  }
}
