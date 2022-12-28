package homework.lesson03.studentsVer07;

import java.util.Map;

/**
 * Strategy 2
 * Конкретная стратегия. Реализует 2-ой тип студентов.
 */

class StudentType02 implements StudentType {

    StudentData studentData = new StudentData();

    @Override
    public Map<String, Double> learningType(double skill) {
        double typeOfStudent = 2.0;
        double amountOfParts = 2;
        double learningTime = (StudentData.BEST_LEARNING_TIME / skill);
        double practiceTime = learningTime / amountOfParts;
        double analysisTime = learningTime / amountOfParts;

        Map<String, Double> map = studentData.dateOfStudentsInitial();
        map.computeIfPresent("typeOfStudent", (k, v) -> v + typeOfStudent);
        map.computeIfPresent("skillOfStudent", (k, v) -> v + skill);
        map.computeIfPresent("learningTime", (k, v) -> v + learningTime);
        map.computeIfPresent("practiceTime", (k, v) -> v + practiceTime);
        map.computeIfPresent("analysisTime", (k, v) -> v + analysisTime);
        return map;
    }
}