package homework.lesson02.robots01;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RobotProducer {
    private Dumb dumb;
    DumbUtils dumbUtils = new DumbUtils();
    public RobotProducer(Dumb dumb) {
        this.dumb = dumb;
    }

    public Map<RobotParts, Integer> robotFactoryInitial() {
        Map<RobotParts, Integer> map = new HashMap<>();
        for (RobotParts robotParts : RobotParts.values()) {
            map.put(robotParts, 0);
        }
        return map;
    }

    public int robotFactory(List<RobotParts> list) {
        Map<RobotParts, Integer> map = new HashMap<>(robotFactoryInitial());
        for (RobotParts robotParts : list) {
            map.computeIfPresent(robotParts, (k, v) -> v + 1);
        }
        return Collections.min(map.values());
    }

    public void counterRobots(List<RobotParts> s1, List<RobotParts> s2) {
        int sc01 = robotFactory(s1);
        int sc02 = robotFactory(s2);
        System.out.println();
        System.out.println("====================");

        System.out.println("Всего было выброшено на свалку фабрикой: "
                + (dumbUtils.getAmountOfAllMadeParts()
                + dumbUtils.getAmountOfFirstNightParts()) + " деталей роботов");

        System.out.println("Первый прислужник собрал: " + dumbUtils.getServ01Counter() + " частей роботов");
        System.out.println("Второй прислужник собрал: " + dumbUtils.getServ02Counter() + " частей роботов");
        System.out.println("Первый ученый собрал: " + sc01 + " роботов");
        System.out.println("Второй ученый собрал: " + sc02 + " роботов");

        if (sc01 > sc02) {
            System.out.println("Победил первый ученый. Он собрал " + sc01 + " роботов. Ура!!!");
        } else if (sc02 > sc01) {
            System.out.println("Победил второй ученый. Он собрал " + sc02 + " роботов. Ура!!!");
        } else {
            System.out.println("Ничья. Ученые собрали каждый по " + sc01 + " роботов");
        }

    }

    public void result () {
        counterRobots(dumb.sci01PartList, dumb.sci02PartList);
    }

}
