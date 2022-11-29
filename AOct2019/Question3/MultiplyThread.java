package PastPapers.AOct2019.Question3;

public class MultiplyThread extends Thread {

    Object lock;
    int start;
    int range;

    public MultiplyThread(Object lock, int start, int range) {
        this.lock = lock;
        this.start = start;
        this.range = range;
    }

    void multiplyNumbers(Object lock, int start, int range) {
        for(int i = start; i <= range; i++ ) {
            lock.notifyAll();
            System.out.print(Thread.currentThread().getName() + " => ");
            System.out.println(i + " x " + i + " = " + (i*i));
            try {
                Thread.sleep(1000);
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        synchronized (lock) {
            multiplyNumbers(lock, start, range);
        }
    }

}
