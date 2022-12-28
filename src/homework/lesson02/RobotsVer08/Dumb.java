package homework.lesson02.RobotsVer08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dumb {

    public static final Random random = new Random();
    public volatile int randomPart = random.nextInt(1, 5);
    public volatile static int nightCounter = 1;
    public static int serv01Counter = 0;
    public static int serv02Counter = 0;
    public static int amountOfFirstNightParts = 20;
    public static int amountOfAllMadeParts = 0;

    public List<RobotParts> partsList = firstNightRandomPart(amountOfFirstNightParts);

    public final List<RobotParts> sci01PartList = new ArrayList<>();
    public final List<RobotParts> sci02PartList = new ArrayList<>();



    public static RobotParts getRandomPart() {
        RobotParts[] parts = RobotParts.values();
        RobotParts newParts = parts[random.nextInt(parts.length)];
        System.out.println("--------Фабрика выбрасывает: " + newParts + " - (ночь = " + nightCounter + " )");
        return newParts;
    }

    public static List<RobotParts> firstNightRandomPart(int count) {
        List<RobotParts> list = new ArrayList<>();
        System.out.println("Фабрика. (Ночь = 1 )");
        System.out.println("Фабрика выбрасывает на свалку: " + count + " деталей. " + " (Ночь = " + nightCounter + " )");
        for (int i = 0; i < count; i++) {
            list.add(getRandomPart());
        }
        return list;
    }

    public synchronized void sci01PartsCollector() {
        int randomAmountOfParts = randomPart;
        int i = 1;
        while (!partsList.isEmpty() && i <= randomAmountOfParts) {
            int amountOfPartsToTake = Math.min(randomAmountOfParts, partsList.size());
            int randomPartNumber = random.nextInt(amountOfPartsToTake);
            RobotParts robotPart = partsList.get(randomPartNumber);
            partsList.remove(randomPartNumber);
            sci01PartList.add(robotPart);
            System.out.println("Прислужник №: 1 забрал: ==> " + robotPart + ". (Ночь = " + nightCounter + " )");
            serv01Counter++;
            i++;
        }
        System.out.println("Прислужник №: 1 забрал: " + (i - 1) +  " деталей. (Ночь = " + nightCounter + " )");
    }

    public synchronized void sci02PartsCollector() {
        int randomAmountOfParts = randomPart;
        int i = 1;
        while (!partsList.isEmpty() && i <= randomAmountOfParts) {
            int amountOfPartsToTake = Math.min(randomAmountOfParts, partsList.size());
            int randomPartNumber = random.nextInt(amountOfPartsToTake);
            RobotParts robotPart = partsList.get(randomPartNumber);
            partsList.remove(randomPartNumber);
            sci02PartList.add(robotPart);
            System.out.println("Прислужник №: 2 забрал: ==> " + robotPart + ". (Ночь = " + nightCounter + " )");
            serv02Counter++;
            i++;
        }
        System.out.println("Прислужник №: 2 забрал: " + (i - 1) +  " деталей. (Ночь = " + nightCounter + " )");
    }

    public void randomPartProducer() {
        int nextPart = random.nextInt(1, 5);
        System.out.println(">>>>>>>>>>>>Фабрика произвела: " + nextPart + " деталей" + ". (Ночь = " + nightCounter + " )");
        for (int i = 0; i < nextPart; i++) {
            partsList.add(getRandomPart());
        }
        amountOfAllMadeParts+=nextPart;
    }




}