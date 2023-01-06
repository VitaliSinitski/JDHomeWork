package homework.lesson02.robots01;

public class PartsCollector02 extends Thread {
    Dumb dumb;

    public PartsCollector02(Dumb dumb) {
        this.dumb = dumb;
    }

    @Override
    public void run() {
        for (int i = 2; i < 100; i++) {
            System.out.println("========== Прислужник ученого № 2 идет на свалку. (Ночь = " + i + " )");
            dumb.sci02PartsCollector();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}