package homework.lesson02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
Задание 71
Создайте класс с методов printHelloWorld(). Вызвать метод с помощью
рефлексии из основной программы.
 */

public class HelloWorld {
    private static void printHelloWorld() {
        System.out.println("Hello World!!!");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<HelloWorld> newClass = HelloWorld.class;
        HelloWorld helloW = new HelloWorld();
        Method newMethod = newClass.getDeclaredMethod("printHelloWorld");
        newMethod.setAccessible(true);
        newMethod.invoke(helloW);
    }
}
