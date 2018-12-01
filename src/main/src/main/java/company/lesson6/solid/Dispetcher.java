package company.lesson6.solid;

import java.util.ArrayList;
import java.util.List;

class Dispetcher {
  private final List<Flyer> flyers;

  Dispetcher() {
    this.flyers = new ArrayList<>();
  }

  void addFlyer(Flyer flyer) {
    flyers.add(flyer);
  }

  void letFly() {
    flyers.forEach(Flyer::fly);
  }
}
