public class Main {

    public static void changeValue(int value) {
        value = 22;
        System.out.println("Измененное значение = " + value);
    }
    public static void main(String[] args) {
        int value = 33;
        System.out.println("Изначальное значение value: " + value);
        changeValue(value);
    }
}