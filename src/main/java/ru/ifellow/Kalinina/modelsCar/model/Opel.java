package ru.ifellow.Kalinina.modelsCar.model;

import ru.ifellow.Kalinina.modelsCar.Car;

public class Opel extends Car {
    public Opel(String yearOfRelease, String vin, int horsepower, String driveType, String bodyType, String color) {
        super("Opel", yearOfRelease, vin, horsepower, driveType, bodyType, color);
    }
}
