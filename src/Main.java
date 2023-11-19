public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача 1");

        byte clientOS = 1; //0 — iOS, 1 — Android
        String message;
        message = clientOS == 0 ? "Установите версию приложения для iOS по ссылке" : "Установите версию приложения для Android по ссылке";
        System.out.println(message);

        System.out.println();
        System.out.println("Задача 2");

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            message = "Установите облегченную версию приложения для iOS по ссылке";
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            message = "Установите облегченную версию приложения для Android по ссылке";
        }
        System.out.println(message);

        System.out.println();
        System.out.println("Задача 3");

        int year = 2021;
        int divisionRemainder = year % 4;
        if (year >= 1584 && divisionRemainder == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
        System.out.println("Задача 4");

        int deliveryDistance = 95;

        int deliveryWithinUpTo20km = 1;
        int deliveryWithin20kmTo60km = 2;
        int deliveryWithin60kmTo100km = 3;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryWithinUpTo20km);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + deliveryWithin20kmTo60km);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryWithin60kmTo100km);
        } else {
            System.out.println("Свыше 100 км доставки нет");
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
                System.out.println("Месяца с таким номером нет!");
        }
    }
}