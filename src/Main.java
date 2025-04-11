public class Main {

    public static void main(String[] args) {
        // Создание экземпляра калькулятора
        Calculator calculator = new Calculator();

        // Тестирование методов
        int a = 10;
        int b = 5;

        // Сложение
        System.out.println("Сложение: " + calculator.add(a, b)); // 10 + 5 = 15

        // Вычитание
        System.out.println("Вычитание: " + calculator.subtract(a, b)); // 10 - 5 = 5

        // Умножение
        System.out.println("Умножение: " + calculator.multiply(a, b)); // 10 * 5 = 50

        // Деление
        try {
            System.out.println("Деление: " + calculator.divide(a, b)); // 10 / 5 = 2.0
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Попытка деления на ноль
        try {
            System.out.println("Деление на ноль: " + calculator.divide(a, 0)); // Ошибка
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage()); // Деление на ноль недопустимо.
        }
    }
}