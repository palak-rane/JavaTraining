package exceptions;

public class ThreadSleep {

    public void testSleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ThreadSleep t = new ThreadSleep();
        t.testSleep();
    }
}
