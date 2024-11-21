package ss9;

public class Demo {

    public static int sum(int a, int b) throws Exception {
        if((long)a + b > Integer.MAX_VALUE) {
            throw new Exception("Nhập quá hạn mức lưu trữ");
        }
        return a + b;
    }


}
