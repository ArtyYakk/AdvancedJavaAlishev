package multithreading;

public class TestMulti {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
        Runner runner = new Runner();
        Runner runner2 = new Runner();

        Thread thread = new Thread(runner);
        Thread thread2 = new Thread(runner2);

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.start();

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello fro MyThread " + i);
        }
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello fro MyThread " + i);
        }
    }
}
