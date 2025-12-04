package ru.ifellow.Kalinina;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //it's ru.ifellow.Kalinina.Main origin
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Audi("2001", "WAUZZZ8K9MA123456", 249, "полный", "седан", "черный"));
        cars.add(new BMW("2018", "WBA8E9C58J7890123", 184, "задний", "внедорожник", "белый"));
        cars.add(new Lexus("2022", "JTJBC1BAXH2123456", 311, "полный", "седан", "синий"));
        cars.add(new Nissan("2005", "JN1CA21D8MT654321", 126, "передний", "хэтчбек", "зеленый"));
        cars.add(new Opel("2019", "W0L0TGF4XF1234567", 115, "передний", "универсал", "красный"));
        cars.add(new Audi("2003", "WAUZZZ4G6FN234567", 190, "полный", "купе", "серебристый"));
        cars.add(new BMW("2023", "WBACN61060L345678", 340, "полный", "седан", "черный"));
        cars.add(new Lexus("2008", "JTJHY7AX7H4567890", 256, "задний", "внедорожник", "зеленый"));
        cars.add(new Nissan("2000", "JN1AZ4EH3CM567890", 140, "передний", "седан", "серый"));
        cars.add(new Opel("2021", "W0L0T8EP5M6789012", 130, "передний", "хэтчбек", "белый"));

        System.out.println("---Автомобили после 2006 года---");
        printCarsAfter2006(cars);

        System.out.println("---Изменение зеленого цвета на красный---");
        changeGreenToRed(cars);

        System.out.println("---Автомобили с типом кузова: внедорожник---");
        printCarsJeep(cars);
    }

    public static void printCarsAfter2006(List<Car> cars) {
        for (Car car : cars) {
            try {
                int year = Integer.parseInt(car.getYearOfRelease());
                if (year > 2006) {
                    car.informationAboutTheCar();
                }
                else {
                    System.out.print("Устаревший авто - ");
                    car.informationBrandAndVin();
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка в формате года у автомобиля " + car.getBrand()+ " "+car.getVin());
                System.out.println();
            }
        }
    }

    public static void changeGreenToRed(List<Car> cars) {
        for (Car car : cars){
            if ("зеленый".equalsIgnoreCase(car.getColor())) {
                System.out.println("До изменения цвета:");
                car.informationAboutTheCar();
                car.changeColor("красный");
                System.out.println("После изменения цвета:");
                car.informationAboutTheCar();
            }
        }
    }

    public static void printCarsJeep(List<Car> cars) {
        for (Car car : cars){
            if ("внедорожник".equalsIgnoreCase(car.getBodyType())) {
                System.out.println();
                System.out.println("На этом автомобиле можно ездить по грязи, снегу, песку ");
                car.informationBrandAndVin();
            }
            else {
                System.out.println("Для рыбалки/охоты лучше выбрать внедорожник");
            }
        }
    }
}
