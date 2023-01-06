package homework.lesson02.robots01;

public class PartsProducer extends Thread {

    Dumb dumb;
    DumbUtils dumbUtils = new DumbUtils();

    public PartsProducer(Dumb dumb) {
        this.dumb = dumb;
    }

    @Override
    public void run() {
        for (int i = 2; i < 100; i++) {
            dumbUtils.setNightCounter(i);

            System.out.println("=== Внимание!!! === Фабрика выбрасывает детали на свалку. (ночь № " + i + " )");
            System.out.println("На свалке в данный момент находится: "
                    + dumb.getPartsList().size()
                    + " деталей"
                    + " - (ночь = " + i + " )");
            dumb.randomPartProducer();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}