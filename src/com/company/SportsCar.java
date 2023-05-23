package com.company;

public class SportsCar extends Car {
    public static void main(String[] args) {
        SportsCar SportsCar1 = new SportsCar("Chevy", "Corvette", 2018, "red", "John Doe", 200, 20, true);
        System.out.println(SportsCar1.isSnazzy());
        System.out.println(SportsCar1.getMaxSpeed());
        System.out.println(SportsCar1.getSeconds());
        System.out.println(SportsCar1.isConvertible());
    }

    protected int maxSpeed;
    protected int seconds;
    protected boolean isConvertible;
    protected boolean isSnazzy() {
        return maxSpeed >= 150 && isConvertible && (color.equals("red") || color.equals("Purple") || color.equals("yellow"));
    }
    protected int getMaxSpeed() {
        return maxSpeed;
    }
    protected int getSeconds() {
        return seconds;
    }
    protected boolean isConvertible() {
        return isConvertible;
    }

    public SportsCar(String make, String model, int year, String color, String owner, int maxSpeed, int seconds, boolean isConvertible) {
        super(make, model, year, color, owner);
        this.maxSpeed = maxSpeed;
        this.seconds = seconds;
        this.isConvertible = isConvertible;
    }
}

