package ss7_abstract;

public class Teacher extends Person implements IPersonService{
    @Override
    public void work() {
        System.out.println("Đi dạy");
    }

    @Override
    public void run() {

    }
}
