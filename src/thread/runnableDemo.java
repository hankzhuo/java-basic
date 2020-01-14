package thread;

class PrintRunnable implements Runnable {
    int i = 1; // 多线程共享该属性

    @Override
    public void run() {
        while (i < 10) {
            System.out.println(Thread.currentThread().getName() + "正在运行！" + (i++));
            // sleep 线程休眠，单位毫秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class runnableDemo {
    public static void main(String[] args) {
        PrintRunnable pr1 = new PrintRunnable();
        Thread t1 = new Thread(pr1);
        t1.start();
        Thread t2 = new Thread(pr1);
        t2.start();
    }
}
