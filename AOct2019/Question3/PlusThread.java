package PastPapers.AOct2019.Question3;

public class PlusThread extends Thread {
    Object lock;
    int start;
    int range;

    public PlusThread(Object lock, int start, int range) {
        this.lock = lock;
        this.start = start;
        this.range = range;
    }

    void addNumbers(Object lock, int start, int range) {
        for(int i = start; i <= range; i++ ) {
            lock.notifyAll();
            try {
                Thread.sleep(1000);
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(Thread.currentThread().getName() + " => ");
            System.out.println(i + " + " + i + " = " + (i+i));
        }
    }

    public void run() {
        synchronized (lock) {
            addNumbers(lock, start, range);
        }
    }
}