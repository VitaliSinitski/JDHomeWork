package homework.lesson03;

/**
 * Strategy 2
 * Конкретная стратегия. Реализует 2-ой тип студентов.
 */

class StudentsType02 implements StudentsTypes {

    @Override
    public void learningType(double skill) {
        int learningTime = (int) (StudentClient.BEST_TIME_FOR_FIRST_TYPE * 2 / skill);

        System.out.println("Тип студента: 2; талант студента: "
                + skill + "; время необходимое для разбора: "
                + learningTime / 2 + " часов, для практики: "
                + learningTime / 2 + " часов, сумарное время на освоение навыка: "
                + learningTime + " часов");
    }
}