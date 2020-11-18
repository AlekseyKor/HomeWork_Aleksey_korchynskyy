package hometask2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class HomeTask2 {

    public static void main(String[] args) {

        while(true){

            byte task;
            byte back;
            Scanner switchTask = new Scanner(System.in);
            Scanner goBack = new Scanner(System.in);

            System.out.println("Какое задание хотите посмотреть? [1, 2, 3]");
            task = switchTask.nextByte();

            switch (task){
                case 1:
                    averageOfAAndB();
                    System.out.println("1.Назад 2.Выключить");
                    back = goBack.nextByte();
                    if (back == 1){
                        break;
                    }else if (back == 2){
                        return;
                    }
                case 2:
                    averageOfArray();
                    System.out.println("1.Назад 2.Выключить");
                    back = goBack.nextByte();
                    if (back == 1){
                        break;
                    }else if (back == 2){
                        return;
                    }
                case 3:
                    bankPercentage();
                    System.out.println("1.Назад 2.Выключить");
                    back = goBack.nextByte();
                    if (back == 1){
                        break;
                    }else if (back == 2){
                        return;
                    }
            }
        }
    }


    public static  void averageOfAAndB(){
        int a = 4;
        int b = 6;
        int c = (a + b) / 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("среднее арифметическое = " + c);
        System.out.println("===========================================");
    }

    public static void averageOfArray(){

        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(6);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(8);
        numbers.add(12);
        numbers.add(10);

        System.out.println(numbers);

        int sum = 0;

        for (int i = 0; i <numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        int a = sum / numbers.size();

        System.out.println("среднее арифметическое = " + a);
        System.out.println("===========================================");
    }

    public static final String FORMAT_DOUBLE = "#0.00";

    public static void bankPercentage(){

        double money;
        double percent = 0;
        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада");
        money = scanner.nextDouble();

        boolean isCorrect = true;

        while (isCorrect){

            System.out.println("Под какой процент?");
            System.out.println("В нашем банке процент от 1 до 18");
            percent = scanner.nextDouble();
            if (percent < 1 || percent > 18){
                isCorrect = true;
            }else break;
        }

        System.out.println("На сколько лет?");
        year = scanner.nextInt();

        for (int i = 0; i < year; i++) {
            money = money + ((money/100) * percent);
        }

        // Убираем лишние цифры после запятой
        String formattedMoney = new DecimalFormat(FORMAT_DOUBLE).format(money);
        System.out.println("После этого у вас будет " + formattedMoney + " гривен");
    }
}
