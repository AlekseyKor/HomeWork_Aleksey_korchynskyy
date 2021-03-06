package hometask6.animals;

import hometask6.GetInfo;
import hometask6.WildAnimal;

public class Wolf extends WildAnimal implements GetInfo {

    public Wolf(boolean isPredator, int id, int age, double weight, String color) {
        super(isPredator, id, age, weight, color);
    }

    @Override
    public String voice(){
        System.out.println("Wolf");
        return super.voice() + " Awoooooooooo!";
    }


    @Override
    public void info() {
        System.out.println("ID : " + getId());
        System.out.println("Age : " + getAge());
        System.out.println("Weight : " + getWeight() + " kg");
        System.out.println("Color : " + getColor());
        System.out.println("Predator : " + isPredator());
    }
}
