import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        int year = 2024;
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) && (year >= 1584) || (year % 400 == 0) && (year >= 1584);
        if (leapYear) {
            System.out.println(year + " год является високосным");
        }
        if (!leapYear) {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int numberOfDays = 1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + numberOfDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (numberOfDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (numberOfDays + 2));
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }
        System.out.println();
        System.out.println("Задача 5");
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Лето");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого времени года не существует");
        }
    }

}