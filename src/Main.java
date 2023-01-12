import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //First task
        /*
        Напишите метод, который возвращает меньшее из 2 чисел и выводит результат в консоль.
        Например, из двух чисел 8 и 4 метод должен вывести в консоль 4.
        */

        System.out.println("Задание 1:");


        int a1 = getRandomNumber(0, 10);
        int b1 = getRandomNumber(0, 10);

        int min1 = Math.min(a1, b1);

        System.out.println("Минимальное из " + a1 + " и " + b1 + " - " + min1);
        System.out.println();

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

        int[] numbers2 = new int[5];

        getRandomArray(numbers2, 0, 10);

        for (int i : numbers2) {
            System.out.println(checkIfEven(i));
        }
        System.out.println();

        //Third task
        /*
        Напишите метод, который возводит число в квадрат.
        */

        System.out.println("Задание 3:");

        int[] numbers3 = new int[5];

        getRandomArray(numbers3,0,10);

        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = square(numbers3[i]);
        }

        System.out.println(Arrays.toString(numbers3));

        System.out.println();

        //Fourth task
        /*
        Напишите метод, который возводит число в куб.
        */

        int[] numbers4 = new int[5];

        getRandomArray(numbers4,0,10);

        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = cube(numbers4[i]);
        }

        System.out.println(Arrays.toString(numbers4));



    }


    public static int cube(int n)
    {
        return (int)Math.pow(n,3);
    }
    public static void getRandomArray (int[] arr, int min, int max)

    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber(min, max);
            System.out.println(arr[i]);
        }
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