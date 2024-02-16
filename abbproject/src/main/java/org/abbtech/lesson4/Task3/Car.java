package src.main.java.org.abbtech.lesson4.Task3;

public class Car {
    String brand;
    String model;
    int yearofProduction;
    String fuelType;
    double speed;

    public Car(String model, int yearofProduction, String fuelType) {
        this.model = model;
        this.yearofProduction = yearofProduction;
        this.fuelType = fuelType;
        this.speed = 0;
    }

    public Car() {

    }

    private double speed(double increasedSpeed) {
        return speed + increasedSpeed;
    }

    private double slow(double reductionSpeed) {
        return speed + reductionSpeed;
    }

    private double stop() {
        return 0;
    }

    private String checkSpeed() {

        if (speed > 100) {
            return "Speeding warning";
        }
        return "";
    }
}

