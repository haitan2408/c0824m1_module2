package mvc.controller;

import mvc.entity.Student;
import mvc.service.IStudentService;
import mvc.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private IStudentService studentService = new StudentService();
    public List<Student> getAll() {
        return studentService.getAll();
    }

    public List<Student> findAllByName(String name) {
        return studentService.findAllByName(name);
    }

    public void save(Student student) {
        studentService.save(student);
    }
}
