import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void printSeparator(int exercise) {
        System.out.println("exercise = " + exercise);
    }

    public static void changeValue(int value) {
        value = 22;
        System.out.println("Измененное значение = " + value);
    }

    public static void changeNumber(Integer number) {
        number = 22;
    }

    public static void changeValue3 (Integer[] value3) {
        value3 = new Integer[]{1, 2}; // создаем новый массив и присваиваем его входному параметру value3
    }

    public static void changeValue4 (Integer[] value4) {
        value4 [0] = 99; // изменяем первый элемент массива value4 на 99
    }

    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }


    public static void main(String[] args) {
        printSeparator(1);
        int value = 33;
        System.out.println("Изначальное значение value: " + value);
        changeValue(value);

        printSeparator(2);

        Integer number = 33;
        System.out.println("number = " + number);
        changeNumber(number); // метод changeNumber принимает значение параметра не по значению, а по ссылке. В методе создается новая локальная переменная

        printSeparator(3);

        Integer[] value3 = {3, 4};
        System.out.println("Значение value до изменения: " + Arrays.toString(value3) ); // выводим начальное значение массива value3
        changeValue(value); // вызываем метод changeValue
        System.out.println("Значение value после изменения: " + Arrays.toString(value3)); // выводим значение массива value3 после вызова метода
        // передаем ссылку на массив, а не значение

        printSeparator(4);

        Integer[] value4 = {3, 4};
        System.out.println("Значение value до изменения: " + Arrays.toString(value4)); // выводим начальное значение массива value4
        changeValue4 (value4); // вызываем метод changeValue
        System.out.println("Значение value после изменения: " + Arrays.toString(value4)); // выводим значение массива value4 после вызова метода

        printSeparator(5);

        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("Значение person до изменения: " + person);
        changePerson(person);
        System.out.println("Значение person после изменения: " + person);

        printSeparator(6);

        Person person1 = new Person("Lyapis", "Trubetskoy");
        changePerson(person1);
        System.out.println(person1);

        printSeparator(0);

    }
}