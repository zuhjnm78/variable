public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }
    public static void task1 (){

        System.out.println("Задача 1");

        // Пишем код для задачи 1

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2 (){

        System.out.println("Задача 2");

        // Пишем код для задачи 2

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);



    }

    public static void task3 () {

        System.out.println("Задача 3");

        // Пишем код для задачи 3

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


    }

    public static void task4 (){

        System.out.println("Задача 4");

        // Пишем код для задачи 4

        var friend = 19;

        friend +=2;

        System.out.println(friend);

        friend /=7;

        System.out.println(friend);

    }

    public static void task5 (){

        System.out.println("Задача 5");

        // Пишем код для задачи 5

        var frog = 3.5;
        frog *= 10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
    }
    public static void task6() {

        System.out.println("Задача 6");

        // Пишем код для задачи 6

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;

        System.out.println("Общий вес двух бойцов = " + totalWeight +" " + "кг.");

        var differenceWeight = weightBoxer2 - weightBoxer1;

        System.out.println("Разница веса двух бойцов = " + differenceWeight +" " + "кг.");



    }

    public static void task7 () {

        System.out.println("Задача 7");

        // Пишем код для задачи 7

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;

        var differenceWeight1 = weightBoxer2 - weightBoxer1;

System.out.println("Первый вариант - вычитание");
        System.out.println("Разница веса двух бойцов = " + differenceWeight1 +" " + "кг.");

        var differenceWeight2 = weightBoxer2 % weightBoxer1;
        System.out.println("Второй вариант - остаток от деления");

        System.out.println("Разница веса двух бойцов = " + differenceWeight2 +" " + "кг.");

    }

    public static void task8 () {

        System.out.println("Задача 8");

        // Пишем код для задачи 8.

        var totalWorkingHours = 640;
        var workingHours = 8;
        var Employees = totalWorkingHours / workingHours;

        System.out.println("Всего работников в компании - " + Employees + " человек.");

        Employees += 94;

        var newWorkingHours = totalWorkingHours / Employees;

        System.out.println("Если в компании работает  " + Employees + " человека, то всего " + newWorkingHours + " часа работы может быть " +
                "поделенно между сотрудниками.");


    }


}