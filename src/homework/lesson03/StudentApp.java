package homework.lesson03;



public class StudentApp {

    public static void main(String[] args) {

        StudentClient studentClient = new StudentClient();

        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0, 1, 2 -> studentClient.setStudentTypes(new StudentsType01());
                case 3, 4, 5 -> studentClient.setStudentTypes(new StudentsType02());
                case 6, 7, 8 -> studentClient.setStudentTypes(new StudentsType03());
            }
            studentClient.executeStudentTypes();
        }
    }

}