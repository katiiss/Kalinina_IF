package ru.ifellow.Kalinina;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Car {
    private String brand;
    private String yearOfRelease;
    private String vin;
    private int horsepower;
    private String driveType;
    private String bodyType;
    private String color;

    public void changeColor(String newColor){
        this.color=newColor;
    }

    public void informationAboutTheCar(){
        System.out.println("Информация об автомобиле.");
        System.out.println("Марка: " + brand);
        System.out.println("Год выпуска: " + yearOfRelease);
        System.out.println("VIN код: " + vin);
        System.out.println("Мощность: " + horsepower + " л.с.");
        System.out.println("Тип привода: " + driveType);
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Цвет: " + color);
        System.out.println();
    }

    public void informationBrandAndVin(){
        System.out.println("Марка: " + brand);
        System.out.println("VIN код: " + vin);
        System.out.println();
    }
}
