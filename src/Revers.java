public class Revers {
    public static void main(String[] args) {
        int number = 849;
        int reversedNumber = 0;

        // Вилучення цифр і "реверсування"
        while (number != 0) {
            int digit = number % 10; // Отримуєм останню цифру числа
            reversedNumber = reversedNumber * 10 + digit; // Додаєм цифру до результату
            number /= 10; // Забираєм останню цифру з числа
        }

        System.out.println("Розвернуте число: " + reversedNumber);
    }
}
