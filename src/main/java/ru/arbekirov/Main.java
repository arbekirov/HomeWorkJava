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

        boolean andResult = x && y; // Логическое И (AND)
        boolean orResult = x || y;  // Логическое ИЛИ (OR)
        boolean notResultX = !x;    // Логическое НЕ (NOT)
        boolean notResultY = !y;    // Логическое НЕ (NOT)

        System.out.println("Логическое И (AND): " + andResult);
        System.out.println("Логическое ИЛИ (OR): " + orResult);
        System.out.println("Логическое НЕ (NOT) для x: " + notResultX);
        System.out.println("Логическое НЕ (NOT) для y: " + notResultY);
    }
}

    }
}
