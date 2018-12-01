package company.lesson6.builder;

public class MegaClass {
  private int index1;
  private int index2;
  private int index3;
  private int odd;
  private int oddNumber;
  private String name;
  private String surName;
  private String lastName;
  private String country;

  private MegaClass(int index1, int index2, int index3, int odd, int oddNumber,
                   String name, String surName, String lastName, String country) {
    this.index1 = index1;
    this.index2 = index2;
    this.index3 = index3;
    this.odd = odd;
    this.oddNumber = oddNumber;
    this.name = name;
    this.surName = surName;
    this.lastName = lastName;
    this.country = country;
  }

  public MegaClass(int index1, String surName) {
    this.index1 = index1;
    this.surName = surName;
  }

  static MegaClassBuilder bulder(){
    return new MegaClassBuilder();
  }

  public static class MegaClassBuilder {
    private int index1;
    private int index2;
    private int index3;
    private int odd;
    private int oddNumber;
    private String name;
    private String surName;
    private String lastName;
    private String country;

    public MegaClassBuilder withIndex1(int index1) {
      this.index1 = index1;
      return this;
    }

    public MegaClassBuilder withIndex2(int index2) {
      this.index2 = index2;
      return this;
    }

    public MegaClassBuilder withIndex3(int index3) {
      this.index3 = index3;
      return this;
    }

    public MegaClassBuilder withOdd(int odd) {
      this.odd = odd;
      return this;
    }

    public MegaClassBuilder withOddNumber(int oddNumber) {
      this.oddNumber = oddNumber;
      return this;
    }

    public MegaClassBuilder withName(String name) {
      this.name = name;
      return this;
    }

    public MegaClassBuilder withSurName(String surName) {
      this.surName = surName;
      return this;
    }

    public MegaClassBuilder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public MegaClassBuilder withCountry(String country) {
      this.country = country;
      return this;
    }

    public MegaClass build() {
      return new MegaClass(index1, index2, index3, odd, oddNumber, name, surName, lastName, country);
    }
  }

}
