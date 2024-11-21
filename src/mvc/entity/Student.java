package mvc.entity;

import ss7_abstract.IPersonService;
import ss7_abstract.IStudentService;

public class Student extends Person {
    private double point;

    public Student() {
    }

    public Student(int code, String name, String address, double point) {
        super(code, name, address);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString()+", Student{" +
                "point=" + point +
                '}';
    }
}