package homework.lesson02.RobotsVerThread;

import java.util.*;

public class Dumb {

    private static final Random random = new Random();
    private final List<RobotParts> partsList = firstNightRandomPart(20);
    public final List<RobotParts> sci01PartList = new ArrayList<>();
    public final List<RobotParts> sci02PartList = new ArrayList<>();

    enum RobotParts {
        HEAD,
        BODY,
        LEFT_HAND,
        RIGHT_HAND,
        LEFT_LEG,
        RIGHT_LEG,
        CPU,
        RAM,
        HDD
    }

    public static RobotParts getRandomPart() {
        RobotParts[] parts = RobotParts.values();
        return parts[random.nextInt(parts.length)];
    }

    public static List<RobotParts> firstNightRandomPart(int count) {
        List<RobotParts> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(getRandomPart());
        }
        return list;
    }

    public synchronized void sci01PartsCollector() {
        while (!partsList.isEmpty()) {
            int randomIndex = random.nextInt(partsList.size());
            RobotParts parts = partsList.get(randomIndex);
            partsList.remove(randomIndex);
            sci01PartList.add(parts);
        }

    }

    public synchronized void sci02PartsCollector() {
        while (!partsList.isEmpty()) {
            int randomIndex = random.nextInt(partsList.size());
            RobotParts parts = partsList.get(randomIndex);
            partsList.remove(randomIndex);
            sci02PartList.add(parts);
        }
    }

    public void randomPartProducer() {
        for (int i = 0; i < random.nextInt(1, 5); i++) {
            partsList.add(getRandomPart());
        }
    }


    public Map<RobotParts, Integer> robotFactoryInitial() {
        Map <RobotParts, Integer> map = new HashMap<>();
        for (RobotParts robotParts : RobotParts.values()) {
            map.put(robotParts, 0);
        }
        return map;
    }

    public int robotFactory (List<RobotParts> list) {
        Map<RobotParts, Integer> map = new HashMap<>(robotFactoryInitial());
        for (RobotParts robotParts : list) {
            map.computeIfPresent(robotParts, (k, v) -> v + 1);
        }
        return Collections.min(map.values());
    }

    public void winner(int sc01, int sc02) {
        if (sc01 > sc02) {
            System.out.println("Победил первый ученый. Он собрал " + sc01 + " роботов. Ура!!!");
        } else if (sc02 > sc01) {
            System.out.println("Победил второй ученый. Он собрал " + sc02 + " роботов. Ура!!!");
        } else {
            System.out.println("Ничья. Ученые собрали каждый по " + sc01 + " роботов");
        }
    }


}