
public class User {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public static void main(String[] args) {
        // Створюємо 10 об'єктів класу User
        User user1 = new User(1, 25, "John", "Doe", 70.5, 180.0);
        User user2 = new User(2, 30, "Alice", "Smith", 65.2, 165.0);
        User user3 = new User(3, 28, "Bob", "Johnson", 80.0, 175.0);
        User user4 = new User(4, 35, "Emily", "Brown", 55.7, 160.0);
        User user5 = new User(5, 27, "Michael", "Wilson", 90.3, 190.0);
        User user6 = new User(6, 32, "Emma", "Davis", 63.8, 170.0);
        User user7 = new User(7, 29, "William", "Miller", 75.1, 185.0);
        User user8 = new User(8, 31, "Olivia", "Taylor", 68.9, 175.0);
        User user9 = new User(9, 26, "James", "Anderson", 72.6, 180.0);
        User user10 = new User(10, 33, "Sophia", "Martinez", 61.4, 168.0);

        // Додаємо між собою значення їх віку і виводимо в консоль
        int totalAge = user1.age + user2.age + user3.age + user4.age + user5.age
                + user6.age + user7.age + user8.age + user9.age + user10.age;
        System.out.println("Сума віку: " + totalAge);

        // Додаємо між собою значення їх ваги і виводимо в консоль
        double totalWeight = user1.weight + user2.weight + user3.weight + user4.weight + user5.weight
                + user6.weight + user7.weight + user8.weight + user9.weight + user10.weight;
        System.out.println("Сума ваги: " + totalWeight);

        // Додаємо між собою значення їх зросту і виводимо в консоль
        double totalHeight = user1.height + user2.height + user3.height + user4.height + user5.height
                + user6.height + user7.height + user8.height + user9.height + user10.height;
        System.out.println("Сума зросту: " + totalHeight);
    }
}
