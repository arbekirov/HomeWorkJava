package ru.arbekirov;

public class Main {
    public static void main(String[] args) {
        // Математические операторы
        int a = 10;
        int b = 3;

        int addition = a + b; // Сложение
        int subtraction = a - b; // Вычитание
        int multiplication = a * b; // Умножение
        int division = a / b; // Деление (целочисленное)
        int remainder = a % b; // Остаток от деления

        System.out.println("Сложение: " + addition);
        System.out.println("Вычитание: " + subtraction);
        System.out.println("Умножение: " + multiplication);
        System.out.println("Деление (целочисленное): " + division);
        System.out.println("Остаток от деления: " + remainder);

        // Логические операторы
        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x&&y));
        System.out.println("x || y = " + (x||y) );
        System.out.println("!(x && y) = " + !(x && y));
    }
}
public class OverflowExample {
    public static void main(String[] args) {
        int maxIntValue = Integer.MAX_VALUE; // Максимальное значение int
        System.out.println("Максимальное значение int: " + maxIntValue);
        
        int result = maxIntValue + 1; // Попытка увеличить на 1 и вызвать переполнение
        System.out.println("Результат переполнения: " + result);
    }
}




