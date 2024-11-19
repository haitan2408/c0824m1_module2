package mvc.service;

import mvc.entity.Student;

public interface IStudentService {

    Student[] getAll();

    void save(Student student);

    void remove(int id);

    void update(int id, Student student);

    Student findById(int id);
}
