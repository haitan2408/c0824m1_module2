package ss5_access_modifier;

import java.util.Arrays;

public class Student {
    private int code;
    private String name;
    private String address;
    private float point;

    //    Access_modifier NameClass(param) {
//    }
    public Student(int code, String name, String address, float point) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.point = point;
    }

    public Student() {
//        System.out.println("123");
        this("Hải");

    }

    public Student(String name) {

        this.name = name;
    }


    public Student(float point) {
        this.point = point;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {

        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public void study() {
        System.out.println(name + " đang đi học.");
    }

    public void displayRank() {

        if (this.point >= 8) {
            System.out.println("Giỏi");
        } else if (this.point >= 6.5) {
            System.out.println("Khá");
        } else if (this.point >= 5) {
            System.out.println("Trung bình");
        } else {
            System.out.println("yếu");
        }

    }

    //    Override: kế thừa.
    @Override
    public String toString() {
        return "Mã: " + code + ", tên: " + name + ", địa chỉ:" + address + ", điểm: " + point;
    }

    //    static nested class
    public static class Demo1 {

    }

    //    inner class
    public class Demo2 {

    }

}

