public class Car {
    // Поля класу Car
    private int horsepower;
    private double engineVolume;
    private String brand;
    private String model;
    private int year;
    // Додаткові поля
    private double fuelEfficiency;
    private boolean automaticTransmission;
    private String color;
    private double price;
    private boolean isSportCar;

    // Конструктор класу Car
    public Car(int horsepower, double engineVolume, String brand, String model, int year,
               double fuelEfficiency, boolean automaticTransmission, String color, double price, boolean isSportCar) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
        this.automaticTransmission = automaticTransmission;
        this.color = color;
        this.price = price;
        this.isSportCar = isSportCar;
    }

    // Метод для обчислення загального об'єму двигунів
    public static double sumEngineVolumes(Car[] cars) {
        double sum = 0;
        for (Car car : cars) {
            sum += car.engineVolume;
        }
        return sum;
    }

    // Метод для обчислення загальної потужності
    public static int sumHorsepowers(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.horsepower;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Створюємо 10 об'єктів класу Car
        Car car1 = new Car(150, 2.0, "Toyota", "Corolla", 2015, 7.5, true, "blue", 20000, false);
        Car car2 = new Car(200, 2.5, "Honda", "Civic", 2018, 8.0, false, "red", 25000, false);
        Car car3 = new Car(180, 2.2, "Ford", "Focus", 2016, 7.8, true, "black", 22000, false);
        Car car4 = new Car(250, 3.0, "BMW", "3 Series", 2017, 9.0, true, "white", 35000, true);
        Car car5 = new Car(300, 3.5, "Mercedes-Benz", "C-Class", 2019, 8.5, false, "silver", 40000, true);
        Car car6 = new Car(170, 2.3, "Audi", "A4", 2016, 7.6, true, "gray", 28000, false);
        Car car7 = new Car(220, 2.8, "Volkswagen", "Passat", 2018, 8.2, false, "green", 30000, false);
        Car car8 = new Car(190, 2.4, "Subaru", "Impreza", 2017, 7.9, true, "orange", 24000, false);
        Car car9 = new Car(270, 3.2, "Lexus", "IS", 2019, 9.5, false, "purple", 38000, true);
        Car car10 = new Car(160, 2.1, "Hyundai", "Elantra", 2015, 7.3, true, "yellow", 18000, false);

        // Масив об'єктів класу Car
        Car[] cars = {car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};

        // Додаємо між собою значення об'ємів двигунів і виводимо в консоль
        double totalEngineVolume = sumEngineVolumes(cars);
        System.out.println("Загальний об'єм двигунів: " + totalEngineVolume);

        // Додаємо між собою значення потужностей і виводимо в консоль
        int totalHorsepower = sumHorsepowers(cars);
        System.out.println("Загальна потужність: " + totalHorsepower);
    }
}
