package ss7_abstract;

public class Student extends Person implements IStudentService, IPersonService{
  private double point;

    public Student() {
    }

    public Student(int code, String name, String address, double point) {
        super(code, name, address);
        this.point = point;
    }

    @Override
    public void work() {
        System.out.println("Đi học");
    }

    @Override
    public void example() {

    }

    @Override
    public void run() {

    }


}
