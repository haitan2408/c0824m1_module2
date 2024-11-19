package mvc.service.impl;

import mvc.entity.Student;
import mvc.repository.StudentRepository;
import mvc.service.IStudentService;

public class StudentService implements IStudentService {
    private static StudentRepository studentRepository = new StudentRepository();
    @Override
    public Student[] getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(int id, Student student) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
