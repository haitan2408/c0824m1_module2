package ss16_thread;

public class Demo implements Runnable{

    @Override
    public void run() {
        System.out.println("Start");
        for (int i =0; i < 5; i++) {
            System.out.println("Lần thứ" + i);
            try {
//                Giả sử đây là tác vụ cần 1s để hoàn thành
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Lỗi");
            }
        }
    }

    public static void main(String[] args) {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        Thread thread1 = new Thread(demo1);
        Thread thread2 = new Thread(demo2);
        thread1.start();

        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Lỗi");
        }
        System.out.println("Đăng bài thành công");
    }
}
