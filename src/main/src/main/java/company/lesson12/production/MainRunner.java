package company.lesson12.production;

public class MainRunner {
  public static void main(String[] args) {
    Shop shop = new Shop();
    Producer producer = new Producer(shop);
    Consumer consumer = new Consumer(shop);

    // Set

//    ThreadGroup
  }
}
