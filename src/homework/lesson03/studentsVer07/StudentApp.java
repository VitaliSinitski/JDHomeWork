package homework.lesson03.studentsVer07;


import java.util.Map;

public class StudentApp {

    public static void main(String[] args) {

        StudentClient studentClient = new StudentClient();
        StudentPrint studentPrint = new StudentPrint();

        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    studentClient.setStudentType(new StudentType01());
                    break;
                case 3:
                case 4:
                case 5:
                    studentClient.setStudentType(new StudentType02());
                    break;
                case 6:
                case 7:
                case 8:
                    studentClient.setStudentType(new StudentType03());
                    break;
            }

            Map<String, Double> map = studentClient.studentType.learningType(StudentData.randomSkillGenerator());
            studentPrint.printToConsole(map);
            System.out.println();

        }
    }
}