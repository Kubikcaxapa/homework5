//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Задача 1
    int age = 16;
    if (age >= 18) {
        System.out.println("Если возраст человека равен " + age +", то он совершеннолетний");
    } else {
        System.out.println("Если возраст человека равен " + age +", то он не достиг совершеннолетия, нужно немного подождать");
    }
    //Задача 2
    int temperature = 1;
    if (temperature < 5) {
        System.out.println("На улице " + temperature+ " градусов, нужно надеть шапку");
    } else {
        System.out.println("На улице " + temperature+ " градусов, можно идти без шапки");
    }
    //Задача 3
    int speed = 60;
    if (speed > 60){
        System.out.println("Если скорость "+ speed + " км/ч, то придеться заплатить штраф");
    } else {
        System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
    }
    //Задача 4
    age = 3;
    if (age >= 2 && age <= 6) {
        System.out.println("Eсли возраст человека равен " + age + ", то нужно ходить в детский сад");
    } else if (age >= 7 && age <=17) {
        System.out.println("Если возраст человека равен "+ age + ", то нужно ходить в школу");
    } else if (age >= 18 && age <= 24) {
        System.out.println("Если возвраст человека равен "+ age + ", то нужно ходит в университет");
    } else if (age > 24) {
        System.out.println("Если человеку больше "+ age + ", то нужно ходить на работу");
    }
    //Задача 5
    int baby = 15;
    if (baby < 5) {
        System.out.println("Если возраст ребенка равен " + baby + ", то ему нельзя кататься на аттракционе");
    } else if (baby >= 5 && baby <= 14) {
        System.out.println("Если возраст ребенка равен " + baby + ", то ему можно кататься на аттракционе в сопровождении взрослого");
    } else if (baby > 14) {
        System.out.println("Если возраст ребенка равен " + baby + ", то ему можно кататься на аттракционе без сопровождения взрослого");
    }
    //Задача 6
    int vagon = 60;
    if (vagon > 0 && vagon <= 60) {
        System.out.println("Если человек по счету " + vagon + ", то есть сидячее место");
    } else if (vagon > 60 && vagon <= 102) {
        System.out.println("Если человек по счету " + vagon + ", то есть стоячее место");
    } else {
        System.out.println("Если человек по счету " + vagon + ", то мест в вагоне нет");
    }

    //Задача 7
    int firstNumber = 1;
    int secondNumber = 2;
    int thirdNumber = 3;
    if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
        System.out.println("Большее число " + firstNumber);
    } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
        System.out.println("Большее число " + secondNumber);
    } else {
        System.out.println("Большее число " + thirdNumber);
    }
}
