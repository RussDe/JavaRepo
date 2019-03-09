//package company.lesson6.builder;
//
//public class MegaClassBuilder {
//  private int index1;
//  private int index2;
//  private int index3;
//  private int odd;
//  private int oddNumber;
//  private String name;
//  private String surName;
//  private String lastName;
//  private String country;
//
//  public MegaClassBuilder withIndex1(int index1) {
//    this.index1 = index1;
//    return this;
//  }
//
//  public MegaClassBuilder withIndex2(int index2) {
//    this.index2 = index2;
//    return this;
//  }
//
//  public MegaClassBuilder withIndex3(int index3) {
//    this.index3 = index3;
//    return this;
//  }
//
//  public MegaClassBuilder withOdd(int odd) {
//    this.odd = odd;
//    return this;
//  }
//
//  public MegaClassBuilder withOddNumber(int oddNumber) {
//    this.oddNumber = oddNumber;
//    return this;
//  }
//
//  public MegaClassBuilder withName(String name) {
//    this.name = name;
//    return this;
//  }
//
//  public MegaClassBuilder withSurName(String surName) {
//    this.surName = surName;
//    return this;
//  }
//
//  public MegaClassBuilder withLastName(String lastName) {
//    this.lastName = lastName;
//    return this;
//  }
//
//  public MegaClassBuilder withCountry(String country) {
//    this.country = country;
//    return this;
//  }
//
//  public MegaClass build() {
//    return new MegaClass(index1, index2, index3, odd, oddNumber, name, surName, lastName, country);
//  }
//}
