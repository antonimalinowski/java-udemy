package section02.exercise07;

import java.time.YearMonth;

public class Car {
    private String brand;
    private String model;
    private String color;
    private YearMonth year;

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "CX5", "red", YearMonth.of(2008, 8));

        System.out.println(car1);
    }

    public Car(String brand, String model, String color, YearMonth year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
