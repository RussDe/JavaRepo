package interview.hackerrank.java.data_structures.java_sort;

import java.util.Comparator;

public class Sorter implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.cgpa > student2.cgpa)
            return -1;
        else if (student1.cgpa < student2.cgpa)
            return 1;
        else if (!student1.name.equals(student2.name))
            return student1.name.compareTo(student2.name);
        else if (student1.cgpa > student2.cgpa)
            return 1;
        else if ((student1.cgpa < student2.cgpa))
            return -1;
        else return 0;
    }
}
