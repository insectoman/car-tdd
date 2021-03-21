package pl.edu.wsiz.cartdd.car;

import java.math.BigDecimal;

class Car {

    private Color color;
    private Make make;
    private BigDecimal fuelConsumption;
    private Integer tankCapacity;

    public Car(Color color, Make make, BigDecimal fuelConsumption, Integer tankCapacity) {
        this.color = color;
        this.make = make;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public Color getColor() {
        return color;
    }

    public Make getMake() {
        return make;
    }

    public BigDecimal getFuelConsumption() {
        return fuelConsumption;
    }

    public Integer getTankCapacity() {
        return tankCapacity;
    }

    public BigDecimal getFuelLevel() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getOdometer() {
        return BigDecimal.TEN;
    }

    public BigDecimal getDailyOdometer() {
        return BigDecimal.ONE;
    }

    public void refuel(int fuelLitres) {
    }

    enum Color {
        RED, GREEN, ORANGE, BLACK
    }

    enum Make {
        NISSAN, FORD, MAZDA, TESLA
    }
}
