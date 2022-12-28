package homework.lesson02.RobotsVer08;

public class Main {
    public static void main(String[] args) {

        Dumb dumb = new Dumb();
        RobotProducer robotProducer = new RobotProducer();

        PartsCollector01 sci01Thread = new PartsCollector01(dumb);
        PartsCollector02 sci02Thread = new PartsCollector02(dumb);
        PartsProducer partsProducerThread = new PartsProducer(dumb);

        partsProducerThread.start();
        sci01Thread.start();
        sci02Thread.start();


        try {
            partsProducerThread.join();
            sci01Thread.join();
            sci02Thread.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        robotProducer.counterRobots(dumb.sci01PartList, dumb.sci02PartList);

    }

}
