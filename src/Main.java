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
    //Задача 4
    int aga = 3;
    if (aga > 2 && aga < 6) {
        System.out.println("Eсли возраст человека равен " + aga + " то он должен ходить в детский сад");
    } else if (aga > 7 && aga < 17) {
        System.out.println("Если возраст человека равен "+ aga + " то он должен ходить в школу");
    } else if (aga >= 18 && aga <= 24) {
        System.out.println("Если возвраст человека равен "+ aga + " то он должен ходит в университет");
    } else if (aga > 24) {
        System.out.println("Если человеку больше "+ aga + " то он должен ходить на работу");
    }
    //Задача 4
    int baby = 15;
    if (baby < 5) {
        System.out.println("если возраст ребенка равен " + baby + " то ему нельзя кататься на аттракционе");
    } else if (baby > 5 && baby <= 14) {
        System.out.println("если возраст ребенка равен " + baby + " то ему можно кататься на аттракционе в сопровождении взрослого");
    } else if (baby > 14) {
        System.out.println("если возраст ребенка равен " + baby + " то ему можно кататься на аттракционах без сопровождения взрослого");
    }
    //Задача 6
    int vagon = 60;
    if (vagon <= 60) {
        System.out.println("если человек по счету " + vagon + " то есть сидячие места" );
    } else if (vagon <= 102) {
        System.out.println("если человек по счету "+ vagon + " то есть стоячее места");
    } else if (vagon > 102) {
        System.out.println("если человек по счету "+ vagon +  " то мест в вагоне нет");
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

