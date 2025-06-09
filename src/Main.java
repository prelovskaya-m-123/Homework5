public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача 3");
        int year = 1589;
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) && (year >= 1584) || (year % 400 == 0) && (year >= 1584);
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
        System.out.println("Задача 4");
        int deliveryDistance = 11;
        int numberOfDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        } else {
            if (deliveryDistance > 60) {
                System.out.println("Потребуется дней " + (numberOfDays + 2));
            } else if (deliveryDistance > 20) {
                System.out.println("Потребуется дней " + (numberOfDays + 1));
            } else if (deliveryDistance > 0) {
                System.out.println("Потребуется дней " + numberOfDays);
            }
        }
        System.out.println();
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого времени года не существует");
        }
    }
}
