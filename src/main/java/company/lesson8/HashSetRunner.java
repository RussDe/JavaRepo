package company.lesson8;

import java.util.HashSet;
import java.util.Set;

public class HashSetRunner {
  public static void main(String[] args) {
    Student student1 = new Student("Ivanov", 100);
    Student student2 = new Student("Ivanov", 100);

    Set<Student> students = new HashSet<>();
    students.add(student1);
    students.add(student2);
    System.out.println(students.size());
    System.out.println(students.contains(student2));
    for (Student student: students) {
      System.out.println(student==student2);
    }
  }
}
