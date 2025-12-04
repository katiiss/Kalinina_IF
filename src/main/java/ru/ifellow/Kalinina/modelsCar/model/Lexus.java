package ru.ifellow.Kalinina.modelsCar.model;

import ru.ifellow.Kalinina.modelsCar.Car;

public class Lexus extends Car {
    public Lexus(String yearOfRelease, String vin, int horsepower, String driveType, String bodyType, String color) {
        super("Lexus", yearOfRelease, vin, horsepower, driveType, bodyType, color);
    }
}
