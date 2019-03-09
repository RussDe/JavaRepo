package company.lesson6.solid;

public class MainRunner {
  public static void main(String[] args) {
    Dispetcher dispetcher = new Dispetcher();

    dispetcher.addFlyer(new Plain());
    dispetcher.addFlyer(new Helicopter());
    dispetcher.addFlyer(() -> System.out.println("Lyamda in action"));

    dispetcher.letFly();
  }
}
