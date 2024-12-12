package mvc.repository;

import mvc.entity.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

//    private static List<Student> students = new ArrayList<>();
//
//    static {
//        students.add(0, new Student(1, "Nghĩa", "QN", 9));
//        students.add(1, new Student(1, "haiTT2", "QN", 9));
//        students.add(2, new Student(1, "Minh", "QN", 9));
//        students.add(3, new Student(1, "haiTT4", "QN", 9));
//        students.add(4, new Student(1, "Tài", "QN", 9));
//        students.add(5, new Student(1, "haiTT6", "QN", 9));
//    }

    public List<Student> findAll() {
        File file = new File("src/mvc/data/student.csv");
        List<Student> students = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            String[] temp;
            Student student;
            while ((line = bufferedReader.readLine())!= null) {
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]));
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return students;
    }

    public List<Student> findAllByName(String name) {
        List<Student> result = new ArrayList<>();
        List<Student> students = findAll();
        for (Student student: students) {
//            Tìm kiếm gần đúng
            if(student.getName().contains(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public void save(Student student) {
//        students.add(student);
//        try with resources
        File file = new File("src/mvc/data/student.csv");
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(studentToString(student));
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    private String studentToString(Student student) {
        return student.getCode()+","+student.getName()+","+student.getAddress()+","+student.getPoint();
    }
}
