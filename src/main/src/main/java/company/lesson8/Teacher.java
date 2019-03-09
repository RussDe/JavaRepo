package company.lesson8;

import java.util.Map;
import java.util.Objects;

public class Teacher {
  private String name;
  private int age;

  public Teacher(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Teacher)) return false;
    Teacher teacher = (Teacher) o;
    return age == teacher.age &&
            Objects.equals(name, teacher.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
}
