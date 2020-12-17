package hometask9;


import java.util.ArrayList;

public class LinkedMain {
    public static void main(String[] args) {

        LinkedCollection<String> a1 = new LinkedCollection<String>();

        a1.add("1");
        a1.add("2");
        a1.add("3");
        a1.add("4");
        a1.add("5");

        LinkedCollection<String> a2 = new LinkedCollection<String>();
        // Добавление
        a2.add("1");
        a2.add("2");
        a2.add("3");
        a2.add("5");


        System.out.println("a1 = " + a1.toString());
        System.out.println("a1 size = " + a1.size());

        System.out.println("---------------------");
        //Удаление по индексу и значению
        a1.delete(3);
        a1.delete("1");
        a2.delete("1");
        System.out.println("a1 = " + a1.toString());
        System.out.println("a1 size = " + a1.size());

        System.out.println("---------------------");
        // Проверка на содержание в элементе значения
        System.out.println("a1 contains 3 ---> " + a1.contains("3"));

        System.out.println("---------------------");
        // Сравнение двух коллекций
        System.out.println("a1 = " + a1.toString());
        System.out.println("a2 = " + a2.toString());
        System.out.println("a1 == a2 ---> " + a1.compare(a2));

        System.out.println("---------------------");
        // Чистка
        System.out.println("a2 size = " + a2.size());
        //a2.clear();
        System.out.println("a2 size = " + a2.size());

        System.out.println("---------------------");
        // Добавление всего массива
        String[] a3 = {"11", "22", "33", "44"};
        System.out.println(a1);
        a1.addAll(a3);
        System.out.println(a1);

        System.out.println("---------------------");
        // Добавление всей коллекции
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        a1.addAll(a2);
        System.out.println("a1 = " + a1);
    }
}
