package homework.lesson02;

import java.util.Arrays;

/*
Задание 70
Создать класс Man c произвольным набором полей и методов (не менее 3) Создать метод,
который распечатает информацию о классе с помощью рефлексии.
Вызвать метод с помощью рефлексии из основной программы.
 */

public class Man {
    private String name;
    private String address;
    private int age;

    public Man (String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void sayHello (){
        System.out.println("Man name: " + name + " say hello!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void printClassInfo(Object o) {
        Class<Man> manClass = Man.class;
        System.out.println("Имя класс: " + manClass);
        System.out.println("Поля класса: " + Arrays.toString(manClass.getDeclaredFields()));
        System.out.println("Родительский класс: " + manClass.getSuperclass());
        System.out.println("Методы класса: " + Arrays.toString(manClass.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(manClass.getConstructors()));
    }

    public static void main(String[] args) {

        printClassInfo(new Man("John", "Minsk", 20));



    }
}
