package homework.lesson02.RobotsVerThread;

public class Scientist01 extends Thread {
    Dumb dumb;
    public Scientist01(Dumb dumb) {
        this.dumb = dumb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            dumb.sci01PartsCollector();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
