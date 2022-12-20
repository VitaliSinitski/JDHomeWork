package homework.lesson02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
Задание 72
Создать собственную аннотацию @academyinfo c полем year.
Создать метод, помеченный этой анотацией с заданным year и метод без нее.
С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */
public class AcademyInfoClass {

    String info;
    String courses;
    @AcademyInfo(year = 2020)
    public void getAcademyInfo () {
        System.out.println("It`s our Academy");
    }

    @AcademyInfo
    public void getAcademyCoursesInfo () {
        System.out.println("It`s our Academycourses");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AcademyInfoClass academyInfo = new AcademyInfoClass();
        Class<? extends AcademyInfoClass> academyInfoClass = academyInfo.getClass();
        Method getAcademyInfoMethod = academyInfoClass.getMethod("getAcademyInfo");
        Method getAcademyCoursesInfoMethod = academyInfoClass.getMethod("getAcademyCoursesInfo");

        Annotation[] getAcademyInfoAnnotation = getAcademyInfoMethod.getAnnotations();
        System.out.println(Arrays.toString(getAcademyInfoAnnotation));
        Annotation[] getAcademyCoursesInfoAnnotation = getAcademyCoursesInfoMethod.getAnnotations();
        System.out.println(Arrays.toString(getAcademyCoursesInfoAnnotation));

    }
}
