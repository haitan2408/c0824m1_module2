package ss6;

import ss5_access_modifier.Student;

import java.util.Arrays;

public class StudentVl1 extends Student {
    private boolean isBanTru = false;

    public StudentVl1() {

    }

    public StudentVl1(int code, String name, String address, float point, boolean isBanTru) {
        super(code, name, address, point);
        this.isBanTru = isBanTru;
    }

    public static void main(String[] args) {
        // ép từ kiểu dữ con sang kiểu dữ liệu cha
//        up casting
        Student student = new StudentVl1();
//        down casting
        if(student instanceof StudentVl1) {
            System.out.println(((StudentVl1)student).isBanTru);
        }

//        student = new StudentLV2();

        Student[] students = new Student[3];
        students[0] = new StudentVl1();
//        students[1] = new StudentLV2();
        System.out.println(student);
    }

}
