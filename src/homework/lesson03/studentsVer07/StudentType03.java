package homework.lesson03.studentsVer07;

import java.util.Map;

/**
 * Strategy 3
 * Конкретная стратегия. Реализует 3-ий тип студентов.
 */

class StudentType03 implements StudentType {

    StudentData studentData = new StudentData();

    @Override
    public Map<String, Double> learningType(double skill) {
        double typeOfStudent = 3.0;
        double amountOfParts = 1;
        double learningTime = (StudentData.BEST_LEARNING_TIME / skill);
        double practiceTime = learningTime / amountOfParts;

        Map<String, Double> map = studentData.dateOfStudentsInitial();
        map.computeIfPresent("typeOfStudent", (k, v) -> v + typeOfStudent);
        map.computeIfPresent("skillOfStudent", (k, v) -> v + skill);
        map.computeIfPresent("learningTime", (k, v) -> v + learningTime);
        map.computeIfPresent("practiceTime", (k, v) -> v + practiceTime);
        return map;
    }
}