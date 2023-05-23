package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car implements Comparable <Car> {
    protected String make;
    protected String model;
    protected int year;
    protected String color;
    protected String owner;
    protected int odometer;
    protected int numRepairs;

    protected void sellTo(String newOwner) {
        owner = newOwner;
    }
    protected void repair() {
        numRepairs += 1;
    }
    protected void travel(int i) {
        odometer += i;
    }
    protected boolean isReliable() {
        return (2023 - year) / numRepairs > 1;
    }
    protected boolean isHighMileage() {
        return odometer / (2023 - year) > 12000;
    }

    protected Object getModel() {
        return model;
    }

    protected String getMake() {
        return make;
    }

    protected boolean getOdometer() {
        return true;
    }
    protected int getNumRepairs() {
        return numRepairs;
    }
    protected String getOwner() {
        return owner;
    }

    public Car (String make, String model, int year, String color, String owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.owner = owner;
        this.odometer = 0;
        this.numRepairs = 0;
    }

    public int compareTo(Car other) {
        int makeComparison = make.compareTo(other.make);
        if (makeComparison != 0) {
            return makeComparison;
        } else {
            return model.compareTo(other.model);
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A8", 2022, "black", "Sooah Lee");
        Car car2 = new Car("Hyundai", "Grandeur", 2023, "blue", "Chaehyun Kim");
        Car car3 = new Car("Genesis", "GV70", 2020, "White", "Hyeonha Hwang");
        Car car4 = new Car("Volvo", "S60", 2022, "silver", "Heejun Chang");

        car1.sellTo("Jihyeon Lee");
        System.out.println(car1.getOwner());

        car2.repair();
        System.out.println(car2.getNumRepairs());

        car3.travel(1000);
        System.out.println(car3.getOdometer());

        car4.repair();
        car4.repair();
        car4.repair();
        System.out.println(car4.isReliable());

        car4.travel(15000);
        System.out.println(car4.isHighMileage());

        List <Car> cars = new ArrayList<>();
        cars.add(car2);
        cars.add(car1);
        cars.add(car4);
        cars.add(car3);

        Collections.sort(cars);

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car.getMake() + " " + car.getModel());
        }
    }
}

