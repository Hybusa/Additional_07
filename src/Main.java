import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

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
        task9();
    }

    public static void task1() {

        //First task
        /*
        Напишите метод, который возвращает меньшее из 2 чисел и выводит результат в консоль.
        Например, из двух чисел 8 и 4 метод должен вывести в консоль 4.
        */

        System.out.println("Задание 1:");


        int a = getRandomNumber(0, 10);
        int b = getRandomNumber(0, 10);

        int min = Math.min(a, b);

        System.out.println("Минимальное из " + a + " и " + b + " - " + min);
        System.out.println();

    }

    public static void task2() {
        //Second task
        /*
        Напишите метод, который проверяет, является ли число четным или нет и возвращает
        true или false в консоль в результате операции.
        Например:
        - Число 4 является четным, метод возвращает true
        - Число 5 не является четным, метод возвращает false
        - Число 6 является четным, метод возвращает true
        - и т.д.
        */

        System.out.println("Задание 2:");

        int[] numbers = new int[5];

        getRandomArray(numbers, 0, 10);

        for (int i : numbers) {
            System.out.println(checkIfEven(i));
        }
        System.out.println();
    }

    public static void task3() {
        //Third task
        /*
        Напишите метод, который возводит число в квадрат.
        */

        System.out.println("Задание 3:");

        int[] numbers = new int[5];

        getRandomArray(numbers, 0, 10);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = square(numbers[i]);
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println();
    }

    public static void task4() {
        //Fourth task
        /*
        Напишите метод, который возводит число в куб.
        */
        System.out.println("Задание 4:");

        int[] numbers = new int[5];

        getRandomArray(numbers, 0, 10);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = cube(numbers[i]);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println();
    }

    public static void task5() {
        //Fifth task
        /*
        Напишите метод, который возвращает в консоль true,
        если число больше или равно 10 и false, если число меньше 10.
        */

        System.out.println("Задание 5:");

        int[] numbers = new int[5];

        getRandomArray(numbers, 0, 20);
        boolean[] check = new boolean[5];

        for (int i = 0; i < numbers.length; i++) {
            check[i] = checkTen(numbers[i]);
        }

        System.out.println(Arrays.toString(check));
        System.out.println();
    }

    public static void task6() {
        //Sixth task
        /*
        Напишите  метод, который сортирует массив чисел по возрастанию любым способом.
        Выведите результат сортировки в консоль.
        */
        System.out.println("Задание 6:");

        int[] numbers = new int[5];

        getRandomArray(numbers, 0, 100);

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println();

    }

    public static void task7() {

        System.out.println("Задание 7:");

        double[] doubleArr = new double[5];

        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = getRandomDouble(-9, 9);
        }

        System.out.println(Arrays.toString(doubleArr));
        System.out.println();

    }

    public static void task8() {

        System.out.println("Задание 8:");

        int num = 5;

        int[] intArr = new int[5];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = getRealNum(-num, num);
        }

        System.out.println(Arrays.toString(intArr));
        System.out.println();

    }

    public static void task9() {

        System.out.println("Задание 9:");

        double[] doubleArr = new double[5];

        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = getRandomDouble(0, 100);
        }

        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = roundUp(doubleArr[i]);
        }

        System.out.println(Arrays.toString(doubleArr));
        System.out.println();

    }

    public static double roundUp(double n) {
        return Math.round(n);
    }

    public static int getRealNum(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public static double getRandomDouble(int min, int max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    public static boolean checkTen(int n) {

        boolean check = true;
        if (n >= 10)
            check = true;
        else if (n < 10)
            check = false;

        return check;
    }

    public static int cube(int n) {

        return (int) Math.pow(n, 3);
    }

    public static void getRandomArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber(min, max);
        }
        System.out.println(Arrays.toString(arr));
    }


    public static int getRandomNumber(int min, int max) {

        return (int) ((Math.random() * (max - min)) + min);
    }

    public static boolean checkIfEven(int n) {

        return n % 2 == 0;
    }

    public static int square(int n) {

        return (int) Math.pow(n, 2);
    }
}