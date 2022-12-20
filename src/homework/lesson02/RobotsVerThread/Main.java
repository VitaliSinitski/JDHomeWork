package homework.lesson02.RobotsVerThread;

public class Main {
    public static void main(String[] args) {

        Dumb dumb = new Dumb();

        Scientist01 sci01Thread = new Scientist01(dumb);
        Scientist02 sci02Thread = new Scientist02(dumb);
        Factory factoryThread = new Factory(dumb);

        sci01Thread.start();
        sci02Thread.start();
        factoryThread.start();

        try {
            sci01Thread.join();
            sci02Thread.join();
            factoryThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int countOfSci01Robot = dumb.robotFactory(dumb.sci01PartList);
        int countOfSci02Robot = dumb.robotFactory(dumb.sci02PartList);

        dumb.winner(countOfSci01Robot, countOfSci02Robot);

    }

}
