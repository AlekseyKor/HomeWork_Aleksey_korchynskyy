package hometask3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {

        //oddNumbersFrom1To99();
        //factorialN();
        //oddNumbersFrom1To99While();
        //factorialNWhile();
        //oddNumbersFrom1To99DoWhile();
        //factorialNDoWhile();
        //degreeXN();
        //sequence();
        //multiplicationTable();
        //oddArray();
        //lowestElementOfArray();
        //highestElementOfArray();
        swapPositionInArray();
        //averageInArray();
        //chessBoard();

    }

    //При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    public static void oddNumbersFrom1To99(){
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0)System.out.println(i);
        }
    }

    //Дано число n при помощи цикла for посчитать факториал n!
    public static void factorialN(){

        int n = 10;
        int factorial = 1;

        for (int i = 1; i < n + 1; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }

    }

    //Перепишите программы с использованием цикла while.
    public static void oddNumbersFrom1To99While(){

        int i = 0;

        while (i < 100){
            if (i%2 != 0)System.out.println(i);
            i++;
        }

    }
    public static void factorialNWhile(){

        int i = 1;
        int n = 10;
        int factorial = 1;

        while (i < n+1){
            factorial = factorial * i;
            System.out.println(factorial);
            i++;
        }

    }

    //Перепишите программы с использованием цикла do - while.
    public static void oddNumbersFrom1To99DoWhile(){

        int i = 0;

        do {

            if (i%2 != 0)System.out.println(i);
            i++;

        }while(i < 100);

    }
    public static void factorialNDoWhile(){

        int i = 1;
        int n = 10;
        int factorial = 1;

        do {
            factorial = factorial * i;
            System.out.println(factorial);
            i++;

        }while (i < n+1);

    }

    //Даны переменные x и n вычислить x^n.
    public static void degreeXN(){

        int x = 3;
        int n = 6;
        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        System.out.println(result);

    }

    //Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void sequence(){

        int a = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            a = a - 5;

        }

    }

    //Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
    public static void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, таблицу умножения которого хотите увидеть:");
        int x = scanner.nextInt();

        for (int i = 1; i < 11; i++) {

            System.out.println(x + " * " + i + " = " + (x * i));

        }

    }

    //Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
    public static void oddArray(){

        int[] array = new int[10];
        int a = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0){
                array[a] = i;
                a++;
            }
        }
        for (int i: array) {
            //условие для того чтобы в конце не было запятой
            if (i == array[a-1]){
                System.out.print("[" + i + "]");
            }else System.out.print("[" + i + "], ");
        }
    }

    //Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
    public static void lowestElementOfArray(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какого размера массив?");
        int n = scanner.nextInt();

        int[] array = new int[n];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() *10);
        }

        for(int i : array){
            if(i < min) min = i;

            System.out.print("[" + i + "]");
        }
        ArrayList even = new ArrayList();
        for(int i : array){
            if(min == i) even.add(i);
        }
        System.out.println();
        System.out.println("Наименьший элемент в массиве: " + even);

    }

    //В массиве из задания 9. найти наибольший элемент.
    public static void highestElementOfArray(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какого размера массив?");
        int n = scanner.nextInt();

        int[] array = new int[n];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() *10);
        }

        for(int i : array){
            if(i > max) max = i;

            System.out.print("[" + i + "]");
        }

        ArrayList even = new ArrayList();
        for(int i : array){
            if(max == i) even.add(i);
        }
        System.out.println();
        System.out.println("Наибольший элемент в массиве: " + even);

    }

    //Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
    public static void swapPositionInArray(){

        int[] array = {1, 2, -2, 6, 0, 4};
        int max = array[0];
        int min = array[0];


        for(int i : array){
            if(i > max) max = i;
            if(i < min) min = i;

            System.out.print("[" + i + "]");
        }
        System.out.println();
        System.out.println("Максимальное значение = [" + max + "]");
        System.out.println("Минимальное значение = [" + min + "]");

        for (int i : array){
            if(i == max) {
                i = min;
            }else if(i == min) i = max;

            System.out.print("[" + i + "]");
        }
    }

    //Найти среднее арифметическое всех элементов массива.
    public static void averageInArray(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какого размера массив?");
        int n = scanner.nextInt();

        int[] array = new int[n];

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() *10);
            System.out.print("[" + array[i] + "]");
        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double a =(double) sum / array.length;

        System.out.println();
        System.out.println("среднее арифметическое = " + a);

    }

    //(*)Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)
    public static void chessBoard(){

        char[][] chess = new char[8][8];

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {

                if ((i + j) % 2 == 0){          // Если сумма координат после деления по модулю не будет давать остаток,
                    chess[i][j] = 'W';          // то значение будет W
                }else chess[i][j] = 'B';        // А если наоборот то B
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

    }

}
