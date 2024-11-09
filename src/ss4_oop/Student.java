package ss4_oop;

public class Student {
    int code;
    String name;
    String address;
    float point;

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
}
