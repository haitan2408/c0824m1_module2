package mvc.repository;

import mvc.entity.Student;

public class StudentRepository {

    private static Student[] students = new Student[10];

    static {
        students[0] = new Student(1, "haiTT", "QN", 9);
        students[1] = new Student(1, "haiTT", "QN", 9);
        students[2] = new Student(1, "haiTT", "QN", 9);
        students[3] = new Student(1, "haiTT", "QN", 9);
        students[4] = new Student(1, "haiTT", "QN", 9);
        students[5] = new Student(1, "haiTT", "QN", 9);
    }

    public Student[] findAll() {
        return students;
    }
}
