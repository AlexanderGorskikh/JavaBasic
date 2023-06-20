import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        // Ввод данных можно осуществить с помощью объекта System.in, но это не всегда удобно, поэтому предпочтительнее
        // использовать объект класса Scanner? которому мы передадим объект System.in

        // Создадим программу, которая будет считывать введенную строку с консоли и возвращать эту строку
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую строку:");
        String st = scanner.nextLine();
        System.out.printf("Ваша строка: %s", st);
        scanner.close(); // В конце использования нужно закрывать поток считывания с консоли
    }
}
