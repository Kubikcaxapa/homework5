//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Задача 1
    int clientOS = 0;
    switch (clientOS) {
        case 0:
            System.out.println("Установите версию приложения для IOS по ссылке");
            break;
        case 1:
            System.out.println("Установите версию для Android по ссылке");
            break;
        default:
            System.out.println("Приложение не поддерживается на вашей ОС");
    }
    //Задача 2
    int clientDeviceYear = 2014;
    switch (clientOS) {
        case 0:
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию для IOS по ссылке");
            } else {
                System.out.println(" Установите облегченную версию для IOS по ссылке");
            }
            break;
        case 1:
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию для Android");
            }
    }

    //Задача 3
    int year = 2021;
    boolean x;
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
        x = true;
        System.out.println(year +  " год является високосным");
    }  else {
        x = false;
        System.out.println(year + " не является високосным");  }
    //Зачада 4
    int deliveryDistance = 95;
    if (deliveryDistance < 20) {
        System.out.println("Потребуется сутки");
    }
    else if ((deliveryDistance >= 20 && (deliveryDistance < 60))) {
        System.out.println("Потребуются 2 дня");
    }
    else if ((deliveryDistance >= 60 && (deliveryDistance < 100))) {
        System.out.println("Потребуется 3 дня");
    } else {
        System.out.println("Доставки нет");
    }
    //Задача 5
    int monthNumber = 12;
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Сейчас зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Сейчас весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Сейчас лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Сейчас осень");
        default:
            System.out.println("Неправильно набран месяц");
    }
}