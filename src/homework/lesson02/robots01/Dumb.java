package homework.lesson02.robots01;

import java.util.ArrayList;
import java.util.List;

public class Dumb {

    DumbUtils dumbUtils = new DumbUtils();
    private List<RobotParts> partsList = firstNightRandomPart(dumbUtils.getAmountOfFirstNightParts());
    public List<RobotParts> sci01PartList = new ArrayList<>();
    public List<RobotParts> sci02PartList = new ArrayList<>();

    public List<RobotParts> getPartsList() {
        return partsList;
    }

    public /*static*/ RobotParts getEveryDayrandomPart() {
        RobotParts[] parts = RobotParts.values();
        RobotParts newParts = parts[dumbUtils.randomInt(parts.length)];
        System.out.println("--------Фабрика выбрасывает: "
                + newParts + " - (ночь = " + DumbUtils.nightCounter + " )");
        return newParts;
    }

    public void randomPartProducer() {
        int nextPart = dumbUtils.everyDayRandomPart();
        System.out.println(">>>>>>>>>>>>Фабрика произвела: "
                + nextPart + " деталей" + ". (Ночь = " + DumbUtils.nightCounter + " )");

        for (int i = 0; i < nextPart; i++) {
            getPartsList().add(getEveryDayrandomPart());
        }
        DumbUtils.amountOfAllMadeParts += nextPart;
    }

    public /*static*/ List<RobotParts> firstNightRandomPart(int count) {
        List<RobotParts> list = new ArrayList<>();
        System.out.println("Фабрика. (Ночь = 1 )");
        System.out.println("Фабрика выбрасывает на свалку: "
                + count + " деталей. " + " (Ночь = " + DumbUtils.nightCounter + " )");
        for (int i = 0; i < count; i++) {
            list.add(getEveryDayrandomPart());
        }
        return list;
    }

    public synchronized void sci01PartsCollector() {
        int randomAmountOfParts = dumbUtils.everyDayRandomPart();
        int i = 1;
        while (!partsList.isEmpty() && i <= randomAmountOfParts) {
            RobotParts robotPart = partsList.remove(dumbUtils.randomInt(partsList.size()));

            sci01PartList.add(robotPart);
            System.out.println("Прислужник №: 1 забрал: ==> "
                    + robotPart + ". (Ночь = " + DumbUtils.nightCounter + " )");
            DumbUtils.serv01Counter++;
            i++;
        }
        System.out.println("Прислужник №: 1 забрал: "
                + (i - 1) + " деталей. (Ночь = " + DumbUtils.nightCounter + " )");
    }

    public synchronized void sci02PartsCollector() {
        int randomAmountOfParts = dumbUtils.everyDayRandomPart();
        int i = 1;
        while (!partsList.isEmpty() && i <= randomAmountOfParts) {
            RobotParts robotPart = partsList.remove(dumbUtils.randomInt(partsList.size()));

            sci02PartList.add(robotPart);
            System.out.println("Прислужник №: 2 забрал: ==> "
                    + robotPart + ". (Ночь = " + DumbUtils.nightCounter + " )");
            DumbUtils.serv02Counter++;
            i++;
        }
        System.out.println("Прислужник №: 2 забрал: "
                + (i - 1) + " деталей. (Ночь = " + DumbUtils.nightCounter + " )");
    }

}
