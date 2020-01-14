package thread;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName()+"线程正在运行~");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        System.out.println("主线程 1");
        MyThread mt1 = new MyThread("线程 1");
        MyThread mt2 = new MyThread("线程 2");
        // 启动线程，运行是随机的
        mt1.start();
        mt2.start();
    }
}
