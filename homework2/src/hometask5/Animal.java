package hometask5;

import java.awt.*;

abstract public class Animal {



    private int id;
    private int age;
    private int weight;
    private String color;

    public Animal(int id, int age, int weight, String color){
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    // Сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String voice(){

        String animalVoice = "Hello, ";

        return animalVoice;
    }


}
