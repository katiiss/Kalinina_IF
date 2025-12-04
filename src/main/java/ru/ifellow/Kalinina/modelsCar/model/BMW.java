package ru.ifellow.Kalinina.modelsCar.model;

import ru.ifellow.Kalinina.modelsCar.Car;

public class BMW extends Car {
    public BMW(String yearOfRelease, String vin, int horsepower, String driveType, String bodyType, String color) {
        super("BMW", yearOfRelease, vin, horsepower, driveType, bodyType, color);
    }
}
