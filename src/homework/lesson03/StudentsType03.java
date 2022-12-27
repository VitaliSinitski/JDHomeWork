package homework.lesson03;

/**
 * Strategy 3
 * Конкретная стратегия. Реализует 3-ий тип студентов.
 */

class StudentsType03 implements StudentsTypes {

    @Override
    public void learningType(double skill) {
        int learningTime = (int) (StudentClient.BEST_TIME_FOR_FIRST_TYPE * 3 / skill);

        System.out.println("Тип студента: 3; талант студента: "
                + skill + "; время необходимое для практики: "
                + learningTime + " часов, сумарное время на освоение навыка: "
                + learningTime + " часов");
    }
}