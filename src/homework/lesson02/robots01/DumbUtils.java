package homework.lesson02.robots01;


import java.util.Random;

public class DumbUtils {

    Random random = new Random();
    static volatile int nightCounter = 1;
    static int serv01Counter = 0;
    static int serv02Counter = 0;
    private int amountOfFirstNightParts = 20;
    static int amountOfAllMadeParts = 0;

    public int randomInt(int Next) {
        return random.nextInt(Next);
    }
    public int everyDayRandomPart() {
        return random.nextInt(5) + 1;
    }
    public void setNightCounter(int i) {
        nightCounter = i;
    }
    public int getServ01Counter() {
        return serv01Counter;
    }
    public int getServ02Counter() {
        return serv02Counter;
    }
    public int getAmountOfFirstNightParts() {
        return amountOfFirstNightParts;
    }
    public int getAmountOfAllMadeParts() {
        return amountOfAllMadeParts;
    }
}
