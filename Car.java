import java.util.ArrayList;
import java.util.List;
public class Car {
    private final String brand;
    private final String licensePlate;
    private final String color;
    private final int speed;
    public Car(String brand, String licensePlate, String color, int speed) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.color = color;
        this.speed = speed;
    }
    public String getBrand() {
        return brand;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
}
class Truck extends Car {
    private final int carryingCapacity;
    private final int width;
    private final int length;

    public Truck(String brand, String licensePlate, String color, int speed, int carryingCapacity, int width, int length) {
        super(brand, licensePlate, color, speed);
        this.carryingCapacity = carryingCapacity;
        this.width = width;
        this.length = length;
    }
    public int getCarryingCapacity() {
        return carryingCapacity;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
}
class PassengerCar extends Car {
    private final boolean hasChildSeat;

    public PassengerCar(String brand, String licensePlate, String color, int speed, boolean hasChildSeat) {
        super(brand, licensePlate, color, speed);
        this.hasChildSeat = hasChildSeat;
    }
    public boolean hasChildSeat() {
        return hasChildSeat;
    }
}
class Garage {
    private final List<Car> cars;
    private final int capacity;
    private final int maxLength;

    public Garage(int capacity, int maxWidth, int maxLength) {
        cars = new ArrayList<>();
        this.capacity = capacity;
        this.maxLength = maxLength;
    }

    public void addCar() {
        if (cars.size() >= capacity) {
            System.out.println("Garage is full.");
            return;
        }
    }
}