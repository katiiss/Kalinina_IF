package ru.ifellow.Kalinina;

import ru.ifellow.Kalinina.modelsCar.Car;
import ru.ifellow.Kalinina.modelsCar.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
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
        printCarsAfterYear(cars, 2006);

        System.out.println("---Изменение зеленого цвета на красный---");
        changeColors(cars, "зеленый", "красный");

        System.out.println("---Автомобили с типом кузова: внедорожник---");
        printCarsBodyType(cars, "внедорожник");
    }

    public static void printCarsAfterYear(List<Car> cars, int years) {
        for (Car car : cars) {
            try {
                int year = Integer.parseInt(car.getYearOfRelease());
                if (year > years) {
                    car.informationAboutTheCar();
                } else {
                    System.out.print("Устаревший авто - ");
                    car.informationBrandAndVin();
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка в формате года у автомобиля " + car.getBrand() + " " + car.getVin());
                System.out.println();
            }
        }
    }

    public static void changeColors(List<Car> cars, String lastColor, String newColor) {
        for (Car car : cars) {
            if (lastColor.equalsIgnoreCase(car.getColor())) {
                System.out.println("До изменения цвета:");
                car.informationAboutTheCar();
                car.changeColor(newColor);
                System.out.println("После изменения цвета:");
                car.informationAboutTheCar();
            }
        }
    }

    public static void printCarsBodyType(List<Car> cars, String bodyType) {
        for (Car car : cars) {
            if (bodyType.equalsIgnoreCase(car.getBodyType())) {
                System.out.println();
                if ("внедорожник".equals(bodyType))
                    System.out.println("На этом автомобиле можно ездить по грязи, снегу, песку ");
                car.informationBrandAndVin();
            } else {
                if ("внедорожник".equals(bodyType))
                    System.out.println("Для рыбалки/охоты лучше выбрать внедорожник");
            }
        }
    }
}
