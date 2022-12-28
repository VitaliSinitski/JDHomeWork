package homework.lesson03.studentsVer07;

import java.util.Map;

public class StudentPrint {
    double typeOfStudent;
    double skillOfStudent;
    double learningTime;
    double practiceTime;
    double analysisTime;
    double flowTime;

    public void printToConsole(Map<String, Double> map) {
        typeOfStudent = map.get("typeOfStudent");
        skillOfStudent = map.get("skillOfStudent");
        learningTime = map.get("learningTime");
        practiceTime = map.get("practiceTime");
        analysisTime = map.get("analysisTime");
        flowTime = map.get("flowTime");

        System.out.print("Тип студента: " + typeOfStudent
                            + " тип; талант студента: " + skillOfStudent
                            + "; суммарное время на освоение навыка: " + learningTime
                            + " часов; время на практику: " + practiceTime
                            + " часов; время на разборы: " + analysisTime
                            + " часов; время на нахождение потоке: " + flowTime + " часов.");

    }
}
