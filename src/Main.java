public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача № 1");
        int peopleAge = 19;
        if (peopleAge >= 18) {
            System.out.println("Если возраст человека равен " + peopleAge + ", он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + peopleAge + ", он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2() {
        System.out.println("Задача № 2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }
    public static void task3() {
        System.out.println("Задача № 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость "+ speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость "+ speed + " можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача № 4");
        int age = 25;
        if (age >= 2 && age < 6) {
            System.out.println("Если человеку " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если человеку " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если человеку " + age + ", то его место в университете");
        } else if (age > 24) {
            System.out.println("Если человеку " + age + ", то ему пора ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача № 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача № 6");
        int totalPeople = 50;
        int oneVagonCapacityPeople = 102;
        int vagonSeatingPlaces = 60;
        int vagonStandingPlaces = oneVagonCapacityPeople - vagonSeatingPlaces;
        int totalSeatingPlaces = vagonSeatingPlaces - totalPeople;
        int totalStandingPlaces = oneVagonCapacityPeople - totalPeople;

        if (totalPeople < 60) {
            System.out.println("Если всего людей " + totalPeople + " в вагоне есть " + totalSeatingPlaces + " сидячиx и " + vagonStandingPlaces + " стоячиx места.");
        } else if (totalPeople >=60 && totalPeople < 102) {
            System.out.println("Если всего людей " + totalPeople + " в вагоне нет сидячих мест, а стоячих " + totalStandingPlaces);
        } else if (totalPeople >= oneVagonCapacityPeople) {
            System.out.println("Если всего людей " + totalPeople + " вагон уже полностью забит.");
        }
    }
    public static void task7() {
        System.out.println("Задача № 7");
        int one = 16;
        int two = 20;
        int three = 16;
        if (three > one && three >= two) {
            System.out.println("Число " + three + ", большее из трех чисел.");
        } else if (one > two && one >= three) {
            System.out.println("Число " + one + ", большее из трех чисел.");
        } else if (two > one && two >= three) {
            System.out.println("Число " + two + ", большее из трех чисел.");
        } else {
            System.out.println("Все числа равны");
        }
    }
}
