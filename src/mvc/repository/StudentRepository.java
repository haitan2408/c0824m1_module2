package mvc.repository;

import mvc.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(0, new Student(1, "Nghĩa", "QN", 9));
        students.add(1, new Student(1, "haiTT2", "QN", 9));
        students.add(2, new Student(1, "Minh", "QN", 9));
        students.add(3, new Student(1, "haiTT4", "QN", 9));
        students.add(4, new Student(1, "Tài", "QN", 9));
        students.add(5, new Student(1, "haiTT6", "QN", 9));
    }

    public List<Student> findAll() {
        return students;
    }

    public List<Student> findAllByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student: students) {
//            Tìm kiếm gần đúng
            if(student.getName().contains(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public void save(Student student) {
        students.add(student);
    }
}
