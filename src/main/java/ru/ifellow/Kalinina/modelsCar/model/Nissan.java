package ru.ifellow.Kalinina.modelsCar.model;

import ru.ifellow.Kalinina.modelsCar.Car;

public class Nissan extends Car {
    public Nissan(String yearOfRelease, String vin, int horsepower, String driveType, String bodyType, String color) {
        super("Nissan", yearOfRelease, vin, horsepower, driveType, bodyType, color);
    }
}
