package company.lesson8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetRunner {
  public static void main(String[] args) {
    Student student1 = new Student("Ivanov", 100);
    Student student2 = new Student("Ivanov", 100);
    Set<Student> students = new TreeSet<>();
    students.add(student1);

    Comparator<Teacher> teacherComparator = new Comparator<Teacher>() {
      @Override
      public int compare(Teacher o1, Teacher o2) {
        return o1.getAge() - o2.getAge();
      }
    };

    Comparator<Teacher> teacherComparator1 = (o1, o2) -> o1.getAge() - o2.getAge();


    Set<Teacher> teachers = new TreeSet<>(teacherComparator1);
    Teacher teacher1 = new Teacher("Sidorov", 65);
    teachers.add(teacher1);

  }
}
