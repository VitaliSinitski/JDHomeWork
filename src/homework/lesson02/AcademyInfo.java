package homework.lesson02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
Задание 72
Создать собственную аннотацию @academyinfo c полем year.
Создать метод, помеченный этой анотацией с заданным year и метод без нее.
С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AcademyInfo {
    int year() default 2022;
}
