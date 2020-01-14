package thread;

class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i <=100; i++) {
            System.out.println(getName()+"线程正在运行~" + i);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        MyThread2 mt1 = new MyThread2();
        mt1.start();
        try {
            // mt1.join();
            mt1.join(10); // 占用线程的时间，如果不写，则需要等待该线程结束后才运行其他线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <=10; i++) {
            System.out.println("主线程正在运行~" + i);
        }
    }
}
