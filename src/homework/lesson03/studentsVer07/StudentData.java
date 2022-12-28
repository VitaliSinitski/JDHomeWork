package homework.lesson03.studentsVer07;

import java.util.HashMap;
import java.util.Map;

public class StudentData {
    public static final int BEST_LEARNING_TIME = 198;

    public Map<String, Double> dateOfStudentsInitial() {
        Map<String, Double> dateOfStudents = new HashMap<>();
        dateOfStudents.put("typeOfStudent", 0.0);
        dateOfStudents.put("skillOfStudent", 0.0);
        dateOfStudents.put("learningTime", 0.0);
        dateOfStudents.put("practiceTime", 0.0);
        dateOfStudents.put("analysisTime", 0.0);
        dateOfStudents.put("flowTime", 0.0);

        return dateOfStudents;
    }

    public static double randomSkillGenerator() {
        int skillRandomizer = (int) (Math.random() * 10) + 1;
        return skillRandomizer / 10.0;
    }


}
