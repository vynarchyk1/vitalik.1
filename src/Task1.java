public class Task1 {
    public static void main(String[] args) {
        // Створюємо 10 цілих змінних
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int g = 70;
        int h = 80;
        int i = 90;
        int j = 100;

        // Додаємо їх між собою
        int sum = a + b + c + d + e + f + g + h + i + j;
        System.out.println("Сума: " + sum);

        // Віднімаємо їх між собою
        int subtract = a - b - c - d - e - f - g - h - i - j;
        System.out.println("Різниця: " + subtract);

        // Перемножуємо їх між собою
        int product = a * b * c * d * e * f * g * h * i * j;
        System.out.println("Добуток: " + product);

        // Ділимо їх між собою
        // Для ділення використовуємо double, щоб отримати десятковий результат
        double division = (double) sum / (double) subtract; // Ділення на 0 може виникнути, тому я використовую віднімання
        System.out.println("Частка: " + division);
    }
}
