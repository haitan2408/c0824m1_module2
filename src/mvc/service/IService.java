package mvc.service;

import mvc.entity.Person;
import mvc.entity.Student;

public interface IService <T extends Person>{
    T[] getAll();

    void save(T t);

    void remove(int id);

    void update(int id, T t);

    T findById(int id);
}
