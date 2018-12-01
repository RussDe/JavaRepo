package company.lesson6.builder;

public class MegaClassRunner {
  public static void main(String[] args) {
    MegaClass megaClass = MegaClass.bulder()
            .withIndex1(2)
            .withLastName("Nma")
            .build();
  }
}
