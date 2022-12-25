package homework.lesson03;



public class StudentApp {

    public static void main(String[] args) {

        StudentClient studentClient = new StudentClient();

        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    studentClient.setStudentTypes(new StudentsType01());
                    break;
                case 3:
                case 4:
                case 5:
                    studentClient.setStudentTypes(new StudentsType02());
                    break;
                case 6:
                case 7:
                case 8:
                    studentClient.setStudentTypes(new StudentsType03());
                    break;
            }
            studentClient.executeStudentTypes();
        }
    }

}