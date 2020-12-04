package hometask6;

public class Animal {

    private int id;
    private int age;
    private double weight;
    private String color;

    public Animal(int id, int age, double weight, String color){
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

    public double getWeight() {
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

}
