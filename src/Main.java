//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Задача 1
    int age = 16;
    if (age >= 18) {
        System.out.println("если возраст человека равен " + age +" то он совершеннолетний");
    } else {
        System.out.println("если возраст человека равен " + age +" то он не достиг совершеннолетия, нужно немного подождать");
    }
    //Задача 2
    int temperature = 1;
    if (temperature < 5) {
        System.out.println("на улице холодно, нужно надеть шапку");
    } else {
        System.out.println("сегодня тепло, можно идти без шапки");
    }
    //Задача 3
    int speed = 60;
    if (speed > 60){
        System.out.println("если скорость "+ speed + " км/ч, то придеться заплатить штраф");
    } else {
        System.out.println("если скорость " + speed + " км/ч, то можно ездить спокойно");
    }
// Задача 4
    int personAge = 3;
    if (personAge >= 2 && personAge <= 6) {
        System.out.println("Если возраст человека равен " + personAge + " то он должен ходить в детский сад");
    } else if (personAge >= 7 && personAge <= 17) {
        System.out.println("Если возраст человека равен " + personAge + " то он должен ходить в школу");
    } else if (personAge >= 18 && personAge <= 24) {
        System.out.println("Если возраст человека равен " + personAge + " то он должен ходить в университет");
    } else if (personAge > 24) {
        System.out.println("Если человеку больше " + personAge + " то он должен ходить на работу");
    }

// Задача 5
    int childAge = 15;
    if (childAge < 5) {
        System.out.println("если возраст ребенка равен " + childAge + " то ему нельзя кататься на аттракционе");
    } else if (childAge >= 5 && childAge <= 14) {
        System.out.println("если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе в сопровождении взрослого");
    } else if (childAge > 14) {
        System.out.println("если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционах без сопровождения взрослого");
    }

// Задача 6
    int vagon = 60;
    if (vagon < 60) {
        System.out.println("если человек по счету " + vagon + " то есть сидячие места");
    } else if (vagon < 102) {
        System.out.println("если человек по счету " + vagon + " то есть стоячие места");
    } else {
        System.out.println("если человек по счету " + vagon + " то мест в вагоне нет");
    }

    //Задача 7
    int firstNumber = 1;
    int secondNumber = 2;
    int thirdNumber = 3;
    if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
        System.out.println("большее число " + firstNumber);
    } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
        System.out.println("большее число " + secondNumber);
    } else {
        System.out.println("большее число " + thirdNumber);
    }
}

