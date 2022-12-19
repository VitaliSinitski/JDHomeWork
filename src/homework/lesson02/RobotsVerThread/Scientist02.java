package homework.lesson02.RobotsVerThread;

public class Scientist02 extends Thread {
    Dumb dumb;
    public Scientist02(Dumb dumb) {
        this.dumb = dumb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            dumb.sci02PartsCollector();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
