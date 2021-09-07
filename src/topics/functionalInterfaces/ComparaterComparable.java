package topics.functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparaterComparable {

    static class Student implements Comparable<Student> {
        Integer age;
        Integer weight;

        public Student(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Integer getAge() {
            return age;
        }

        public Integer getWeight() {
            return weight;
        }

        @Override
        public int compareTo(Student s) {
            return age.compareTo(s.age);
        }

        //all equivalent
        public static final Comparator<Student> comparatorByWeight = (s1, s2) -> s1.weight.compareTo(s2.weight);
        public static final Comparator<Student> comparatorByWeight2 = Comparator.comparing(student -> student.getAge());
        public static final Comparator<Student> comparatorByWeight3 = Comparator.comparing(Student::getAge);
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 1));

        students.add(new Student(5, 5));
        students.add(new Student(4, 4));
        students.add(new Student(2, 2));
        students.add(new Student(3, 3));
        students.forEach(x -> System.out.println(x.age + "," + x.weight));

        Collections.sort(students);
        Collections.sort(students,Student.comparatorByWeight2);
        students.sort(Student.comparatorByWeight);
        students.sort(Comparator.comparing(student -> student.getWeight()));
        students.sort(Comparator.comparing(Student::getWeight));

        students.forEach(x -> System.out.println(x.age + "," + x.weight));


    }
}
