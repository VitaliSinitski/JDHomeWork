package homework.lesson02.RobotsVerThread;

public class Factory extends Thread {
    Dumb dumb;

    public Factory(Dumb dumb) {
        this.dumb = dumb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            dumb.randomPartProducer();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
