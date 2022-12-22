package homework.lesson03;

import java.util.Random;

//Context
class StudentClient {

    StudentsTypes studentsTypes;

    public void setStudentTypes(StudentsTypes studentTypes) {
        this.studentsTypes = studentTypes;
    }

    public void executeStudentTypes() {
        studentsTypes.learningType((new Random().nextInt(10) + 1) / 10.0);
    }

    public static final int typeSuper = 198;


}