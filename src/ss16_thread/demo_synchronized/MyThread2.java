package ss16_thread.demo_synchronized;

class MyThread2 extends Thread {
    Count t;

    MyThread2(Count t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }


}
