package homework.lesson03;


//Context
class StudentClient {
    public static final int BEST_TIME_FOR_FIRST_TYPE = 198;
    StudentsTypes studentsTypes;

    public void setStudentTypes(StudentsTypes studentTypes) {
        this.studentsTypes = studentTypes;
    }

    public double randomSkillGenerator() {
        int skillRandomizer = (int) (Math.random() * 10) + 1;
        return skillRandomizer / 10.0;
    }

    public static void main(String[] args) {

        StudentClient studentClient = new StudentClient();

        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 0, 1, 2 -> studentClient.setStudentTypes(new StudentsType01());
                case 3, 4, 5 -> studentClient.setStudentTypes(new StudentsType02());
                case 6, 7, 8 -> studentClient.setStudentTypes(new StudentsType03());
            }
            studentClient.studentsTypes.learningType(studentClient.randomSkillGenerator());
        }
    }
}