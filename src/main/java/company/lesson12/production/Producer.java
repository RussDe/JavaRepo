package company.lesson12.production;

public class Producer implements Runnable {
  private Shop shop;

  public Producer(Shop shop) {
    this.shop = shop;
    new Thread(this, "Producer").start();
  }

  @Override
  public void run() {
    for (int i = 0; true; i++) {
      shop.putQuantity(i);
    }
  }
}
