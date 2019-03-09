package company.lesson8;

import java.util.Objects;

public class Student implements Comparable<Student> {
  private String name;
  private int id;

  Student(String name, int id) {
    this.name = name;
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student)) return false;
    Student student = (Student) o;
    return id == student.id &&
            Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public int compareTo(Student student) {
    if (student == null) {
      throw new IllegalArgumentException("Null value");
    }

    return this.id-student.id;
  }
}
