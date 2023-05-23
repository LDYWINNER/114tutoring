package com.company;

public class PassengerCar extends Car {
    public static void main(String[] args) {
        PassengerCar PassengerCar1 = new PassengerCar("Chevy", "Corvette", 2018, "red", "John Doe", 5, 8, "manual");
        System.out.println(PassengerCar1.isComfortable());
        System.out.println(PassengerCar1.isHardToDrive());
        System.out.println(PassengerCar1.getNumPassengers());
        System.out.println(PassengerCar1.getNumDoors());
        System.out.println(PassengerCar1.getTransmissionTypes());
    }

    protected int numPassengers;
    protected int numDoors;
    protected String transmissionType;

    protected boolean isComfortable() {
        return numPassengers >= 5 && numDoors >= 4 && year < 5;
    }
    protected boolean isHardToDrive() {
        return transmissionType.equals("manual");
    }
    protected int getNumPassengers() {
        return numPassengers;
    }
    protected int getNumDoors() {
        return numDoors;
    }
    protected String getTransmissionTypes() {
        return transmissionType;
    }

    public PassengerCar(String make, String model, int year, String color, String owner, int numPassengers, int numDoors, String transmissionType) {
        super(make, model, year, color, owner);
        this.numPassengers = numPassengers;
        this.numDoors = numDoors;
        this.transmissionType = transmissionType;
    }
}



