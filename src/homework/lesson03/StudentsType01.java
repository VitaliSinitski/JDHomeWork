package homework.lesson03;

//Strategy 1
public class StudentsType01 implements StudentsTypes {
    @Override
    public void learningType(double skill) {
        int learningTime = (int) (StudentClient.typeSuper / skill);

        System.out.println("Тип студента: 1; талант студента: "
                + skill + "; время необходимое для разбора: "
                + learningTime / 3 + " часов, для практики: "
                + learningTime / 3 + " часов, для нахождения в потоке: "
                + learningTime / 3 + " часов, сумарное время на освоение навыка: "
                + learningTime + " часов");
    }
}