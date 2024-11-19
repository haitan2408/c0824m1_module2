package mvc.view;

import mvc.controller.StudentController;
import mvc.entity.Student;

import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

    public static void menuStudent() {
        StudentController studentController = new StudentController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Chương trình quản lý học sinh------------");
        System.out.println("1. Thêm học sinh");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Sửa thông tin học sinh");
        System.out.println("4. Xóa học sinh");
        System.out.println("5. Quay lại");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                break;
            case 2:
                Student[] students = studentController.getAll();
                for (Student student : students) {
                    System.out.println(student);
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                return;
            default:
                System.out.println("Người dùng nhập sai, vui lòng nhập lại");
        }
    }
}
