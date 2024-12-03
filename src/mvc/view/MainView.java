package mvc.view;

import mvc.controller.StudentController;
import mvc.entity.Student;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------Chương trình quản lý CodeGym------------");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý giáo viên");
            System.out.println("3. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuStudent();
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Người dùng nhập sai, vui lòng nhập lại");
            }
        }
    }

    public static void menuStudent() {
        StudentController studentController = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------Chương trình quản lý học sinh------------");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Tìm kiếm học sinh theo tên");
            System.out.println("6. Quay lại");
            System.out.print("Mời bạn nhập lựa chọn: ");
            List<Student> students;
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Student student = inputStudent(scanner);
                    studentController.save(student);
                    System.out.println("Thêm mới thành công!!!!!!");
                    break;
                case 2:
                    students = studentController.getAll();
                    printStudentsTable(students);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:

                    System.out.print("Nhập vào tên cần tìm: ");
                    String name = scanner.nextLine();
                    students = studentController.findAllByName(name);
                    printStudentsTable(students);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Người dùng nhập sai, vui lòng nhập lại");
            }
        }

    }

    public static void printStudentsTable(List<Student> students) {
        System.out.println("+------+----------------------+----------------------+--------+");
        System.out.println("| Code | Name                 | Address              | Point  |");
        System.out.println("+------+----------------------+----------------------+--------+");
        for (Student temp : students) {
            System.out.println(temp);
        }
        System.out.println("+------+----------------------+----------------------+--------+");
    }

    public static Student inputStudent(Scanner scanner) {
        System.out.print("Nhập mã học sinh:");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên học sinh:");
        String name = scanner.nextLine();
        System.out.print("Nhập địa chỉ học sinh:");
        String address = scanner.nextLine();
        System.out.print("Nhập điểm học sinh:");
        double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code,name, address, point);
        return student;
    }
}
