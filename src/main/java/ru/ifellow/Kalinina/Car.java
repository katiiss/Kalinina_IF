package ru.ifellow.Kalinina;

public abstract class Car {
    private String brand;
    private String yearOfRelease;
    private String vin;
    private int horsepower;
    private String driveType;
    private String bodyType;
    private String color;

    public Car(String brand,String yearOfRelease,String vin,int horsepower,String driveType,String bodyType,String color){
        this.brand=brand;
        this.yearOfRelease=yearOfRelease;
        this.vin=vin;
        this.horsepower=horsepower;
        this.driveType=driveType;
        this.bodyType=bodyType;
        this.color=color;
    }

    protected Car() {
    }

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

    public String getBrand() {
        return brand;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public String getVin() {
        return vin;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getDriveType() {
        return driveType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getColor() {
        return color;
    }
}
