import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void printSeparator(int exercise) {

        System.out.println("exercise = " + exercise);
    }

    public static void changeValue(int value) {
        value = 22;
        System.out.println("Измененное значение = " + value); // локальная переменная, занимающая объем памяти 4 байта
    }

    public static void changeNumber(Integer number) { //создаем другую переменную которая копирует адрес на объект 33, number "смотрит" на объект 33

        number = 22; // создаем объект 22 и присваем ему обращение по этой ссылке number, которая "смотрит" на объект 22
    }

    public static void changeValue3 (Integer[] value3) { // value3 "смотрит" на объект new Integer [] {3,4}
        value3 = new Integer[]{1, 2}; // создаем новый массив new Integer [] {1,2} и присваиваем его входному параметру value3 ("смотрит" на объект Integer [] {1,2})
    }

    public static void changeValue4 (Integer[] value4) { // value "смотрит" на объект Integer[] {3, 4}
        value4 [0] = 99; // меняем объект Integer[] {3, 4} по ссылке value на объект Integer[] {99, 4}
        //  value на объект Integer[] {99, 4}
    }

    public static void changePerson(Person person) { // value 'смотрит' на объект "Lyapis", "Trubetskoy"
        person = new Person("Ilya", "Lagutenko"); // создаем навый объект person "Ilya", "Lagutenko"
    }

    public static void changePerson1(Person person1) { // value 'смотрит' на объект "Lyapis", "Trubetskoy"
        person1.setName("Ilya"); //меняем поля объекта person1  "Lyapis"
        person1.setSurname("Lagutenko"); ////меняем объекта person1 "Trubetskoy"
        // person1 смотрит на объект "Ilya Lagutenko"
    }
    public static void main(String[] args) {
        printSeparator(1);
        int value = 33; // переменная, занимающая объем памяти 4 байта, область определения другой переменной value = 22; не имеет ничего общего с данной переменной
        System.out.println("Изначальное значение value: " + value);
        changeValue(value); //ПОЧЕМУ ВЫВОДИТ 22? в разборе дз не запустил код. Может быть потому что int - примитивный тип перменной, который хранится в heap?

        printSeparator(2);

        Integer number = 33; // ссылка 8 байт указывает на объект 33, 33 - объект, не примитив; Integer – обертка над примитивными типами
        System.out.println("number = " + number); //
        changeNumber(number); // ссылка передается в этот метож

        printSeparator(3);

        Integer[] value3 = new Integer[] {3, 4};
        System.out.println("Значение value до изменения: " + Arrays.toString(value3) ); // выводим начальное значение массива value3
        System.out.println("Значение value после изменения: " + Arrays.toString(value3)); // выводим значение массива value3 после вызова метода
        // передаем ссылку на массив, а не значение

        printSeparator(4);

        Integer[] value4 = {3, 4};
        System.out.println("Значение value до изменения: " + Arrays.toString(value4)); // выводим начальное значение массива value4
        changeValue4 (value4); // вызываем метод changeValue
        System.out.println("Значение value после изменения: " + Arrays.toString(value4)); // выводим значение массива value4 после вызова метода

        printSeparator(5);

        Person person = new Person("Lyapis", "Trubetskoy"); // создаем новый объект
        System.out.println("Значение person до изменения: " + person);
        changePerson(person); // после выполнение метода объект "Ilya", "Lagutenko" становится не достижим, так как это переменная ссылочного типа (после завершения работы метода нет ссылки, локальная переменая удаляется, объект умрет при следующей сборке мусора)
        System.out.println("Значение person после изменения: " + person);

        printSeparator(6);

        Person person1 = new Person("Lyapis", "Trubetskoy");
        changePerson1(person1);
        System.out.println(person1);

        printSeparator(0);

    }
}