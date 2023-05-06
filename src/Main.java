import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2023;
        int clientOS = 0;
        int clientDeviceYear = 2013;
        int deliveryDistance = 61;
        boolean checkYearResult = checkYear(year);
        yearResult(checkYearResult, year);
        checkDevice(clientOS, clientDeviceYear);
        int totalDaysDelivery = checkDistance(deliveryDistance);
        deliveryResult(totalDaysDelivery);
    }
    public static boolean checkYear(int getYear) {
        System.out.println("Задача 1");
        boolean checkYear;
        checkYear = (getYear % 4 == 0 && getYear % 100 != 0) || (getYear % 400 == 0);
        return checkYear;
    }

    public static void yearResult(boolean checkYearResult, int year) {
        if (checkYearResult) {
            System.out.println("Год " + year + " високосный год");
        } else {
            System.out.println("Год " + year + " не високосный год");
        }
    }

    public static void checkDevice(int getOS, int getDeviceYear) {
        System.out.println("Задача 2");
        if (getOS == 0) {
            if (getDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (getOS == 1) {
            if (getDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static int checkDistance(int getDistance) {
        System.out.println("Задача 3");
        int checkDistance = 0;
        if (getDistance <=20) {
            checkDistance += 1;
        } else if (getDistance <= 60) {
            checkDistance += 2;
        } else if (getDistance <= 100) {
            checkDistance += 3;
        }
        return checkDistance;
    }

    public static void deliveryResult(int getTotalDaysDelivery) {
        if (getTotalDaysDelivery > 0) {
            System.out.println("Потребуется дней: " + getTotalDaysDelivery);
        } else {
            System.out.println("Доставка невозможна.");
        }
    }
}