public class Calculator {
    /**
     * Сложение двух чисел.
     *
     * @param a Первое число.
     * @param b Второе число.
     * @return Сумма двух чисел.
     */
    public int add(int a, int b) {
        return a + b;
    }
    /**
     * Вычитание одного числа из другого.
     *
     * @param a Минувшее число.
     * @param b Число, которое нужно вычесть.
     * @return Разность двух чисел.
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    /**
     * Умножение двух чисел.
     *
     * @param a Первое число.
     * @param b Второе число.
     * @return Произведение двух чисел.
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    /**
     * Деление одного числа на другое.
     *
     * @param a Делимое число.
     * @param b Делитель.
     * @return Результат деления.
     * @throws ArithmeticException Если делитель равен нулю.
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return (double) a / b;
    }
}