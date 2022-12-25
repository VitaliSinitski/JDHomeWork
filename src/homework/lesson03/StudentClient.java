package homework.lesson03;


//Context
class StudentClient {

    StudentsTypes studentsTypes;

    public void setStudentTypes(StudentsTypes studentTypes) {
        this.studentsTypes = studentTypes;
    }

    public void executeStudentTypes() {
        int rand = (int) (Math.random() * 10) +1;
        studentsTypes.learningType(rand/10.0);
//        studentsTypes.learningType((new Random().nextInt(10) + 1) / 10.0);
    }

    public static final int TYPE_SUPER = 198;


}