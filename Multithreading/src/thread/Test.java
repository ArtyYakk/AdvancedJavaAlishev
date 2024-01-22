package thread;

public class Test  {
    public static void main(String[] args) throws InterruptedException {
//        MyThread thread = new MyThread();
//        thread.start();
//
//        MyThread thread2 = new MyThread();
//        thread2.start();


//        System.out.println("Going to sleep");
//
//        Thread.sleep(2000);
//
//        System.out.println("Awake");

        Thread thread = new Thread(new Runner());
        thread.start();

    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from my thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from my thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
